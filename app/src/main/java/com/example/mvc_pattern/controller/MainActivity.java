package com.example.mvc_pattern.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvc_pattern.R;
import com.example.mvc_pattern.model.Americano;
import com.example.mvc_pattern.model.CafeLatte;
import com.example.mvc_pattern.model.TotalPrice;

//controller 에서 동작 방식
//1. 메뉴 수량 증감 요청(Model 에 요청)
//2. 수량 변경에 따른 UI 갱신(View 에 요청)
//3. 수량 증감에 따른 합계 가격 증감 요청(Model 에 요청)
//4. 수량 변경에 따른 합계 가격 UI 갱신(View 에 요청)

public class MainActivity extends AppCompatActivity {
    TextView count, total_result, latte_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Americano americano = new Americano();
        CafeLatte cafeLatte = new CafeLatte();
        TotalPrice totalPrice = new TotalPrice();

        count = findViewById(R.id.count);
        latte_count = findViewById(R.id.latte_count);
        total_result = findViewById(R.id.total_result);

        findViewById(R.id.down_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                americano.down();
                count.setText(String.valueOf(americano.getQuantity()));
                totalPrice.Americano_decreaseTotalPrice(americano.getPrice());
                total_result.setText(String.valueOf(totalPrice.getTotalPrice()));
            }
        });

        findViewById(R.id.up_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                americano.up();
                count.setText(String.valueOf(americano.getQuantity()));
                totalPrice.Americano_increaseTotalPrice(americano.getPrice());
                total_result.setText(String.valueOf(totalPrice.getTotalPrice()));
            }
        });

        findViewById(R.id.latte_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cafeLatte.up();
                latte_count.setText(String.valueOf(cafeLatte.getQuantity()));
                totalPrice.Latte_increaseTotalPrice(cafeLatte.getPrice());
                total_result.setText(String.valueOf(totalPrice.getTotalPrice()));
            }
        });

        findViewById(R.id.latte_down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cafeLatte.down();
                latte_count.setText(String.valueOf(cafeLatte.getQuantity()));
                totalPrice.Latte_decreaseTotalPrice(cafeLatte.getPrice());
                total_result.setText(String.valueOf(totalPrice.getTotalPrice()));
            }
        });

    }
}