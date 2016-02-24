package se.kth.csc.iprog.dinnerplanner.android.view;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;

import se.kth.csc.iprog.dinnerplanner.android.view1;



/**
 * Created by anshilbhansali on 2/24/16.
 */
public class ExampleViewController implements OnClickListener {
    ExampleView view;
    Activity act;

    public ExampleViewController(ExampleView view, Activity activity)
    {
        this.view = view;
        this.act = activity;

        view.start_button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(act, view1.class);
        act.startActivity(intent);
    }
}
