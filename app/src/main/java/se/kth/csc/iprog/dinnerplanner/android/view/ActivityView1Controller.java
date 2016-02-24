package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/23/16.
 */
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.view2;
import android.app.Application;
import java.util.Observable;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import java.util.Observer;

public class ActivityView1Controller implements OnClickListener{
    DinnerModel model;
    ActivityView1 view;
    Activity act;

    public ActivityView1Controller(DinnerModel model, ActivityView1 view, Activity activity)
    {
        this.model = model;
        this.view = view;
        this.act = activity;

        //set up listeners
        view.starter_img_1.setOnClickListener(this);
        view.starter_img_2.setOnClickListener(this);
        view.starter_img_3.setOnClickListener(this);
        view.main_img_1.setOnClickListener(this);
        view.main_img_2.setOnClickListener(this);
        view.main_img_3.setOnClickListener(this);
        view.dessert_img_1.setOnClickListener(this);
        view.dessert_img_2.setOnClickListener(this);
        view.create.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Set<Dish> all_starters = model.getDishesOfType(Dish.STARTER);
        Set<Dish> all_maincourses = model.getDishesOfType(Dish.MAIN);
        Set<Dish> all_desserts = model.getDishesOfType(Dish.DESERT);

        //put dishes in array
        Dish[] arr = new Dish[all_starters.size()];
        int j=0;
        for(Dish s : all_starters)
        {
            arr[j] = s;
            j++;
        }

        Dish[] arr_mains = new Dish[all_maincourses.size()];
        j=0;
        for(Dish s : all_maincourses)
        {
            arr_mains[j] = s;
            j++;
        }

        Dish[] arr_des = new Dish[all_desserts.size()];
        j=0;
        for(Dish s : all_desserts)
        {
            arr_des[j] = s;
            j++;
        }


        if(v == view.starter_img_1)
        {
            model.addDishToMenu(arr[0]);
        }
        else if(v == view.starter_img_2)
        {
            model.addDishToMenu(arr[1]);
        }
        else if(v == view.starter_img_3)
        {
            model.addDishToMenu(arr[2]);
        }
        else if(v == view.main_img_1)
        {
            model.addDishToMenu(arr_mains[0]);
        }
        else if(v == view.main_img_2)
        {
            model.addDishToMenu(arr_mains[1]);
        }
        else if(v == view.main_img_3)
        {
            model.addDishToMenu(arr_mains[2]);
        }
        else if(v == view.dessert_img_1)
        {
            model.addDishToMenu(arr_des[0]);
        }
        else if(v == view.dessert_img_2)
        {
            model.addDishToMenu(arr_des[1]);
        }
        else if(v == view.create)
        {
            Intent i = new Intent(act, view2.class);
            act.startActivity(i);
        }

    }
}
