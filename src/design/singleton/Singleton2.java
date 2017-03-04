package design.singleton;

/**
 * Created by maxiaodong on 2017/3/4.
 * 懒汉式单例
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 */
public class Singleton2 {

    private static final Singleton2 SINGLETON = new Singleton2();

    private Singleton2() {}  //此类不能被实例化

    public static Singleton2 getInstance() {
        return SINGLETON;
    }
}
