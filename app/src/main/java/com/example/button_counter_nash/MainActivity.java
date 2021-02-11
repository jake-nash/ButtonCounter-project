package com.example.button_counter_nash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private Button decByOne, incByOne, incByFive, decByFive, incByTen, decByTen, resetButton;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "I entered into onCreate()");

        display = findViewById(R.id.displayCountId);

        decByOne = findViewById(R.id.decrementByOneId);
        decByOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Down 1", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Decremented by 1  *******************");
                decrementCounter(1);
            }
        });

        decByFive = findViewById(R.id.decrementByFiveId);
        decByFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Down 5", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Decremented by 5  *******************");
                decrementCounter(5);
            }
        });

        decByTen = findViewById(R.id.decrementByTenId);
        decByTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Down 10", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Decremented by 10  *******************");
                decrementCounter(10);
            }
        });

        incByOne = findViewById(R.id.incrementByOneId);
        incByOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
//                Toast.makeText(getApplicationContext(), "Up 1", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Incremented  *******************");
                incrementCounter(1);
            }
         });

        incByFive = findViewById(R.id.incrementByFiveId);
        incByFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Up 5", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Incremented by 5  *******************");
                incrementCounter(5);
            }
        });

        incByTen = findViewById(R.id.incrementByTenId);
        incByTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Up 10", Toast.LENGTH_SHORT).show();
                Log.i("mainActivity", "*******************  Incremented by 10  *******************");
                incrementCounter(10);
            }
        });

        resetButton = findViewById(R.id.resetButtonId);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
//            Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_SHORT).show();
            Log.i("mainActivity", "*******************  Count Reset  *******************");
            resetCounter();
            }
        });
    }

    private void decrementCounter(int x) {
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue -= x;
        display.setText(String.valueOf(currentValue));
    }

    private void resetCounter() {
        display.setText("0");
    }

    private void incrementCounter(int x) {
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue += x;
        display.setText(String.valueOf(currentValue));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String counterValue = display.getText().toString();
        outState.putString("display",counterValue);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String counterValue = savedInstanceState.getString("display");
        display.setText(counterValue);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"I entered into onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"I entered into onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"I entered into onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"I entered into onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"I entered into onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"I entered into onDestroy()");
    }
}