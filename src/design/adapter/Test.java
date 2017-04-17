package design.adapter;

/**
 * Created by maxiaodong on 2017/4/17.
 * 测试类
 */
public class Test {

    //psvm main方法的简写
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
//        UserInfo info = new UserInfo();

        IUserInfo info = new OuterUserInfo();
        for (int i =0;i<101;i++){

            System.out.println(info.getMobile());
        }
    }
}
