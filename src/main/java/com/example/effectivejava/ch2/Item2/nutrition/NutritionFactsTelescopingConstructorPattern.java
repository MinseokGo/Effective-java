package com.example.effectivejava.ch2.Item2.nutrition;

/*
 * 점층적 생성자 패턴
 */
public class NutritionFactsTelescopingConstructorPattern {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFactsTelescopingConstructorPattern(final int servingSize, final int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsTelescopingConstructorPattern(final int servingSize, final int servings, final int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsTelescopingConstructorPattern(final int servingSize, final int servings, final int calories, final int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsTelescopingConstructorPattern(final int servingSize, final int servings, final int calories, final int fat,
                                                       final int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsTelescopingConstructorPattern(final int servingSize, final int servings, final int calories, final int fat,
                                                       final int sodium, final int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
