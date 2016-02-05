package com.example.tianbi.crunchtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String spinnerText = new String();
    public String amountText = new String();
    public double amount = 0;
    public double totalCalorie = 0;
    public int pos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        buttonListener();

    }
    public void buttonListener() {
        Button go = (Button) findViewById(R.id.button);
        go.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            Spinner spinnerFrom = (Spinner)findViewById(R.id.spinner);
            pos = spinnerFrom.getSelectedItemPosition();
            TextView calorieDisplay = (TextView)findViewById(R.id.CalorieText);
            TextView display1 = (TextView)findViewById(R.id.PushupText);
            TextView display2 = (TextView)findViewById(R.id.SitupText);
            TextView display3 = (TextView)findViewById(R.id.SquatsText);
            TextView display4 = (TextView)findViewById(R.id.LegLiftText);
            TextView display5 = (TextView)findViewById(R.id.PlankText);
            TextView display6 = (TextView)findViewById(R.id.JumpingJacksText);
            TextView display7 = (TextView)findViewById(R.id.PullupText);
            TextView display8 = (TextView)findViewById(R.id.CyclingText);
            TextView display9 = (TextView)findViewById(R.id.WalkingText);
            TextView display10 = (TextView)findViewById(R.id.JoggingText);
            TextView display11 = (TextView)findViewById(R.id.SwimmingText);
            TextView display12 = (TextView)findViewById(R.id.StairClimbingText);
            try {

                EditText exerciseInput = (EditText) findViewById(R.id.AmountText);
                amountText = exerciseInput.getText().toString();
                amount = Integer.parseInt(amountText);
            }
            catch (Exception e){

            }
            if (pos == 0) {
                totalCalorie = amount/350*100;
            }
            else if (pos == 1) {
                totalCalorie = amount/200*100;
            }
            else if (pos == 2) {
                totalCalorie = amount/225*100;
            }
            else if (pos == 3) {
                totalCalorie = amount/25*100;
            }
            else if (pos == 4) {
                totalCalorie = amount/25*100;
            }
            else if (pos == 5) {
                totalCalorie = amount/10*100;
            }
            else if (pos == 6) {
                totalCalorie = amount/100*100;
            }
            else if (pos == 7) {
                totalCalorie = amount/12*100;
            }
            else if (pos == 8) {
                totalCalorie = amount/20*100;
            }
            else if (pos == 9) {
                totalCalorie = amount/12*100;
            }
            else if (pos == 10) {
                totalCalorie = amount/13*100;
            }
            else {
                totalCalorie = amount/15*100;
            }
            calorieDisplay.setText(Integer.toString((int)Math.round(totalCalorie)));
            display1.setText(Integer.toString((int)Math.round(totalCalorie/100*350)));
            display2.setText(Integer.toString((int)Math.round(totalCalorie/100*200)));
            display3.setText(Integer.toString((int)Math.round(totalCalorie/100*225)));
            display4.setText(Integer.toString((int)Math.round(totalCalorie/100*25)));
            display5.setText(Integer.toString((int)Math.round(totalCalorie/100*25)));
            display6.setText(Integer.toString((int)Math.round(totalCalorie/100*10)));
            display7.setText(Integer.toString((int)Math.round(totalCalorie/100*100)));
            display8.setText(Integer.toString((int)Math.round(totalCalorie/100*12)));
            display9.setText(Integer.toString((int)Math.round(totalCalorie/100*20)));
            display10.setText(Integer.toString((int)Math.round(totalCalorie/100*12)));
            display11.setText(Integer.toString((int)Math.round(totalCalorie/100*13)));
            display12.setText(Integer.toString((int)Math.round(totalCalorie/100*15)));


        }});
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
