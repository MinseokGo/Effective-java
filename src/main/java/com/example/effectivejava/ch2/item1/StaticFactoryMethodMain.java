package com.example.effectivejava.ch2.item1;

public class StaticFactoryMethodMain {
    public static void main(String[] args) {
        // value
        StaticFactoryMethodConvention from = StaticFactoryMethodConvention.from('a');
        StaticFactoryMethodConvention of = StaticFactoryMethodConvention.of('a', 'b', 'c');
        StaticFactoryMethodConvention valueOf = StaticFactoryMethodConvention.valueOf('a', 'b');

        // instance
        StaticFactoryMethodConvention getInstance = StaticFactoryMethodConvention.getInstance();
        StaticFactoryMethodConvention create = StaticFactoryMethodConvention.create();
        StaticFactoryMethod getStaticFactoryMethod = StaticFactoryMethodConvention.getStaticFactoryMethod();
        StaticFactoryMethod newStaticFactoryMethod = StaticFactoryMethodConvention.newStaticFactoryMethod();
        StaticFactoryMethod staticFactoryMethod = StaticFactoryMethodConvention.staticFactoryMethod();
    }
}
