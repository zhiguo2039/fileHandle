package com.yzg.springboot.reflect;

import java.lang.annotation.ElementType;

public class AllTypeClassTest {
    public static void main(String[] args) {
        //类
        Class c1 = Object.class;
        //接口
        Class c2 = Comparable.class;
        //一维数组
        Class c3 = String[].class;
        //二维数组
        Class c4 = int.class;
        //注解
        Class c5 = Override.class;
        //枚举
        Class c6 = ElementType.class;
        //基本数据类型
        Class c7 = Integer.class;
        //void
        Class c8 = void.class;
        //Class
        Class c9 = Class.class;

        //只要元素类型与维度一样就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
