package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

public class AdminCategoryActivity extends AppCompatActivity {

        private AppCompatImageView tShirts, sportsTShirts, femaleDresses, sweathers;
        private AppCompatImageView glasses, hatsCaps, walletsBagsPurses, shoes;
        private AppCompatImageView headPhonesHandFree, Laptops, watches, mobilePhones;

        private AppCompatButton LogoutBtn, CheckOrdersBtn;


        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_admin_category);


            LogoutBtn = findViewById(R.id.admin_logout_btn);
            CheckOrdersBtn = findViewById(R.id.check_orders_btn);






            LogoutBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
            });


            CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                    startActivity(intent);
                }
            });


            tShirts =  findViewById(R.id.t_shirts);
            sportsTShirts =  findViewById(R.id.sports_t_shirts);
            femaleDresses =  findViewById(R.id.female_dresses);
            sweathers =  findViewById(R.id.sweathers);

            glasses =  findViewById(R.id.glasses);
            hatsCaps =  findViewById(R.id.hats_caps);
            walletsBagsPurses =  findViewById(R.id.purses_bags_wallets);
            shoes =  findViewById(R.id.shoes);

            headPhonesHandFree =  findViewById(R.id.headphones_handfree);
            Laptops =  findViewById(R.id.laptop_pc);
            watches =  findViewById(R.id.watches);
            mobilePhones =  findViewById(R.id.mobilephones);


            tShirts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "tShirts");
                    startActivity(intent);
                }
            });


            sportsTShirts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Sports tShirts");
                    startActivity(intent);
                }
            });


            femaleDresses.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Female Dresses");
                    startActivity(intent);
                }
            });


            sweathers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Sweathers");
                    startActivity(intent);
                }
            });


            glasses.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Glasses");
                    startActivity(intent);
                }
            });


            hatsCaps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Hats Caps");
                    startActivity(intent);
                }
            });



            walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Wallets Bags Purses");
                    startActivity(intent);
                }
            });


            shoes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Shoes");
                    startActivity(intent);
                }
            });



            headPhonesHandFree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "HeadPhones HandFree");
                    startActivity(intent);
                }
            });


            Laptops.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Laptops");
                    startActivity(intent);
                }
            });


            watches.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Watches");
                    startActivity(intent);
                }
            });


            mobilePhones.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                    intent.putExtra("category", "Mobile Phones");
                    startActivity(intent);
                }
            });
        }
    }
