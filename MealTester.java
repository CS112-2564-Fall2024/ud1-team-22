public class MealTester {
    
    private String name;
    private double calories;

    public MealTester(String name, double calories, String mealHealth) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }


    public String mealDescription() {
        return "Meal [name=" + name + ", calories=" + calories + "]";
    }

}
