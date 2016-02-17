package se.kth.csc.iprog.dinnerplanner.android;

import android.os.Bundle;
import android.app.Activity;

import se.kth.csc.iprog.dinnerplanner.android.view.ActivityView1;

public class view1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);

        //create instance of ActivityView1 class
        ActivityView1 view1 = new ActivityView1(findViewById(R.id.view1_id), this);
    }

}
