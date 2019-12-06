package com.maria.osseevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {
    private ImageView bouncing_castles, face_art, cotton_candy;
    private ImageView popcorn, entertainment, decorations;
    private ImageView music, photography, lighting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        bouncing_castles = (ImageView) findViewById(R.id.bouncing_castle) ;
        face_art = (ImageView) findViewById(R.id.face_art) ;
        cotton_candy = (ImageView) findViewById(R.id.cotton_candy) ;

        popcorn = (ImageView) findViewById(R.id.popcorn) ;
        entertainment = (ImageView) findViewById(R.id.entertainment) ;
        decorations = (ImageView) findViewById(R.id.decorations) ;

        music = (ImageView) findViewById(R.id.music) ;
        photography = (ImageView) findViewById(R.id.photography) ;
        lighting = (ImageView) findViewById(R.id.lighting) ;


        bouncing_castles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bouncing Castles");
                startActivity(intent);
            }
        });

        face_art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Face Art");
                startActivity(intent);
            }
        });

        cotton_candy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cotton Candy");
                startActivity(intent);
            }
        });

        popcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Popcorn");
                startActivity(intent);
            }
        });

        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Entertainment");
                startActivity(intent);
            }
        });

        decorations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Decorations");
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Music");
                startActivity(intent);
            }
        });

        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Photography");
                startActivity(intent);
            }
        });

        lighting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Lighting");
                startActivity(intent);
            }
        });

    }
}
