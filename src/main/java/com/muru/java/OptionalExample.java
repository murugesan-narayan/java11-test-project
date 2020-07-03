package com.muru.java;

import java.util.Optional;

/** Optional is a value-based class; use of identity-sensitive operations
(including reference equality (==), identity hash code, or synchronization)
on instances of Optional may have unpredictable results and should be avoided.*/
public class OptionalExample {
    public static void main(String[] args) {
        // Creating an empty optional
        Optional<String> empty = Optional.empty();
        System.out.println("empty = " + empty);

        // Creating an optional using of
        String name = "java";
        Optional<String> opt = Optional.of(name);
        System.out.println("opt = " + opt.orElse("default"));

        // Possible null value
        Optional<String> optional = Optional.ofNullable(name());
        System.out.println("optional = " + optional.isEmpty());

        // is present and is empty
        String js = "javaone";
        /*Optional<String> optional1 = Optional.of(js);
        Optional<String> optional12 = Optional.of(js);
        System.out.println(optional1.isPresent() && optional12.isEmpty());*/

        //if present
        Optional<String> optional13 = Optional.of(js);
        optional13.ifPresent(s -> System.out.println(s.length()));

        //get
        Optional<String> optional15 = Optional.of(js);
        //if (optional15.isPresent()){
            String value = optional15.get();
            System.out.println("value = " + value);
        //}

        /*String nullName = null;
        String nameL = Optional.ofNullable(name(nullName)).orElse("default_name");
        System.out.println("nameL = " + nameL);
        nameL = Optional.ofNullable(name("nullName")).orElse("default_name");
        System.out.println("nameL = " + nameL);

        String nameN = Optional.ofNullable(name("1nullName")).orElseGet(() -> "john");
        System.out.println("nameN = " + nameN);*/

/*        String text = null;
        String defaultText = Optional.ofNullable(text).orElseGet(OptionalExample::getDefaultValue);
        System.out.println("defaultText = " + defaultText);
        defaultText = Optional.ofNullable(text).orElse(getDefaultValue());
        System.out.println("defaultText = " + defaultText);*/

        //The intended use of Optional is mainly as a return type
        //User user = users.stream().findFirst().orElse(new User("default", "1234")); //Right

        /*
        Do not use it as a parameter for constructors and methods as
        it would lead to unnecessarily complicated code.
         */
        //User user = new User("john@gmail.com", "1234", Optional.empty()); //wrong

    }

    /*public static String getDefaultValue() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }*/

    private static String name(){
        //String name = "Java";
        //if("Java" == null) return null;
        //return ("Java".length() > 5) ? "Java" :  null;
        return null;
    }

}
