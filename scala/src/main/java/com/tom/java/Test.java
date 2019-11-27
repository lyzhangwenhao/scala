package com.tom.java;

/**
 * ClassName: Test
 * Description:
 *
 * @author Mi_dad
 * @date 2019/11/25 16:47
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

    }
}

class Person{
    private String name;

}
class Teacher extends Person{

}



//单例设计
class Singleton {
    private Singleton() {}
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}