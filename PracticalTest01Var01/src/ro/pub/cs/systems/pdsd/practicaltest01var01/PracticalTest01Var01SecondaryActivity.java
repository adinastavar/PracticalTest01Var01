package ro.pub.cs.systems.pdsd.practicaltest01var01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PracticalTest01Var01SecondaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practical_test01_var01_secondary);
		
		String toAdd = ""; 
		
		 Intent intent = getIntent();
		 if (intent != null) {
			 String c1 = intent.getStringExtra("checkBox1Text"); 	
			 String c2 = intent.getStringExtra("checkBox2Text"); 
			 String c3 = intent.getStringExtra("checkBox3Text"); 
			 
			 int b1 = intent.getIntExtra("checkBox1", 0);
			 int b2 = intent.getIntExtra("checkBox2", 0);
			 int b3 = intent.getIntExtra("checkBox3", 0);
			 
			 if(b1 == 1){
				 toAdd += c1;
			 }
			 if(b2 == 1){
				 toAdd += c2;
			 }
			 if(b3 == 1){
				 toAdd += c3;
			 }
		 }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.practical_test01_var01_secondary, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
