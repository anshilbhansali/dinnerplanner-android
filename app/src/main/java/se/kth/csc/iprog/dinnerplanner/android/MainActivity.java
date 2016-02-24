package se.kth.csc.iprog.dinnerplanner.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import se.kth.csc.iprog.dinnerplanner.android.view.ActivityView1Controller;
import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;
import se.kth.csc.iprog.dinnerplanner.android.view.ExampleViewController;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
        super.onCreate(savedInstanceState);

        // Set the view for the main activity screen
        // it must come before any call to findViewById method
        setContentView(R.layout.activity_main);


        // Creating the view class instance
        ExampleView mainView = new ExampleView(findViewById(R.id.this_is_example_view_id), this);
        ExampleViewController example_ctr = new ExampleViewController(mainView, this);

    }

}
