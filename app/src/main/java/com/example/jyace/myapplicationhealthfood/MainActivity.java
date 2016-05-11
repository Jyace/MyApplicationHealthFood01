package com.example.jyace.myapplicationhealthfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.btn_foodlist);
        bt2 = (Button) findViewById(R.id.yingyang_btn);
        bt3 = (Button) findViewById(R.id.food_about);
        bt1.setOnClickListener(this);

      //  bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);


    }

    @Override

    public void onClick(View v) {
switch(v.getId()){

    case R.id.btn_foodlist:Intent intent=new Intent();
        intent.setClass(MainActivity.this, FoodList.class);
        startActivity(intent);
        bt1.setBackgroundResource(R.drawable.btn_food_list_active);break;
 //   case R.id.yingyang_btn:break;
    case R.id.food_about:Intent intent1=new Intent(this, About.class);
        startActivity(intent1);
        bt3.setBackgroundResource(R.drawable.btn_food_about_active);break;


}

    }


    }

