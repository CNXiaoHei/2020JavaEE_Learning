import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/11 17:55
 **/
public class StartMain {
    public static void main(String[] args) throws ParseException {
        run();
    }

    public static ArrayList<Student> arrList = new ArrayList<>();
    public static ArrayList<Teacher> arrListT = new ArrayList<>();
    public static int sID = 100000000;
    public static int tID = 900000000;
    static Scanner sc = new Scanner(System.in);

    //主运行方法
    private static void run() throws ParseException {
        boolean back = true;
        while (back) {
            System.out.println("欢迎进入校园信息管理系统");
            System.out.println("请选择要进入的模块：\n1.学生信息系统  2.教师信息系统   3.退出");
            switch (sc.nextInt()) {
                case 1:
                    studentSystem(arrList,sc);
                    break;
                case 2:
                    teacherSystem(arrListT,sc);
                    break;
                default:
                    back = false;
                    break;
            }
        }
    }

    //学生管理子系统
    private static void studentSystem(ArrayList<Student> stulist, Scanner sc) throws ParseException {
        boolean back = true;
        while (back) {
            System.out.println("请选择：\n1.查询学生信息 2.增加学生信息 3.修改学生信息 4.删除学生信息 5.返回上级菜单");
            switch (sc.nextInt()) {
                case 1:
                    inquireStudent(stulist,sc);
                    break;
                case 2:
                    addStudent(stulist,sc);
                    break;
                case 3:
                    modifyStudent(stulist,sc);
                    break;
                case 4:
                    removeStudent(stulist,sc);
                    break;
                default:
                    back = false;
                    break;
            }
        }
    }

    //查询全部学生信息      complete
    private static void inquireStudent(ArrayList<Student> stulist, Scanner sc) {
        if (stulist.size()==0) {
            System.out.println("无数据");
        }else {
            Utils.printArrayList(stulist);
        }
    }

    //修改信息          complete
    private static void modifyStudent(ArrayList<Student> stulist, Scanner sc) {
        /*
            1.输入ID进行查询，有该人进入下一步，查无此人则重新输入
            2.显示该人的信息，并询问需要修改哪一项
            3.进行修改
         */
        System.out.println("请输入您的ID：");
        int id = sc.nextInt();
        for (int i = 0; i < stulist.size(); i++) {
            Student stu = stulist.get(i);
            if (stu.getID()==id) {
                Utils.printPerson(stu);
                System.out.println("请输入要修改的选项：\n1.姓名 2.性别 3.生日");
                switch (sc.nextInt()) {
                    case 1 :
                        System.out.println("请输入要修改的姓名：");
                        stu.setName(sc.next());
                        break;
                    case 2:
                        System.out.println("请输入要修改的性别：");
                        stu.setSex(sc.next());
                        break;
                    case 3:
                        System.out.println("请输入要修改的生日：（输入格式 yyyy-MM-dd)");
                        stu.setBirth(sc.next());
                        break;
                    default:
                        System.out.println("输入错误");
                        System.out.println("没有查询到与" + id + "相关联的信息");
                        break;
                }

            }
        }
    }

    //增加信息          complete
    private static void addStudent(ArrayList<Student> stulist, Scanner sc) throws ParseException {
        //学生
        Student stu = new Student();
        System.out.println("请输入姓名：");
        stu.setName(sc.next());
        System.out.println("请输入性别：");
        stu.setSex(sc.next());
        System.out.println("请输入生日：（输入格式 yyyy-MM-dd)");
        stu.setBirth(sc.next());
        stu.setAge(stu.getBirth());
        stu.setID(sID); //定义学号
        sID++; //学号自增
        stulist.add(stu);
    }

