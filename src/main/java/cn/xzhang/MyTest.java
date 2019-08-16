package cn.xzhang;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @description
 * @author:xzhang
 * @date:2019/8/15 16:36
 */
public class MyTest {
    public static void main(String[] args) {
        func1();
        User u=new User();
        u.setAge(13);
        int[] periods=new int[1];
        periods[0] = u.getAge();

        JSONObject json = new JSONObject();
        try {
            json.put("period",periods);
            json.put("max",6000);
            System.out.println(json.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void func1() {
        Map<String,String> param = new HashMap();
        param.put("key1","AA");
        param.put("key2","BB");
        param.put("key3","CC");
        System.out.println(JSON.toJSONString(param));
        System.out.println(JSONObject.toJSONString(param));
    }

}
