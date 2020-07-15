package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:18
 **/
public abstract class Vehicle {
    private String brand;
    private int price;

    public Vehicle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    abstract void run();
}
