package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {

        public B() {
            A obj = new A();
            System.out.println(obj.meth());
        }

        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
}