package com.example.picon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class addgpio extends AppCompatActivity {
    CheckBox chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8, chk9, chk10, chk11, chk12, chk13, chk14, chk15, chk16, chk17, chk18, chk19, chk20, chk21, chk22, chk23, chk24, chk25, chk26;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgpio);
        final SharedPreferences sharedPref = addgpio.this.getPreferences(Context.MODE_PRIVATE);
        final boolean isMyValueChecked1 = sharedPref.getBoolean("chk1", false);
        final boolean isMyValueChecked2 = sharedPref.getBoolean("chk2", false);
        final boolean isMyValueChecked3 = sharedPref.getBoolean("chk3", false);
        final boolean isMyValueChecked4 = sharedPref.getBoolean("chk4", false);
        final boolean isMyValueChecked5 = sharedPref.getBoolean("chk5", false);
        final boolean isMyValueChecked6 = sharedPref.getBoolean("chk6", false);
        final boolean isMyValueChecked7 = sharedPref.getBoolean("chk7", false);
        final boolean isMyValueChecked8 = sharedPref.getBoolean("chk8", false);
        final boolean isMyValueChecked9 = sharedPref.getBoolean("chk9", false);
        final boolean isMyValueChecked10 = sharedPref.getBoolean("chk10", false);
        final boolean isMyValueChecked11 = sharedPref.getBoolean("chk11", false);
        final boolean isMyValueChecked12 = sharedPref.getBoolean("chk12", false);
        final boolean isMyValueChecked13 = sharedPref.getBoolean("chk13", false);
        final boolean isMyValueChecked14 = sharedPref.getBoolean("chk14", false);
        final boolean isMyValueChecked15 = sharedPref.getBoolean("chk15", false);
        final boolean isMyValueChecked16 = sharedPref.getBoolean("chk16", false);
        final boolean isMyValueChecked17 = sharedPref.getBoolean("chk17", false);
        final boolean isMyValueChecked18 = sharedPref.getBoolean("chk18", false);
        final boolean isMyValueChecked19 = sharedPref.getBoolean("chk19", false);
        final boolean isMyValueChecked20 = sharedPref.getBoolean("chk20", false);
        final boolean isMyValueChecked21 = sharedPref.getBoolean("chk21", false);
        final boolean isMyValueChecked22 = sharedPref.getBoolean("chk22", false);
        final boolean isMyValueChecked23 = sharedPref.getBoolean("chk23", false);
        final boolean isMyValueChecked24 = sharedPref.getBoolean("chk24", false);
        final boolean isMyValueChecked25 = sharedPref.getBoolean("chk25", false);
        final boolean isMyValueChecked26 = sharedPref.getBoolean("chk26", false);
        final Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(addgpio.this, page.class);
                i.putExtra("chk1", isMyValueChecked1);
                i.putExtra("chk2", isMyValueChecked2);
                i.putExtra("chk3", isMyValueChecked3);
                i.putExtra("chk4", isMyValueChecked4);
                i.putExtra("chk5", isMyValueChecked5);
                i.putExtra("chk6", isMyValueChecked6);
                i.putExtra("chk7", isMyValueChecked7);
                i.putExtra("chk8", isMyValueChecked8);
                i.putExtra("chk9", isMyValueChecked9);
                i.putExtra("chk10", isMyValueChecked10);
                i.putExtra("chk11", isMyValueChecked11);
                i.putExtra("chk12", isMyValueChecked12);
                i.putExtra("chk13", isMyValueChecked13);
                i.putExtra("chk14", isMyValueChecked14);
                i.putExtra("chk15", isMyValueChecked15);
                i.putExtra("chk16", isMyValueChecked16);
                i.putExtra("chk17", isMyValueChecked17);
                i.putExtra("chk18", isMyValueChecked18);
                i.putExtra("chk19", isMyValueChecked19);
                i.putExtra("chk20", isMyValueChecked20);
                i.putExtra("chk21", isMyValueChecked21);
                i.putExtra("chk22", isMyValueChecked22);
                i.putExtra("chk23", isMyValueChecked23);
                i.putExtra("chk24", isMyValueChecked24);
                i.putExtra("chk25", isMyValueChecked25);
                i.putExtra("chk26", isMyValueChecked26);
                startActivity(i);
            }
        });

        chk1 = findViewById(R.id.chk1);
        chk1.setChecked(isMyValueChecked1);
        chk1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk1", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk1.isChecked()) {
                    editor.apply();
                    chk1.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk2 = findViewById(R.id.chk2);
        chk2.setChecked(isMyValueChecked2);
        chk2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk2", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk2.isChecked()) {
                    chk2.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio2 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk3 = findViewById(R.id.chk3);
        chk3.setChecked(isMyValueChecked3);
        chk3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk3", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk3.isChecked()) {
                    chk3.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk4 = findViewById(R.id.chk4);
        chk4.setChecked(isMyValueChecked4);
        chk4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk4", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk4.isChecked()) {
                    chk4.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk5 = findViewById(R.id.chk5);
        chk5.setChecked(isMyValueChecked5);
        chk5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk5", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk5.isChecked()) {
                    chk5.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk6 = findViewById(R.id.chk6);
        chk6.setChecked(isMyValueChecked6);
        chk6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk6", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk6.isChecked()) {
                    chk6.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk7 = findViewById(R.id.chk7);
        chk7.setChecked(isMyValueChecked7);
        chk7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk7", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk7.isChecked()) {
                    chk7.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk8 = findViewById(R.id.chk8);
        chk8.setChecked(isMyValueChecked8);
        chk8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk8", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk8.isChecked()) {
                    chk8.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });


        chk9 = findViewById(R.id.chk9);
        chk9.setChecked(isMyValueChecked9);
        chk9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk9", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk9.isChecked()) {
                    chk9.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk10 = findViewById(R.id.chk10);
        chk10.setChecked(isMyValueChecked10);
        chk10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk10", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk10.isChecked()) {
                    chk10.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk11 = findViewById(R.id.chk11);
        chk11.setChecked(isMyValueChecked11);
        chk11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk11", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk11.isChecked()) {
                    chk11.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk12 = findViewById(R.id.chk12);
        chk12.setChecked(isMyValueChecked12);
        chk12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk12", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk12.isChecked()) {
                    chk12.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk13 = findViewById(R.id.chk13);
        chk13.setChecked(isMyValueChecked13);
        chk13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk13", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk13.isChecked()) {
                    chk13.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk14 = findViewById(R.id.chk14);
        chk14.setChecked(isMyValueChecked14);
        chk14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk14", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk14.isChecked()) {
                    chk14.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk15 = findViewById(R.id.chk15);
        chk15.setChecked(isMyValueChecked15);
        chk15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk15", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk15.isChecked()) {
                    chk15.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk16 = findViewById(R.id.chk16);
        chk16.setChecked(isMyValueChecked16);
        chk16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk16", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk16.isChecked()) {
                    chk16.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk16 = findViewById(R.id.chk16);
        chk16.setChecked(isMyValueChecked16);
        chk16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk16", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk16.isChecked()) {
                    chk16.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk17 = findViewById(R.id.chk17);
        chk17.setChecked(isMyValueChecked17);
        chk17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk17", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk17.isChecked()) {
                    chk17.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk18 = findViewById(R.id.chk18);
        chk18.setChecked(isMyValueChecked18);
        chk18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk18", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk18.isChecked()) {
                    chk18.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk19 = findViewById(R.id.chk19);
        chk19.setChecked(isMyValueChecked19);
        chk19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk19", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk19.isChecked()) {
                    chk19.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk20 = findViewById(R.id.chk20);
        chk20.setChecked(isMyValueChecked20);
        chk20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk20", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk20.isChecked()) {
                    chk20.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk21 = findViewById(R.id.chk21);
        chk21.setChecked(isMyValueChecked21);
        chk21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk21", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk21.isChecked()) {
                    chk21.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk22 = findViewById(R.id.chk22);
        chk22.setChecked(isMyValueChecked22);
        chk22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk22", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk22.isChecked()) {
                    chk22.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk23 = findViewById(R.id.chk23);
        chk23.setChecked(isMyValueChecked23);
        chk23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk23", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk23.isChecked()) {
                    chk23.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk24 = findViewById(R.id.chk24);
        chk24.setChecked(isMyValueChecked24);
        chk24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk24", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk24.isChecked()) {
                    chk24.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk25 = findViewById(R.id.chk25);
        chk25.setChecked(isMyValueChecked25);
        chk25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk25", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk25.isChecked()) {
                    chk25.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

        chk26 = findViewById(R.id.chk26);
        chk26.setChecked(isMyValueChecked26);
        chk26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean("chk26", ((CheckBox) view).isChecked());
                editor.apply();
                if (chk26.isChecked()) {
                    chk26.setChecked(true);
                    //Toast.makeText(getApplicationContext(), "gpio1 checked", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}