package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by anshilbhansali on 2/20/16.
 */




import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import android.app.Application;
import java.util.Set;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
public class fragment {
    View view;

    public fragment(View view, Activity activity)
    {
        this.view  = view;

        DinnerModel model = ((DinnerPlannerApplication) activity.getApplication()).getModel();

        //assuming dish picked is French toast
        TextView dish = (TextView) view.findViewById(R.id.selected_dish_fragment);
        dish.setText("French toast");





    }

}
