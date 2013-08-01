package com.goffity.demo.test.sendobjectbwtact;

import com.goffity.demo.test.sendobjectbwtact.object.ParcelableObject;
import com.goffity.demo.test.sendobjectbwtact.object.SerializableObject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class ReceiveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_receive);

		Bundle bundle = this.getIntent().getExtras();

		if (bundle != null) {
			TextView textView = (TextView) findViewById(R.id.textViewReceive);

			SerializableObject object = (SerializableObject) bundle
					.getSerializable("name");

			if (object == null) {
				Log.d("", "Parcel");

				ParcelableObject parcelableObject = bundle
						.getParcelable("parcel");

				textView.setText("Name: " + parcelableObject.getName()
						+ "\nLastName: " + parcelableObject.getLastname()
						+ "\nAge: " + parcelableObject.getAge());
			} else {
				Log.d("", object.toString());
				Log.d("", object + "");

				if (object.getName() == null) {
					Log.d("", "Null obj");
				} else {

					textView.setText("Name: " + object.getName()
							+ "\nLastName: " + object.getLastname());
				}
			}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.receive, menu);
		return true;
	}

}
