package com.qinyixuan.demo;

import java.text.SimpleDateFormat;

/**
 * Created by QinYiXuan on 2017/3/8.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
    }
}
