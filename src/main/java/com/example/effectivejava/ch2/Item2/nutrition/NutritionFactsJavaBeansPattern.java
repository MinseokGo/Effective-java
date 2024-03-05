package com.example.effectivejava.ch2.Item2.nutrition;

public class NutritionFactsJavaBeansPattern {
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsJavaBeansPattern() {
    }

    public void setServingSize(final int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(final int servings) {
        this.servings = servings;
    }

    public void setCalories(final int calories) {
        this.calories = calories;
    }

    public void setFat(final int fat) {
        this.fat = fat;
    }

    public void setSodium(final int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(final int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
