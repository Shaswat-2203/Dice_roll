package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private Random rand=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.imageView1);
        image2=findViewById(R.id.imageView2);

    }
    public void rollit(View view)
    {
        dice();
    }
    public void dice(){
        int myran=rand.nextInt(6)+1;
        int myra=rand.nextInt(6)+1;

        switch (myran)
        {
            case 1:
                image1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice6);
                break;
        }
        switch (myra)
        {
            case 1:
                image2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
