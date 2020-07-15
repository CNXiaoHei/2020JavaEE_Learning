package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:15
 **/
public class Test {
    public static void main(String[] args) {
        Benz benz = new Benz("梅赛德斯奔驰",300000);
        Bmw bmw = new Bmw("宝马",280000);
        Yamaha yamaha = new Yamaha("雅马哈",80000);
        BmwMotor bmwMotor = new BmwMotor("宝马",100000);
        benz.run();
        bmw.run();
        bmw.GPS();
        yamaha.run();
        bmwMotor.run();
    }
}
