package no.bugs.homework6.task7;

import java.util.ArrayList;
import java.util.List;

// Задача 7 Спроектировать приложение по подсчету калорий за день:
public class CalorieTracker {

    private int totalCalories;
    private int mealCount;
    private List<String> meals = new ArrayList<>();


    public void addMeal(String name, int calories) {
        meals.add(name + " " + calories);
        totalCalories += calories;
        mealCount++;
    }

    public void removeMeal(String name, int calories) {
        meals.remove(name + " " + calories);
        totalCalories -= calories;
        mealCount--;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public int averageCalories() {
        int result = 0;
        if (mealCount > 0) {
            result = totalCalories / mealCount;
        }
        return result;
    }

    @Override
    public String toString() {
        return "CalorieTracker{" +
                "totalCalories=" + totalCalories +
                ", mealCount=" + mealCount +
                ", meals=" + meals +
                '}';
    }

    public static void main(String[] args) {
        CalorieTracker calorieTracker = new CalorieTracker();
        calorieTracker.addMeal("Картошка", 1200);
        calorieTracker.addMeal("Морковка", 1800);
        System.out.println(calorieTracker.getTotalCalories());
        System.out.println(calorieTracker.averageCalories());
        System.out.println(calorieTracker);

    }

}

