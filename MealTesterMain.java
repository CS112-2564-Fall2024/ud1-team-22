public class MealTesterMain {
    public static void main(String[] args){
    Meal breakfast = new Meal("Banana", 105, "Healthy");
    Meal lunch = new Meal("Pasta", 75, "Healthy in moderation");
    Meal dinner = new Meal("Steak", 679, "Healthy");

    System.out.println("Data:");

    System.out.println(breakfast);  
    System.out.println(lunch);      
    System.out.println(dinner); 

    System.out.println("Meal Class: ");
    System.out.println(breakfast.mealDescription());  
    System.out.println(lunch.mealDescription());      
    System.out.println(dinner.mealDescription());  
    }
}
