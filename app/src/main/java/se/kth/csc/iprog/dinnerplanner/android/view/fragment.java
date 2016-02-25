package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/20/16.
 */




import android.app.Activity;
import android.app.DialogFragment;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import android.app.Application;

import org.w3c.dom.Text;

import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
public class fragment extends DialogFragment implements OnClickListener{
    Button choose, close;
    DinnerModel model;
    View clicked_on;
    ActivityView1 view1;

    public fragment()
    {}
    public void fragment_get_var(DinnerModel model, View v, ActivityView1 view1)
    {
        this.model = model;
        this.clicked_on = v;
        this.view1 = view1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fview = inflater.inflate(R.layout.fragment, null);
        choose = (Button)fview.findViewById(R.id.choose);
        close = (Button) fview.findViewById(R.id.close_frag);
        close.setOnClickListener(this);
        choose.setOnClickListener(this);

        TextView name = (TextView) fview.findViewById(R.id.selected_dish_fragment);
        TextView cost = (TextView) fview.findViewById(R.id.cost_per_dish);
        TextView cost_per_person = (TextView)fview.findViewById(R.id.cost_per_dish_per_person);
        ImageView img = (ImageView) fview.findViewById(R.id.img_frag);

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

        if(clicked_on == view1.starter_img_1)
        {
            name.setText(arr[0].getName());
            cost.setText(""+arr[0].getCost());
            cost_per_person.setText(""+arr[0].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr[0].getImage()));
        }
        else if(clicked_on == view1.starter_img_2)
        {
            name.setText(arr[1].getName());
            cost.setText(""+arr[1].getCost());
            cost_per_person.setText(""+arr[1].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr[1].getImage()));
        }
        else if(clicked_on == view1.starter_img_3)
        {
            name.setText(arr[2].getName());
            cost.setText(""+arr[2].getCost());
            cost_per_person.setText(""+arr[2].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr[2].getImage()));
        }
        else if(clicked_on == view1.main_img_1)
        {
            name.setText(arr_mains[0].getName());
            cost.setText(""+arr_mains[0].getCost());
            cost_per_person.setText(""+arr_mains[0].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr_mains[0].getImage()));
        }
        else if(clicked_on == view1.main_img_2)
        {
            name.setText(arr_mains[1].getName());
            cost.setText(""+arr_mains[1].getCost());
            cost_per_person.setText(""+arr_mains[1].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr_mains[1].getImage()));
        }
        else if(clicked_on == view1.main_img_3)
        {
            name.setText(arr_mains[2].getName());
            cost.setText(""+arr_mains[2].getCost());
            cost_per_person.setText(""+arr_mains[2].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr_mains[2].getImage()));
        }
        else if(clicked_on == view1.dessert_img_1)
        {
            name.setText(arr_des[0].getName());
            cost.setText(""+arr_des[0].getCost());
            cost_per_person.setText(""+arr_des[0].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr_des[0].getImage()));
        }
        else if(clicked_on == view1.dessert_img_2)
        {
            name.setText(arr_des[1].getName());
            cost.setText(""+arr_des[1].getCost());
            cost_per_person.setText(""+arr_des[1].getCostPerPerson());
            img.setImageDrawable(model.getDrawable(arr_des[1].getImage()));
        }


        return fview;
    }

    @Override
    public void onClick(View view) {

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

        if(view == choose)
        {
            if(clicked_on == view1.starter_img_1)
            {
                model.addDishToMenu(arr[0]);

            }
            else if(clicked_on == view1.starter_img_2)
            {
                model.addDishToMenu(arr[1]);

            }
            else if(clicked_on == view1.starter_img_3)
            {
                model.addDishToMenu(arr[2]);

            }
            else if(clicked_on == view1.main_img_1)
            {
                model.addDishToMenu(arr_mains[0]);

            }
            else if(clicked_on == view1.main_img_2)
            {
                model.addDishToMenu(arr_mains[1]);

            }
            else if(clicked_on == view1.main_img_3)
            {
                model.addDishToMenu(arr_mains[2]);

            }
            else if(clicked_on == view1.dessert_img_1)
            {
                model.addDishToMenu(arr_des[0]);

            }
            else if(clicked_on == view1.dessert_img_2)
            {
                model.addDishToMenu(arr_des[1]);

            }
            dismiss();
        }
        else if(view == close)
            dismiss();
    }
}
