package com.test.jdk8;

public class jdk8test003 {

    public static void main(String[] args) {
        // Two Functional interface Test
        TestInterface1 ti1 = ()->{};
        System.out.println(ti1.getClass());
        System.out.println(ti1.getClass().getSuperclass());
        System.out.println(ti1.getClass().getInterfaces()[0]);


    }
}

@FunctionalInterface
interface TestInterface1{
    void method1();
}

@FunctionalInterface
interface TestInterface2{
    void method2();
}
