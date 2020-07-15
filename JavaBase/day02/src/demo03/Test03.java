package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 18:17
 **/
public class Test03 {
    public static void main(String[] args) {
        Cycle c1 = new Cycle(8.00);
        Juxing j1 = new Juxing(4.0,5.0);
        System.out.println(c1.area());
        System.out.println(c1.sumEdge());
        System.out.println(j1.area());
        System.out.println(j1.sumEdge());
    }

}

abstract class Jihe {
    abstract double area();
    abstract double sumEdge();
}

class Cycle extends Jihe {
    private double r;

    public Cycle() {
    }

    public Cycle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double sumEdge() {
        return Math.PI*2*r;
    }
}

class Juxing extends Jihe {
    private double longEdge;
    private double shortEdge;

    public Juxing() {
    }

    public Juxing(double longEdge, double shortEdge) {
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    @Override
    double area() {
        return 2*(longEdge+shortEdge);
    }

    @Override
    double sumEdge() {
        return longEdge*shortEdge;
    }
}