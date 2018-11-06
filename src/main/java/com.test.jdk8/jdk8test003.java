package com.test.jdk8;

import java.util.Arrays;
import java.util.List;

public class jdk8test003 {

    public static void main(String[] args) {
        // Two Functional interface Test
        TestInterface1 ti1 = ()->{};
        System.out.println(ti1.getClass());
        System.out.println(ti1.getClass().getSuperclass());
        System.out.println(ti1.getClass().getInterfaces()[0]);

        new Thread(()-> System.out.println("hello world")).start();

        List<String> list =  Arrays.asList("Test1","Test2","Test3");

        //list.forEach(it -> System.out.println(it.toUpperCase()));

        list.stream().map(it -> it.toUpperCase()).forEach(it-> System.out.println(it));
        list.stream().map(String::toUpperCase).forEach(it-> System.out.println(it));

        for(String str : list){
            System.out.println(str);
        }

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
