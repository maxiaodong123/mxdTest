package design.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部用户信息对象实现类
 * Created by maxiaodong on 2017/4/17.
 */
@SuppressWarnings("all")
public class OutUser implements IOutUser{
	@Override
    public Map getUserInfo() {
        Map info = new HashMap();

        info.put("name","zhangsan");
        info.put("age","20");
        info.put("mobile","18612253768");
        return info;
    }
}
