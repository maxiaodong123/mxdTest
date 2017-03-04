package design.singleton;

/**
 * Created by maxiaodong on 2017/3/4.
 * 登记式模式（holder）
 * 内部类只有在外部类被调用才加载，产生SINGLETON实例；又不用加锁。
 * 此模式有上述两个模式的优点，屏蔽了它们的缺点，是最好的单例模式。
 */
public class Singleton3 {

    private Singleton3() {} //构造方法是私有的，从而避免外界利用构造方法直接创建任意多实例。

    public static Singleton3 getInstance() {
        return Holder.SINGLETON;
    }
    private static class Holder {
        private static final Singleton3 SINGLETON = new Singleton3();
    }
}
