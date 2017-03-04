package design.singleton;

/**
 * Created by maxiaodong on 2017/3/4.
 *
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁synchronized 才能保证单例，（如果两个线程同时调用getInstance方法，会chuxia）但加锁会影响效率。
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){};

    public static synchronized Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
