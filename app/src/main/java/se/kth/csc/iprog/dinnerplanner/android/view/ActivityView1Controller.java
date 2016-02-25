package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/23/16.
 */
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.view2;
import se.kth.csc.iprog.dinnerplanner.android.view1;
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

        if(v == view.create)
        {
            Intent i = new Intent(act, view2.class);
            act.startActivity(i);
        }
        else showDialog(v);

    }

    public void showDialog(View v)
    {
        FragmentManager manager = act.getFragmentManager();
        fragment f = new fragment();

        f.fragment_get_var(model,v, view);

        f.show(manager, "mydialog");
    }
}
