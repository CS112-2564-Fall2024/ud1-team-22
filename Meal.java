public class Meal extends MealTester{
    
    private String mealHealth;

    public Meal(String name, double calories, String mealHealth) {
        super(name, calories, mealHealth); 
        this.mealHealth = mealHealth;
    }

    public String getMealHealth(){
        return mealHealth;
    }

    @Override
    public double getCalories() {
        return super.getCalories();
    }

    @Override
    public String toString() {
        return "Food [name=" + getName() + ", calories=" + getCalories() + ", health=" + getMealHealth() + "]";
    }

    @Override
    public String mealDescription() {
        return "Meal [name=" + getName() + ", calories=" + getCalories() + ", health=" + getMealHealth() + "]";
    }
}
