package com.muru.java;

import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
        var test = " test string line 1\ntest string line 2";
        System.out.println("test = " + test);
        System.out.println("test.isBlank = " + test.isBlank());
        System.out.println("test.lines = " + test.lines().collect(Collectors.toList()));
        System.out.println("test.strip = " + test.strip());
    }
}
