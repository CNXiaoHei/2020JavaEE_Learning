package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:19
 **/
public abstract class Car extends Vehicle {
    public Car(String brand, int price) {
        super(brand, price);
    }
}

class Benz extends Car {
    public Benz(String brand, int price) {
        super(brand,price);
    }

    @Override
    void run() {
        System.out.println("Benz启动，轰轰轰");
    }
}

class Bmw extends Car implements GPS {
    public Bmw(String brand, int price) {
        super(brand,price);
    }

    @Override
    void run() {
        System.out.println("宝马启动，轰轰轰");
    }
}