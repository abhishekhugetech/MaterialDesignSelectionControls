package com.epiclancers.app.materialdesignselectioncontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat userSwitch;
    AppCompatCheckBox checkBox;
    AppCompatRadioButton radioButton;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Switch Selector in Android
        userSwitch = findViewById(R.id.userSwitch);
        userSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "The Switch is checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "The switch is unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // Checkbox Selector in Android
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Checkbox was checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Checkbox was unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // Radio Button in Android
        /*
        radioButton = findViewById(R.id.radiobutton1);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Radio Button was Checked", Toast.LENGTH_SHORT).show();
            }
        });

        Radio Group Event Listener
        */
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radiobutton1){
                    Toast.makeText(MainActivity.this, "Radio Button 1 was Selected", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.radiobutton2){
                    Toast.makeText(MainActivity.this, "Radio Button 2 was Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
