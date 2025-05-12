interface MealPlan {
void displayMealPlan();
}
class VegetarianMeal implements MealPlan {
public void displayMealPlan() {
System.out.println("Vegetarian Meal Plan: Plant-based diet.");
}
}
class VeganMeal implements MealPlan {
public void displayMealPlan() {
System.out.println("Vegan Meal Plan: No animal products.");
}
}
class KetoMeal implements MealPlan {
public void displayMealPlan() {
System.out.println("Keto Meal Plan: High-fat, low-carb.");
}
}
class Meal<T extends MealPlan> {
T meal;
Meal(T meal) {
this.meal = meal;
}
void displayMeal() {
meal.displayMealPlan();
11
}
}
public class MealPlanGenerator {
public static void main(String[] args) {
Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
vegMeal.displayMeal();
veganMeal.displayMeal();
ketoMeal.displayMeal();
}
}
