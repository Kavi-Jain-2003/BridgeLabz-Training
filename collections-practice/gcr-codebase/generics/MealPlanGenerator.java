interface MealPlan
{
    String getMealType();
    String getDietGuidelines();
}
class VegetarianMeal implements MealPlan
{
    @Override
    public String getMealType()
    {
        return "Vegeterian";
    }
    @Override
    public String getDietGuidelines()
    {
        return "Includes vegetables,grains,dairy. No meat";
    }
}
class VeganMeal implements MealPlan
{
    @Override
    public String getMealType()
    {
        return "vegan";
    }
    @Override
    public String getDietGuidelines()
    {
        return "plant-based foods only. No animal products";
    }
}
class KetoMeal implements MealPlan
{
    @Override 
    public String getMealType()
    {
        return "keto";
    }
    @Override 
    public String getDietGuidelines()
    {
        return "Low carbs high fats moderte protein";
    }
}
class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public String getDietGuidelines() {
        return "Protein-rich foods for muscle building.";
    }
}
class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
class MealPlanUtil {

    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {

        System.out.println("Meal Plan Generated:");
        System.out.println("Type: " + mealPlan.getMealType());
        System.out.println("Guidelines: " + mealPlan.getDietGuidelines());
        System.out.println("--------------------------------");
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        MealPlanUtil.generateMealPlan(vegMeal.getMealPlan());
        MealPlanUtil.generateMealPlan(veganMeal.getMealPlan());
        MealPlanUtil.generateMealPlan(ketoMeal.getMealPlan());
        MealPlanUtil.generateMealPlan(proteinMeal.getMealPlan());
    }
}
