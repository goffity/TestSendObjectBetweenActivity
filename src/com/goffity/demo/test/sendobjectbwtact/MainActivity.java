package com.goffity.demo.test.sendobjectbwtact;

import com.goffity.demo.test.sendobjectbwtact.object.ParcelableObject;
import com.goffity.demo.test.sendobjectbwtact.object.SerializableObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				SerializableObject object = new SerializableObject();
				object.setName("Name from Serail obj.");
				object.setLastname("lastname from Serail obj.");

				Bundle bundle = new Bundle();
				Intent intent = new Intent();

				bundle.putSerializable("name", object);

				intent.putExtras(bundle);

				intent.setClass(MainActivity.this, ReceiveActivity.class);

				startActivity(intent);
			}
		});

		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ParcelableObject object = new ParcelableObject();
				object.setName("First Name");

				object.setLastname("lastName");

				Intent intent = new Intent(MainActivity.this,
						ReceiveActivity.class);
				intent.putExtra("parcel", object);

				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
