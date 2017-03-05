package design.proxy;

/**
 * Created by maxiaodong on 2017/3/5.
 * 2.真实主题类
 */
public class Admin implements Manage{

    @Override
    public void doSomeThing() {
        System.out.println("Admin doSomeThings");
    }
}
