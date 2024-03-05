package com.example.effectivejava.ch2.Item2.pizza;

import com.example.effectivejava.ch2.Item2.pizza.NyPizza.Size;
import com.example.effectivejava.ch2.Item2.pizza.Pizza.Topping;

public class PizzaMain {
    public static void main(String[] args) {
        final Size size = Size.MEDIUM;
        final Topping ham = Topping.HAM;
        NyPizza nyPizza = new NyPizza.Builder(size)
                .addTopping(ham)
                .addTopping(ham)
                .addTopping(ham)
                .addTopping(ham)
                .addTopping(ham)
                .build();
    }
}
