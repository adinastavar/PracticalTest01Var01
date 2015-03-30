package ro.pub.cs.systems.pdsd.practicaltest01var01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;


public class PracticalTest01Var01MainActivity extends Activity {
	
	TextView noSelected;
	
	
	private CheckBoxListener checkBoxListener = new CheckBoxListener();
	
	private class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {
		


		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {;
			int noSelectedNumber = Integer.parseInt(noSelected.getText().toString());
			if(isChecked == true){
				noSelectedNumber++;
			} else {
				noSelectedNumber--;
			}	
			noSelected.setText(String.valueOf(noSelectedNumber));
			
		}
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var01_main);
        int NumberSelected = 0;
        
        noSelected = (TextView)findViewById(R.id.textView1);
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        
        checkBox1.setOnCheckedChangeListener(checkBoxListener);
        checkBox2.setOnCheckedChangeListener(checkBoxListener);
        checkBox3.setOnCheckedChangeListener(checkBoxListener);
        noSelected.setText(String.valueOf(0));     
        
        
        if (savedInstanceState != null) {
        	boolean b1 = savedInstanceState.getBoolean("checkBox1");
        	boolean b2 = savedInstanceState.getBoolean("checkBox1");
        	boolean b3 = savedInstanceState.getBoolean("checkBox1");
        	
        	if(b1 == true){
        		NumberSelected ++;
        		checkBox1.setChecked(true);
        	}
        	if(b2 == true){
        		NumberSelected ++;
        		checkBox2.setChecked(true);
        	}
        	if(b3 == true){
        		NumberSelected ++;
        		checkBox3.setChecked(true);
        	}
        }
    }
    protected void onSaveInstanceState(Bundle savedInstanceState) {
    	CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        
        savedInstanceState.putBoolean("checkBox1", checkBox1.isChecked());
        savedInstanceState.putBoolean("checkBox2", checkBox2.isChecked());
        savedInstanceState.putBoolean("checkBox3", checkBox3.isChecked());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_var01_main, menu);
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
