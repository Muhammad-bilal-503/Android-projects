package com.example.kiyaniharib;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);



            TextView textView;
            ImageView imageView;
            Button btn;
            textView=findViewById(R.id.txtView);
            btn=findViewById(R.id.btn);
            imageView=findViewById(R.id.imageView);


            int[] imageRotator=  new int[]{
                    R.drawable.ball1,
                    R.drawable.ic_launcher_foreground,
                    R.drawable.bg_login_gradient,
                    R.drawable.ic_launcher_foreground
            };

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Random rn=  new Random();
                    int num=rn.nextInt();
                    imageView.setImageResource(imageRotator[num]);
                }
            });


            return insets;
        });
    }
}