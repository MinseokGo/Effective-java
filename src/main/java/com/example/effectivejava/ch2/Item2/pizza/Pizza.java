package com.example.effectivejava.ch2.Item2.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(final Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            System.out.println("Add topping!!");
            return self();
        }

        abstract Pizza build();

        // 하위 클래스는 이 메서드를 오버라이딩하여 this 를 반환하도록 해야한다.
        protected abstract T self();
    }

    Pizza(final Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
