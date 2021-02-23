package com.yzg.springboot.reflect;

/**
 * 加载完类之后，在堆内存的方法区就产生了一个class类型的对象
 * 反射：实例化对象-----》getClass()方法------》得到完整的"包类"名称
 * 功能：1、在运行时判断任意一个对象所属的类
 *      2、在运行时构造任意一个类的对象
 *      3、在运行时判断任意一个类具有的成员变量和方法
 *      4、在运行时获取范型细腻些
 *      5、在运行时调用任意一个对象的成员变量和方法
 *      6、在运行时处理注解
 *      7、生成动态代理
 * @author nari-yzg
 * @return
 * @date 2021/1/19 19:33
 */
public class GetReflect {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Person person = new Student();
        System.out.println("这个人是: " + person.name);

        //通过反射获取类的class对象
        Class c1 = Class.forName("com.yzg.springboot.reflect.Student");

        //forname获得
        Class c2 = person.getClass();

        System.out.println("这是一个newinstance======》" + c1.newInstance());

        System.out.println(c1);

        System.out.println(c2);
    }

}

class Person{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {

    public Student(){
        this.name = "这是一名学生";
    }
}

class Teacher extends Person {

    public Teacher(){
        this.name = "这是一名老师";
    }
}