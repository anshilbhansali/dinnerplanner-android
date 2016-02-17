package se.kth.csc.iprog.dinnerplanner.android;

import android.os.Bundle;
import android.app.Activity;

import se.kth.csc.iprog.dinnerplanner.android.view.ActivityView2;

public class view2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        //create instance of ActivityView1 class
        ActivityView2 view2 = new ActivityView2(findViewById(R.id.view2_id), this);
    }

}
