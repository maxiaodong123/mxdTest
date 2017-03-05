package design.proxy;

/**
 * Created by maxiaodong on 2017/3/5.
 */
public class Car {

    public  void run(){
        System.out.println("car run");
    }

    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        Car t = (Car) proxy.getProxy(Car.class);
        t.run();
    }
}
