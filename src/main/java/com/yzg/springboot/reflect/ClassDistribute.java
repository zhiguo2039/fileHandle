package com.yzg.springboot.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDistribute {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class c1 = Class.forName("com.yzg.springboot.reflect.Student");

        //获取类的名字(包名+类名)
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //获得类的属性，只能找到public定义
        Field[] fileds = c1.getFields();
        //可以找到全部的属性
        fileds = c1.getDeclaredFields();
        for(Field f : fileds){
            System.out.println(f);
        }
        //获得指定属性的值
//        Field name = c1.getDeclaredField("name");
//        System.out.println(name);

        //获得类的方法
        Method[] methods = c1.getMethods();
        for(Method m : methods){
            System.out.println("正常的" + m);
        }

        methods = c1.getDeclaredMethods();
        for(Method m : methods){
            System.out.println("DeclaredMethod" + m);
        }
        
        //获得指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

    }
}


