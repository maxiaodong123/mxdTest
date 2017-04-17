package design.adapter;

import java.util.Map;

/**
 * 类适配器
 * Created by maxiaodong on 2017/4/17.
 *
 * 使用了适配器模式只修改了一句话，其他的业务逻辑都不用修改就解决了系统对接的问题，
 * 而且在我们实际系统中只是增加了一个业务类的继承，就实现了可以查本公司的员工信息，
 * 也可以查人力 资源公司的员工信息，尽量少的修改，通过扩展的方式解决了该问题。
 * 适配器模式分为类适配器和对象适配器，这个区别不大，上边的例子就是类适配器
 */
@SuppressWarnings("all")
public class OuterUserInfo extends OutUser implements IUserInfo{

    private Map infoMap = super.getUserInfo();
    /**
     * 姓名
     *
     * @return
     */
    @Override
    public String getName() {
        System.out.println("name~~~~~~");
        return (String) infoMap.get("name");
    }

    /**
     * 年龄
     *
     * @return
     */
    @Override
    public String getAge() {
        System.out.println("age~~~~~~");
        return (String) infoMap.get("age");
    }

    /**
     * 手机号
     *
     * @return
     */
    @Override
    public String getMobile() {
        System.out.println("mobile~~~~~~");
        return (String) infoMap.get("mobile");
    }
}
