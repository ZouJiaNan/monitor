package com.casit;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月13日 14:07:00
 */
public class Collector {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3500);
            System.out.println("监听端口号:3500");
            Map<String,String> map;
            Monitor monitor=new Monitor();
            int flag=0;
            while(true) {
                Socket s = ss.accept();
                InputStream inputStream=s.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
                String line=null;

                while ((line=bufferedReader.readLine())!=null){
                    //清洗数据
                    map=StringUtil.dealString(line);
                    if(map!=null) {
                        String key = map.get("key");
                        String value = map.get("value");
                        //System.out.println(key + ":" + value);
                        BeanUtil.setValue(monitor,key,value);
                        if(key.equals("MINDRAY_N-SERIES")){
                            flag++;
                        };
                        if(flag%2==0){
                            System.out.println(monitor);
                            flag=0;
                        }
                    }
                }
                System.out.println("流已结束");
                bufferedReader.close();
            }
        }catch (Exception e){
                e.printStackTrace();
        }
        }
}
