package com.example.basmak3r.gz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imgview;
    private static Button buttonsbm;
    private int current_image;
    int[] images={R.drawable.im1,R.drawable.im2,R.drawable.im3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonclick();
        button2click();

    }
        public void buttonclick()
        {
            imgview=(ImageView)findViewById(R.id.imageView);
            buttonsbm=(Button)findViewById(R.id.button);
            buttonsbm.setOnClickListener(
                    new View.OnClickListener() {


                     @Override
                        public void onClick(View view) {
                            current_image++;
                            current_image=current_image % images.length;
                            imgview.setImageResource(images[current_image]);
                        }
                    }
            );
    }
         public void button2click()
        {
            imgview=(ImageView)findViewById(R.id.imageView);
            buttonsbm=(Button)findViewById(R.id.button2);
            buttonsbm.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent MainIntent = new Intent(MainActivity.this, MapsActivity.class);
                            startActivity(MainIntent);

                        }
                    }
            );
    }

}
