package com.example.steven.peak2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
    }
    public void goToDrinks(View view){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
    public void goToFood(View view){
        Intent intent = new Intent(this,FoodMenuActivity.class);
        startActivity(intent);
    }
    public void goToTotal(View view){
        Intent intent = new Intent(this,TotalActivity.class);
        startActivity(intent);
    }
}
