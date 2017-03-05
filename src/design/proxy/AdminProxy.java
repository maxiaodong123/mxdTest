package design.proxy;

/**
 * 继承式静态代理
 * Created by maxiaodong on 2017/3/5.
 * 4.继承式静态代理
 */
public class AdminProxy extends Admin{

    @Override
    public void doSomeThing() {

        System.out.println("Log:admin操作开始");
        super.doSomeThing();
        System.out.println("Log:admin操作开始");
    }

    public static void main(String[] args) {
        AdminProxy p = new AdminProxy();
        p.doSomeThing();
    }
}
