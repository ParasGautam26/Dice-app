package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutton;
        int mynumber;
        rollbutton = findViewById(R.id.button);
        final ImageView leftdice = findViewById(R.id.image_leftdice);
        final ImageView rightdice = findViewById(R.id.image_rightdice);

        final int[] array = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","roll has been pressed");
                Random ran = new Random();
                int num = ran.nextInt(6);

                leftdice.setImageResource(array[num]);
                num = ran.nextInt(6);
                rightdice.setImageResource(array[num]);
            }
        });
    }
}
