package se.kth.csc.iprog.dinnerplanner.android.view;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

public class ExampleView {

	View view;
	TextView start_button;

	public ExampleView(View view, Activity activity) {

		// store in the class the reference to the Android View
		this.view = view;

		TextView example = (TextView) view.findViewById(R.id.start_button);
		start_button = example;
		example.setText("START");

		//DinnerModel model = ((DinnerPlannerApplication) this.getApplication()).getModel();
		// Setup the rest of the view layout
	}

}
