package design.proxy;

/**
 * 聚合式静态代理
 * Created by maxiaodong on 2017/3/5.
 * 3.以聚合方式实现的代理主题
 *
 */
public class AdminPoly implements Manage{

    private Admin admin;

    public AdminPoly(Admin admin) {
        super();
        this.admin = admin;
    }


    @Override
    public void doSomeThing() {
        System.out.println("Log:admin操作开始");
        admin.doSomeThing();
        System.out.println("Log:admin操作结束");
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Manage manage = new AdminPoly(admin);

        manage.doSomeThing();
    }
}
