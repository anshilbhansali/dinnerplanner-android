package se.kth.csc.iprog.dinnerplanner.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.Set;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import java.util.Observable;

import se.kth.csc.iprog.dinnerplanner.android.R;

public class DinnerModel extends Observable implements IDinnerModel{
	
	//all dishes
	Set<Dish> dishes = new HashSet<Dish>();

	//number of guests
	int num_guests;

	{
		num_guests = 2;
	}

	//selected dishes on menu
	Set<Dish> selected_dishes = new HashSet<Dish>();
	Application application;
	
	/**
	 * The constructor of the overall model. Set the default values here
	 */
	public DinnerModel(Application app) {
		this.application = app;
		
		//Adding some example data, you can add more
		Dish dish1 = new Dish("French toast",Dish.STARTER,"drawable/toast","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish1ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish1ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish1ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish1ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish1ing5 = new Ingredient("white bread",2,"slices",2);
		dish1.addIngredient(dish1ing1);
		dish1.addIngredient(dish1ing2);
		dish1.addIngredient(dish1ing3);
		dish1.addIngredient(dish1ing4);
		dish1.addIngredient(dish1ing5);
		dishes.add(dish1);
		//selected_dishes.add(dish1);


		Dish dish2 = new Dish("Spring Rolls",Dish.STARTER,"drawable/toast","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish2ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish2ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish2ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish2ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish2ing5 = new Ingredient("white bread",2,"slices",2);
		dish2.addIngredient(dish2ing1);
		dish2.addIngredient(dish2ing2);
		dish2.addIngredient(dish2ing3);
		dish2.addIngredient(dish2ing4);
		dish2.addIngredient(dish2ing5);
		dishes.add(dish2);


		Dish dish3 = new Dish("Crostini",Dish.STARTER,"drawable/toast","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish3ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish3ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish3ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish3ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish3ing5 = new Ingredient("white bread",2,"slices",2);
		dish3.addIngredient(dish3ing1);
		dish3.addIngredient(dish3ing2);
		dish3.addIngredient(dish3ing3);
		dish3.addIngredient(dish3ing4);
		dish3.addIngredient(dish3ing5);
		dishes.add(dish3);
		//selected_dishes.add(dish3);

		Dish dish4 = new Dish("Meat balls",Dish.MAIN,"drawable/meatballs","Preheat an oven to 400 degrees F (200 degrees C). Place the beef into a mixing bowl, and season with salt, onion, garlic salt, Italian seasoning, oregano, red pepper flakes, hot pepper sauce, and Worcestershire sauce; mix well. Add the milk, Parmesan cheese, and bread crumbs. Mix until evenly blended, then form into 1 1/2-inch meatballs, and place onto a baking sheet. Bake in the preheated oven until no longer pink in the center, 20 to 25 minutes.");
		Ingredient dish4ing1 = new Ingredient("extra lean ground beef",115,"g",20);
		Ingredient dish4ing2 = new Ingredient("sea salt",0.7,"g",3);
		Ingredient dish4ing3 = new Ingredient("small onion, diced",0.25,"",2);
		Ingredient dish4ing4 = new Ingredient("garlic salt",0.6,"g",3);
		Ingredient dish4ing5 = new Ingredient("Italian seasoning",0.3,"g",3);
		Ingredient dish4ing6 = new Ingredient("dried oregano",0.3,"g",3);
		Ingredient dish4ing7 = new Ingredient("crushed red pepper flakes",0.6,"g",3);
		Ingredient dish4ing8 = new Ingredient("Worcestershire sauce",16,"ml",7);
		Ingredient dish4ing9 = new Ingredient("milk",20,"ml",4);
		Ingredient dish4ing10 = new Ingredient("grated Parmesan cheese",5,"g",8);
		Ingredient dish4ing11 = new Ingredient("seasoned bread crumbs",115,"g",4);
		dish4.addIngredient(dish4ing1);
		dish4.addIngredient(dish4ing2);
		dish4.addIngredient(dish4ing3);
		dish4.addIngredient(dish4ing4);
		dish4.addIngredient(dish4ing5);
		dish4.addIngredient(dish4ing6);
		dish4.addIngredient(dish4ing7);
		dish4.addIngredient(dish4ing8);
		dish4.addIngredient(dish4ing9);
		dish4.addIngredient(dish4ing10);
		dish4.addIngredient(dish4ing11);
		dishes.add(dish4);
		//selected_dishes.add(dish4);

		Dish dish5 = new Dish("Baked Brie",Dish.MAIN,"drawable/meatballs","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish5ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish5ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish5ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish5ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish5ing5 = new Ingredient("white bread",2,"slices",2);
		dish5.addIngredient(dish5ing1);
		dish5.addIngredient(dish5ing2);
		dish5.addIngredient(dish5ing3);
		dish5.addIngredient(dish5ing4);
		dish5.addIngredient(dish5ing5);
		dishes.add(dish5);

		Dish dish6 = new Dish("Fillet Mignon",Dish.MAIN,"drawable/meatballs","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish6ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish6ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish6ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish6ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish6ing5 = new Ingredient("white bread",2,"slices",2);
		dish6.addIngredient(dish6ing1);
		dish6.addIngredient(dish6ing2);
		dish6.addIngredient(dish6ing3);
		dish6.addIngredient(dish6ing4);
		dish6.addIngredient(dish6ing5);
		dishes.add(dish6);
		//selected_dishes.add(dish6);

		Dish dish7 = new Dish("Ice cream",Dish.DESERT,"drawable/icecream","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish7ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish7ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish7ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish7ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish7ing5 = new Ingredient("white bread",2,"slices",2);
		dish7.addIngredient(dish7ing1);
		dish7.addIngredient(dish7ing2);
		dish7.addIngredient(dish7ing3);
		dish7.addIngredient(dish7ing4);
		dish7.addIngredient(dish7ing5);
		dishes.add(dish7);
		//selected_dishes.add(dish7);

		Dish dish8 = new Dish("Panna Cotta",Dish.DESERT,"drawable/icecream","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish8ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish8ing2 = new Ingredient("milk",32,"ml",3);
		Ingredient dish8ing3 = new Ingredient("brown sugar",7,"g",5);
		Ingredient dish8ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish8ing5 = new Ingredient("white bread",4,"slices",2);
		dish8.addIngredient(dish8ing1);
		dish8.addIngredient(dish8ing2);
		dish8.addIngredient(dish8ing3);
		dish8.addIngredient(dish8ing4);
		dish8.addIngredient(dish8ing5);
		dishes.add(dish8);
		//selected_dishes.add(dish8);


		
	}

	/* converts image name into drawable*/
	public Drawable getDrawable(String image)
	{
		int ImageResource = application.getResources().getIdentifier(image, null, application.getPackageName());
		Drawable d = application.getResources().getDrawable(ImageResource);
		return d;
	}
	
	/**
	 * Returns the set of dishes of specific type. (1 = starter, 2 = main, 3 = desert).
	 */
	public Set<Dish> getDishes(){
		return dishes;
	}
	
	/**
	 * Returns the set of dishes of specific type. (1 = starter, 2 = main, 3 = desert).
	 */
	public Set<Dish> getDishesOfType(int type){
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes){
			if(d.getType() == type){
				result.add(d);
			}
		}
		return result;
	}
	
	/**
	 * Returns the set of dishes of specific type, that contain filter in their name
	 * or name of any ingredient. 
	 */
	public Set<Dish> filterDishesOfType(int type, String filter)
	{
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes){
			if(d.getType() == type && d.contains(filter)){
				result.add(d);
			}
		}
		return result;
	}

	public int getNumberOfGuests()
	{
		return num_guests;
	}

	public void setNumberOfGuests(int numberOfGuests)
	{

		num_guests = numberOfGuests;
		setChanged();
		notifyObservers(this);
	}

	/**
	 * Returns the dish that is on the menu for selected type (1 = starter, 2 = main, 3 = desert).
	 */
	public Dish getSelectedDish(int type)
	{

		for(Dish d : selected_dishes)
		{
			if(d.getType() == type)
			{
				return d;
			}
		}
		return null;
	}


	/**
	 * Returns all the dishes on the menu.
	 */
	public Set<Dish> getFullMenu()
	{
		return selected_dishes;
	}

	/**
	 * Returns all ingredients for all the dishes on the menu.
	 */
	public Set<Ingredient> getAllIngredients()
	{
		Set<Ingredient> result = new HashSet<Ingredient>();

		for(Dish d : selected_dishes)
		{
			for(Ingredient e : d.getIngredients())
			{
				result.add(e);
			}
		}

		return result;
	}

	/**
	 * Returns the total price of the menu (all the ingredients multiplied by number of guests).
	 */
	public float getTotalMenuPrice()
	{
		float total = 0;

		for(Dish d : selected_dishes)
		{
			for(Ingredient e : d.getIngredients())
			{
				total += e.getPrice();
			}
		}

		return total;
	}

	/**
	 * Adds the passed dish to the menu. If the dish of that type already exists on the menu
	 * it is removed from the menu and the new one added.
	 */
	public void addDishToMenu(Dish dish)
	{
		int type = dish.getType();

		if(getSelectedDish(type) == null)
		{
			//add to menu
			selected_dishes.add(dish);
		}
		else
		{
			Dish dish_to_remove = getSelectedDish(type);
			selected_dishes.remove(dish_to_remove);
			selected_dishes.add(dish);
		}
		setChanged();
		notifyObservers(this);
	}

	/**
	 * Remove dish from menu
	 */
	public void removeDishFromMenu(Dish dish)
	{

		selected_dishes.remove(dish);
		setChanged();
		notifyObservers(this);
	}

	//sets cost per person for each dish in dish object
	public void setCostperDishperPerson()
	{
		float costPerPerson=0;
		for(Dish d : dishes)
		{
			costPerPerson = d.getCost()/num_guests;
			d.setCostPerPerson(costPerPerson);
		}
	}




}
