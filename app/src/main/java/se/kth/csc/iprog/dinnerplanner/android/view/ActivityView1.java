package se.kth.csc.iprog.dinnerplanner.android.view;


import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import android.app.Application;
import java.util.Observable;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import java.util.Observer;

public class ActivityView1 implements Observer{
    View view;
    ImageView starter_img_1;
    ImageView starter_img_2;
    ImageView starter_img_3;
    ImageView main_img_1;
    ImageView main_img_2;
    ImageView main_img_3;
    ImageView dessert_img_1;
    ImageView dessert_img_2;
    Button create;
    EditText num_guests;




    public ActivityView1(View view, Activity activity) {

        // store in the class the reference to the Android View
        this.view = view;

        DinnerModel model = ((DinnerPlannerApplication) activity.getApplication()).getModel();

        model.addObserver(this);

        Set<Dish> all_starters = model.getDishesOfType(Dish.STARTER);
        Set<Dish> all_maincourses = model.getDishesOfType(Dish.MAIN);
        Set<Dish> all_desserts = model.getDishesOfType(Dish.DESERT);

        //need to set number of guests from user input
        EditText guests = (EditText)view.findViewById(R.id.num_guests);
        guests.setText(""+model.getNumberOfGuests());
        num_guests = guests;



        //cost
        float cost = model.getTotalMenuPrice();
        TextView t_cost = (TextView) view.findViewById(R.id.cost_view1);
        int num = model.getNumberOfGuests();
        float cost_per = cost/num;
        t_cost.setText("" + cost_per);


        //create button
        Button b = (Button)view.findViewById(R.id.create_b);
        create = b;



        //put STARTERS in arrays
        Dish[] arr = new Dish[all_starters.size()];
        int i=0;
        for(Dish s : all_starters)
        {
            arr[i] = s;
            i++;
        }
        //setting strings of dishes names
        TextView starter = (TextView) view.findViewById(R.id.starter1);
        starter.setText(arr[0].getName());

        starter = (TextView) view.findViewById(R.id.starter2);
        starter.setText(arr[1].getName());

        starter = (TextView) view.findViewById(R.id.starter3);
        starter.setText(arr[2].getName());

        //set images
        ImageView starter_img = (ImageView) view.findViewById(R.id.starter1_img);
        starter_img_1 = starter_img;
        starter_img.setImageDrawable(model.getDrawable(arr[0].getImage()));

        starter_img = (ImageView) view.findViewById(R.id.starter2_img);
        starter_img_2 = starter_img;
        starter_img.setImageDrawable(model.getDrawable(arr[1].getImage()));

        starter_img = (ImageView) view.findViewById(R.id.starter3_img);
        starter_img_3 = starter_img;
        starter_img.setImageDrawable(model.getDrawable(arr[2].getImage()));



        //put MAINCOURSES in arrays
        i=0;
        for(Dish s : all_maincourses)
        {
            arr[i] = s;
            i++;
        }
        //setting strings of dishes names
        TextView main = (TextView) view.findViewById(R.id.main1);
        main.setText(arr[0].getName());

        main = (TextView) view.findViewById(R.id.main2);
        main.setText(arr[1].getName());

        main = (TextView) view.findViewById(R.id.main3);
        main.setText(arr[2].getName());

        //set images
        ImageView main_img = (ImageView) view.findViewById(R.id.main1_img);
        main_img_1 = main_img;
        main_img.setImageDrawable(model.getDrawable(arr[0].getImage()));

        main_img = (ImageView) view.findViewById(R.id.main2_img);
        main_img_2 = main_img;
        main_img.setImageDrawable(model.getDrawable(arr[1].getImage()));

        main_img = (ImageView) view.findViewById(R.id.main3_img);
        main_img_3 = main_img;
        main_img.setImageDrawable(model.getDrawable(arr[2].getImage()));

        //put DESSERTS in arrays
        i=0;
        for(Dish s : all_desserts)
        {
            arr[i] = s;
            i++;
        }
        //setting strings of dishes names
        TextView dessert = (TextView) view.findViewById(R.id.dessert1);
        dessert.setText(arr[0].getName());

        dessert = (TextView) view.findViewById(R.id.dessert2);
        dessert.setText(arr[1].getName());

        //set images
        ImageView dessert_img = (ImageView) view.findViewById(R.id.dessert1_img);
        dessert_img_1 = dessert_img;
        dessert_img.setImageDrawable(model.getDrawable(arr[0].getImage()));

        dessert_img = (ImageView) view.findViewById(R.id.dessert2_img);
        dessert_img_2 = dessert_img;
        dessert_img.setImageDrawable(model.getDrawable(arr[1].getImage()));


    }

    public void update(Observable o, Object arg)
    {
        DinnerModel model = (DinnerModel) o;
        //cost
        float cost = model.getTotalMenuPrice();
        TextView t_cost = (TextView) view.findViewById(R.id.cost_view1);
        int num = model.getNumberOfGuests();
        float cost_per = cost/num;
        t_cost.setText("" + cost_per);

    }





}
