package com.tom.java;

/**
 * ClassName: Demo
 * Description:
 *
 * @author Mi_dad
 * @date 2019/11/26 22:25
 */
public class Demo {
    public static void main(String[] args) {
        //动态绑定技术
        //在运行过程中，调用对象的成员方法，JVM会将当前调用的方法和对象的实际内存进行绑定
        //成员属性没有动态绑定技术，在哪里声明，在哪里使用
        A a = new B();
        System.out.println(a.sum());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return getI() + 20;
    }

    public int getI(){
        return i;
    }
}