    //删除信息          complete
    private static void removeStudent(ArrayList<Student> stulist, Scanner sc) {
        /*
            1.输入ID进行查询，有则继续，无则跳出
            2.显示信息，并确认用户是否删除
            3.删除
         */
        System.out.println("请输入ID查询您想要删除的学员");
        int id = sc.nextInt();
        for (int i = 0; i < stulist.size(); i++) {
            Student stu = stulist.get(i);
            if (stu.getID()==id) {
                Utils.printPerson(stu);
                System.out.println("删除确认：\ny.删除 n.取消");
                String confirm = sc.next();
                if (confirm=="y") {
                    stulist.remove(i);
                    System.out.println("删除成功！");
                } else if (confirm=="n") {
                    break;
                } else {
                    System.out.println("输入错误！");
                }
            }
        }
    }

    //教师管理子系统
    private static void teacherSystem(ArrayList<Teacher> tehlist, Scanner sc) throws ParseException {
        boolean back = true;
        while (back) {
            System.out.println("请选择：\n1.查询教师信息 2.增加教师信息 3.修改教师信息 4.删除教师信息 5.返回上级菜单");
            switch (sc.nextInt()) {
                case 1:
                    inquireTeacher(tehlist,sc);
                    break;
                case 2:
                    addTeacher(tehlist,sc);
                    break;
                case 3:
                    modifyTeacher(tehlist,sc);
                    break;
                case 4:
                    removeTeacher(tehlist,sc);
                    break;
                default:
                    back = false;
                    break;
            }
        }
    }

    //查询全部老师信息       complete
    private static void inquireTeacher(ArrayList<Teacher> tehlist, Scanner sc) {
        if (tehlist.size()==0) {
            System.out.println("无数据");
        }else {
            Utils.printArrayList(tehlist);
        }

    }

    //修改信息          complete
    private static void modifyTeacher(ArrayList<Teacher> tehlist, Scanner sc) {
        System.out.println("请输入您的ID：");
        int id = sc.nextInt();
        for (int i = 0; i < tehlist.size(); i++) {
            Teacher teh = tehlist.get(i);
            if (teh.getID()==id) {
                Utils.printPerson(teh);
                System.out.println("请输入要修改的选项：\n1.姓名 2.性别 3.生日");
                switch (sc.nextInt()) {
                    case 1 :
                        System.out.println("请输入要修改的姓名：");
                        teh.setName(sc.next());
                        break;
                    case 2:
                        System.out.println("请输入要修改的性别：");
                        teh.setSex(sc.next());
                        break;
                    case 3:
                        System.out.println("请输入要修改的生日：（输入格式 yyyy-MM-dd)");
                        teh.setBirth(sc.next());
                        break;
                    default:
                        System.out.println("输入错误");
                        break;
                }

            }
        }
        System.out.println("没有查询到与" + id + "相关联的信息");
    }

    //增加信息
    private static void addTeacher(ArrayList<Teacher> tehlist, Scanner sc) throws ParseException {
        //老师
        Teacher teh = new Teacher();
        System.out.println("请输入姓名：");
        teh.setName(sc.next());
        System.out.println("请输入性别：");
        teh.setSex(sc.next());
        System.out.println("请输入生日：（输入格式 yyyy-MM-dd)");
        teh.setBirth(sc.next());
        teh.setAge(teh.getBirth());
        teh.setID(tID); //定义学号
        sID++; //学号自增
        teh.setID(tID);
        tehlist.add(teh);
    }

    private static void removeTeacher(ArrayList<Teacher> tehlist, Scanner sc) {
        /*
            1.输入ID进行查询，有则继续，无则跳出
            2.显示信息，并确认用户是否删除
            3.删除
         */
        System.out.println("请输入ID查询您想要删除的学员");
        int id = sc.nextInt();
        for (int i = 0; i < tehlist.size(); i++) {
            Teacher teh = tehlist.get(i);
            if (teh.getID()==id) {
                Utils.printPerson(teh);
                System.out.println("删除确认：\ny.删除 n.取消");
                String confirm = sc.next();
                if (confirm=="y") {
                    tehlist.remove(i);
                    System.out.println("删除成功！");
                } else if (confirm=="n") {
                    break;
                } else {
                    System.out.println("输入错误！");
                }
            }
        }
    }
}
