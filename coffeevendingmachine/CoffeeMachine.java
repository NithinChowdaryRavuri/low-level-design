package coffeevendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeMachine {
    private static final CoffeeMachine instance = new CoffeeMachine();
    private final List<Coffee> coffeeMenu;
    private final Map<String, Ingredient> ingredients;

    private CoffeeMachine() {
        this.coffeeMenu = new ArrayList<>();
        this.ingredients = new HashMap<>();
        // Initialize ingredients then coffee menu
        initializeIngredients();
        initializeCoffeeMenu();
    }

    public static CoffeeMachine getInstance() {
        return instance;
    }

    private void initializeCoffeeMenu() {
        // Add coffee types to the menu
        Map<Ingredient, Integer> espressoRecipe = new HashMap<>();
        espressoRecipe.put(ingredients.get("Coffee"), 1);
        espressoRecipe.put(ingredients.get("Water"), 1);
        coffeeMenu.add(new Coffee("Espresso", 2.5, espressoRecipe));

        Map<Ingredient, Integer> cappuccinoRecipe = new HashMap<>();
        cappuccinoRecipe.put(ingredients.get("Coffee"), 1);
        cappuccinoRecipe.put(ingredients.get("Water"), 1);
        cappuccinoRecipe.put(ingredients.get("Milk"), 1);
        coffeeMenu.add(new Coffee("Cappuccino", 3.5, cappuccinoRecipe));

        Map<Ingredient, Integer> latteRecipe = new HashMap<>();
        latteRecipe.put(ingredients.get("Coffee"), 1);
        latteRecipe.put(ingredients.get("Water"), 1);
        latteRecipe.put(ingredients.get("Milk"), 2);
        coffeeMenu.add(new Coffee("Latte", 4.0, latteRecipe));
    }

    private void initializeIngredients() {
        // Add ingredients to the inventory
        ingredients.put("Coffee", new Ingredient("Coffee", 10));
        ingredients.put("Water", new Ingredient("Water", 10));
        ingredients.put("Milk", new Ingredient("Milk", 10));
    }

    public void displayMenu() {
        System.out.println(coffeeMenu);
        for (Coffee coffee : coffeeMenu) {
            System.out.println(coffee.getName() + " - $" + coffee.getPrice());
        }
    }

    public synchronized Coffee selectCoffee(String coffeeName) {
        for (Coffee coffee : coffeeMenu) {
            if (coffee.getName().equalsIgnoreCase(coffeeName)) {
                return coffee;
            }
        }
        return null;
    }

    public synchronized void dispenseCoffee(Coffee coffee, Payment payment) {
        if (payment.getAmount() >= coffee.getPrice()) {
            if (hasEnoughIngredients(coffee)){
                updateIngredients(coffee);
                System.out.println("Dispensing " + coffee.getName());
                double change = payment.getAmount() - coffee.getPrice();
                if (change > 0) {
                    System.out.println("Please collect the change: $" + change);
                }
            } else {
                System.out.println("Insufficient ingredients for " + coffee.getName());
            }
        } else {
            System.out.println("Insufficient funds for " + coffee.getName());
        }
    }

    public boolean hasEnoughIngredients(Coffee coffee) {
        for (Map.Entry<Ingredient, Integer> entry : coffee.getRecipe().entrySet()) {
            Ingredient ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            if (requiredQuantity > ingredient.getQuantity()) {
                return false;
            }
        }
        return true;
    }

    public void updateIngredients(Coffee coffee) {
        for (Map.Entry<Ingredient, Integer> entry : coffee.getRecipe().entrySet()) {
            Ingredient ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            ingredient.updateQuantity(-requiredQuantity);
            if (ingredient.getQuantity() < 3) {
                System.out.println("Low Inventory Alert for " + ingredient.getName());
            }
        }
    }
}
