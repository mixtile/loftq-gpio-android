package com.mixtile.loftqgpio;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity {
    private static final String TAG="GPIOMain";

    private ToggleButton tgbt0 = null;
    private ToggleButton tgbt1 = null;
    private ToggleButton tgbt2 = null;
    private ToggleButton tgbt3 = null;

    private ToggleButton rtgbt6 = null;
    private ToggleButton rtgbt7 = null;
    private ToggleButton rtgbt8 = null;
    private ToggleButton rtgbt9 = null;

    private Button rbt6 = null;
    private Button rbt7 = null;
    private Button rbt8 = null;
    private Button rbt9 = null;

    private GPIOGpio iowrapper = new GPIOGpio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbt0 = (ToggleButton)findViewById(R.id.toggleButton1);
        tgbt1 = (ToggleButton)findViewById(R.id.toggleButton2);
        tgbt2 = (ToggleButton)findViewById(R.id.toggleButton3);
        tgbt3 = (ToggleButton)findViewById(R.id.toggleButton4);

        rtgbt6 = (ToggleButton)findViewById(R.id.rToggleJ406);
        rtgbt7 = (ToggleButton)findViewById(R.id.rToggleJ407);
        rtgbt8 = (ToggleButton)findViewById(R.id.rToggleJ408);
        rtgbt9 = (ToggleButton)findViewById(R.id.rToggleJ409);

        rbt6 = (Button)findViewById(R.id.rButtonJ406);
        rbt7 = (Button)findViewById(R.id.rButtonJ407);
        rbt8 = (Button)findViewById(R.id.rButtonJ408);
        rbt9 = (Button)findViewById(R.id.rButtonJ409);

        iowrapper.init();

        tgbt0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tgbt0.setChecked(isChecked);
                iowrapper.set_00(isChecked ? 1 : 0);
            }

        });

        tgbt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                tgbt1.setChecked(isChecked);
                iowrapper.set_01(isChecked ? 1 : 0);
            }

        });

        tgbt2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                tgbt2.setChecked(isChecked);
                iowrapper.set_02(isChecked ? 1 : 0);
            }

        });

        tgbt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                tgbt3.setChecked(isChecked);
                iowrapper.set_03(isChecked ? 1 : 0);
            }

        });

        rbt6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int value = iowrapper.get_06();
                Log.i(TAG, "J406 read " + value);
                rtgbt6.setChecked(value == 1);
            }
        });

        rbt7.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                int value = iowrapper.get_07();
                Log.i(TAG, "J407 read " + value);
                rtgbt7.setChecked(value==1);
            }
        });

        rbt8.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                int value = iowrapper.get_08();
                Log.i(TAG, "J408 read " + value);
                rtgbt8.setChecked(value == 1);
            }
        });

        rbt9.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                int value = iowrapper.get_09();
                Log.i(TAG, "J408 read " + value);
                rtgbt9.setChecked(value == 1);
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

    @Override
    public void finish() {
        super.finish();
        iowrapper.fini();
    }
}
