package com.ly.java;

import java.util.ArrayList;

//注释测试
public class HelloWorld {
    //模板一:psvm
    public static void main(String[] args) {
        //模板二:sout
//        System.out.println("hello");
        //拓展: soutp / soutm /soutv /xxx.sout
//        System.out.println("args = " + Arrays.deepToString(args));
//        System.out.println("HelloWorld.main");
        
        int num1 = 10;
        int num2 =20;
//        System.out.println("num1 = " + num1);
//        System.out.println(num1);

        //模板三：fori
        String[] arr =new String[]{"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }
    public void method(){
        System.out.println("HelloWorld.method");
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);
        if (list == null) {
            
        }
        //变形:inn
        if (list != null) {
            
        }
        //变形：xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
