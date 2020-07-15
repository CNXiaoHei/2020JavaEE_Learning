package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:37
 **/
public abstract class Motor extends Vehicle {
    public Motor(String brand, int price) {
        super(brand, price);
    }
}

class Yamaha extends Motor {
    public Yamaha(String brand, int price) {
        super(brand, price);
    }

    @Override
    void run() {
        System.out.println("Yamaha启动，轰轰轰");
    }
}

class BmwMotor extends Motor {
    public BmwMotor(String brand, int price) {
        super(brand, price);
    }

    @Override
    void run() {
        System.out.println("BmwMotor启动，轰轰轰");
    }
}