package com.casit;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月28日 15:13:00
 */
public class StringUtil {
    private static Map<String,String> map;
    public static Map dealString(String line){

        if(line.startsWith("OB")) {
            String[] ss=line.split("\\|");
            map = new HashMap();

            if(line.startsWith("OBX")) {
                //挑选出标签中含NM的BOX数据
                if(ss[2].equals("NM")) {
                    //获取key
                    String key = ss[3].split("\\^")[1];
                    //获取value
                    String value = ss[5];
                    map.put("key", key);
                    map.put("value", value);
                }
                //挑选出标签中含NA的BOX数据
                if(ss[2].equals("NA")) {
                    //获取key
                    String key = ss[3].split("\\^")[1];
                    //获取value
                    String value = ss[5];
                    map.put("key", key);
                    map.put("value", value);
                }
            }

            if(line.startsWith("OBR")) {
                //切割消息
                String[] sss=ss[3].split("\\^");
                //获取设备编号
                String key=sss[1];
                String value=sss[2];
                map.put("key",key);
                map.put("value",value);


            }

        }
        return map;
    }
}
