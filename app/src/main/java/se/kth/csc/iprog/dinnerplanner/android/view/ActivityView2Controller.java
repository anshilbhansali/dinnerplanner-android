package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/24/16.
 */
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.view1;
import android.app.Application;
import java.util.Observable;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

import java.util.Observer;

public class ActivityView2Controller implements OnClickListener {
    DinnerModel model;
    ActivityView2 view;
    Activity act;

    public ActivityView2Controller(DinnerModel model, ActivityView2 view, Activity activity)
    {
        this.model = model;
        this.view = view;
        this.act = activity;

        //set up listeners
        view.back.setOnClickListener(this);
        view.ingr_.setOnClickListener(this);
        view.dessert_.setOnClickListener(this);
        view.main_.setOnClickListener(this);
        view.starter_.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        Dish starter = model.getSelectedDish(Dish.STARTER);
        Dish main = model.getSelectedDish(Dish.MAIN);
        Dish des = model.getSelectedDish(Dish.DESERT);
        Set<Ingredient> all_ingr = model.getAllIngredients();

        //things to change
        TextView head = view.header;
        TextView name = view.name_dish;
        TextView instr = view.Instr;

        if(v == view.back)
        {
            Intent i = new Intent(act, view1.class);
            act.startActivity(i);

        }
        else if(v == view.starter_)
        {
            head.setText("Starter");
            name.setText(starter.getName());
            instr.setText(starter.getDescription());
        }
        else if(v == view.main_)
        {
            head.setText("Main Course");
            name.setText(main.getName());
            instr.setText(main.getDescription());
        }
        else if(v == view.dessert_)
        {
            head.setText("Dessert");
            name.setText(des.getName());
            instr.setText(des.getDescription());
        }
        else if(v == view.ingr_)
        {
            head.setText("Ingredients");
            name.setText("");

            String str="";
            for(Ingredient i : all_ingr)
            {
                str += i.getName()+ "  "+ i.getQuantity()+i.getUnit()+"\n";
            }
            instr.setText(str);

        }

    }
}
