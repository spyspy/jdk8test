package com.test.jdk8;

public class jdk8test001{
    public static void main(String[] args) {
        System.out.println("this is a test  中文測試");
        //Traditional one
        GoInterface wow = new GoInterface();
        wow.testFun(new MyInterface() {
            @Override
            public void testFuntion() {
                System.out.println("Override Running");
            }
        });
        // Lambda Expresstion
        // 沒參數的時後  () 不能省略
        wow.testFun(()->{
            System.out.println("Lambda Runing");
        });

        MyInterface myInterface = ()->{
            System.out.println("oo");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
        System.out.println(myInterface.getClass().getInterfaces().length);

    }
}

class GoInterface{

    void testFun(MyInterface myInterface){
        System.out.println("no1");
        myInterface.testFuntion();
        System.out.println("no2");
    }
}