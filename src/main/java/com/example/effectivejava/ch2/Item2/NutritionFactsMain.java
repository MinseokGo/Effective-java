package com.example.effectivejava.ch2.Item2;

public class NutritionFactsMain {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(0, 0)
                .calories(0)
                .fat(0)
                .sodium(0)
                .carbohydrate(0)
                .build();
    }
}
