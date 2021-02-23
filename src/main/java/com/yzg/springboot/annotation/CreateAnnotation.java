package com.yzg.springboot.annotation;

/**
 * 元注解：Java定义了4个标准的meta-annotation类型
 * 他们继承于java.lang包（@Target、@Retention、@Documented、@Inherited(TYPE、METHOD、PARAMETER、CONSTRUCTOR、LOCAL_VARIABLE、ANNOTATION_TYPE、PACKAGE、、）
 * @Target: 用于描述注解分范围（）
 * @Retention： 表示需要在什么级别保存改该注释信息，用于描述注解的生命周期（SOURCE<CLASS<RUNTIME）
 * @Documented： 说明该注解将被包含在javadoc中
 * @Inherited： 说明子类可以继承父类中的该注解
 * @author nari-yzg
 * @return
 * @date 2021/1/19 19:38
 */
public class CreateAnnotation {
}
