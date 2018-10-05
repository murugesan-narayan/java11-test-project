package com.muru.java.lambda;

import java.util.List;

public class FormalParameterVarType {

    public static void main(String[] args) {
        var list = List.of("o", "tw", "thr");

        // implicitly typed lambda expression
        System.out.println("implicitly typed lambda expression");
        list.stream().forEach((s) -> System.out.println("s.length() = " + s + ":" + s.length()));

        // formal var typed lambda expression
        System.out.println("\nformal var typed lambda expression");
        list.stream().forEach((var s) -> System.out.println("s.length() = " + s + ":" + s.length()));

        System.out.println("\nfrom for each loop");
        for (var a :
                list) {
            System.out.println("a = " + a);
        }

        //(var x, y) -> x.process(y)         // Cannot mix 'var' and 'no var' in implicitly typed lambda expression
        //(var x, int y) -> x.process(y)     // Cannot mix 'var' and manifest types in explicitly typed lambda expression
    }

}
