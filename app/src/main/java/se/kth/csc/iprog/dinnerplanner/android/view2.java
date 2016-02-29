package se.kth.csc.iprog.dinnerplanner.android;

import android.os.Bundle;
import android.app.Activity;

import se.kth.csc.iprog.dinnerplanner.android.view.ActivityView2;
import se.kth.csc.iprog.dinnerplanner.android.view.ActivityView2Controller;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

public class view2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        //create instance of ActivityView1 class
        DinnerModel model = ((DinnerPlannerApplication) this.getApplication()).getModel();

        ActivityView2 view2 = new ActivityView2(findViewById(R.id.view2_id), this);

        ActivityView2Controller c = new ActivityView2Controller(model, view2, this);
    }

}
