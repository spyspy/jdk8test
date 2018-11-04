package com.test.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class jdk8test002 {
    public static void main(String[] args) {
        // iterator
        List<String> list = new ArrayList<>();
        List<String> list2 = Arrays.asList("1","2","3","abc");
        for(String str : list2){
            System.out.println(str);

        }

        list2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("v2:"+s);
            }
        });

        list2.forEach(i -> System.out.println("v3"+i));

        // method reference
        list2.forEach(System.out::println);




    }
}
