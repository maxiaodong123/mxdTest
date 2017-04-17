package design.adapter;

/**
 * 用户信息对象实现类
 * Created by maxiaodong on 2017/4/17.
 */
public class UserInfo implements IUserInfo {


    @Override
    public String getName() {
        System.out.println("姓名～～～～");
        return null;
    }

    @Override
    public String getAge() {
        System.out.println("年龄～～～～");
        return null;
    }

    @Override
    public String getMobile() {
        System.out.println("手机号～～～～");
        return null;
    }
}
