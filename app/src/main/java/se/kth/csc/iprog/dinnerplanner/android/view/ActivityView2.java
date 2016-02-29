package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/17/16.
 */

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import android.app.Application;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

public class ActivityView2 {

    View view;

    //listeners/buttons
    Button back;
    ImageView ingr_;
    ImageView starter_;
    ImageView main_;
    ImageView dessert_;

    //things to change
    TextView header;
    TextView name_dish;
    TextView Instr;


    public ActivityView2(View view, Activity act)
    {
        this.view = view;

        DinnerModel model = ((DinnerPlannerApplication)act.getApplication()).getModel();

        Dish starter = model.getSelectedDish(Dish.STARTER);
        Dish main = model.getSelectedDish(Dish.MAIN);
        Dish dessert = model.getSelectedDish(Dish.DESERT);
        Set<Ingredient> all_ingredients = model.getAllIngredients();

        //cost
        float cost = model.getTotalMenuPrice();
        TextView total_cost = (TextView)view.findViewById(R.id.total_cost);
        total_cost.setText("" + cost);

        //link variables to ids
        back = (Button)view.findViewById(R.id.back_b);
        ingr_ = (ImageView)view.findViewById(R.id.selected_ingredients_img);
        header = (TextView)view.findViewById(R.id.type_dish_menu);
        name_dish = (TextView)view.findViewById(R.id.type_dish_name);
        Instr = (TextView)view.findViewById(R.id.type_dish_instr);


        TextView selected_starter = (TextView)view.findViewById(R.id.selected_starter);
        selected_starter.setText(starter.getName());

        TextView selected_main = (TextView)view.findViewById(R.id.selected_main);
        selected_main.setText(main.getName());

        TextView selected_dessert = (TextView)view.findViewById(R.id.selected_dessert);
        selected_dessert.setText(dessert.getName());

        ImageView starter_img = (ImageView)view.findViewById(R.id.selected_starter_img);
        starter_ = starter_img;
        starter_img.setImageDrawable(model.getDrawable(starter.getImage()));

        ImageView main_img = (ImageView)view.findViewById(R.id.selected_main_img);
        main_ = main_img;
        main_img.setImageDrawable(model.getDrawable(main.getImage()));

        ImageView dessert_img = (ImageView)view.findViewById(R.id.selected_dessert_img);
        dessert_ = dessert_img;
        dessert_img.setImageDrawable(model.getDrawable(dessert.getImage()));

    }
}
