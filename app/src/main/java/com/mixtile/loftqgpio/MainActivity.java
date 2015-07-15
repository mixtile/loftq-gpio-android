package com.mixtile.loftqgpio;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
    private ToggleButton tgbt1 = null;
    private ToggleButton tgbt2 = null;
    private ToggleButton tgbt3 = null;
    private GPIOGpio iowrapper = new GPIOGpio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbt1 = (ToggleButton)findViewById(R.id.toggleButton1);
        tgbt2 = (ToggleButton)findViewById(R.id.toggleButton2);
        tgbt3 = (ToggleButton)findViewById(R.id.toggleButton3);

        iowrapper.init();

        tgbt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tgbt1.setChecked(isChecked);
                iowrapper.set_01(isChecked ? 1:0);
            }

        });

        tgbt2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                tgbt2.setChecked(isChecked);
                iowrapper.set_01(isChecked ? 1:0);
            }

        });

        tgbt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                tgbt3.setChecked(isChecked);
                iowrapper.set_01(isChecked ? 1:0);
            }

        });
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
