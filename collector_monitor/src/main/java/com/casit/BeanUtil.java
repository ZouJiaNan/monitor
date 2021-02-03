package com.casit;

import java.lang.reflect.Field;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月03日 15:27:00
 */
public class BeanUtil {
    public static void setValue(Monitor monitor,String key,String value){
        try {
            if(!key.equals("MINDRAY_N-SERIES")) {
                //获取实体类字段
                Field field = Monitor.class.getDeclaredField(key);
                //开放权限
                field.setAccessible(true);
                //为该字段赋值
                field.set(monitor, value);
            }
            if(key.equals("MINDRAY_N-SERIES")){
                //获取实体类字段
                Field field = Monitor.class.getDeclaredField("MINDRAY_N_SERIES");
                //开放权限
                field.setAccessible(true);
                //为该字段赋值
                field.set(monitor, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
