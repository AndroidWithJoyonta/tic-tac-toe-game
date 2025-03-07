package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnReset;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count = 0;
    int flag = 0;
    RelativeLayout winName;
    TextView tvWiner;

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }


    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        winName = findViewById(R.id.winName);
        tvWiner = findViewById(R.id.tvWiner);

    }
    public void newGame(View v){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }

    public void thread(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame(null);
            }
        }, 2000);
    }

    public void check(View view){
        Button btnCurrent = (Button) view;
        if(btnCurrent.getText().toString().equals("")){

            count++;
            if(flag==0){
                btnCurrent.setText("X");
                flag=1;
            }else{
                btnCurrent.setText("O");
                flag=0;
            }
            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                //conditioning
                if(b1.equals(b2)&&b2.equals(b3)&&!b1.equals("")){
                    winName.setVisibility(View.VISIBLE);
                    tvWiner.setText("Winner is "+b1);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //1-2-3
                    //Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_LONG).show();
                    thread();
                }else if (b4.equals(b5)&&b5.equals(b6)&&!b4.equals("")) {
                    winName.setVisibility(View.VISIBLE);
                    tvWiner.setText("Winner is "+b4);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //3-4-5
                    //Toast.makeText(this, "Winner is "+b4, Toast.LENGTH_SHORT).show();
                    thread();
                }else if (b7.equals(b8)&&b8.equals(b9)&&!b7.equals("")) {
                    winName.setVisibility(View.VISIBLE);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    tvWiner.setText("Winner is "+b7);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //7-8-9
                    //Toast.makeText(this, "Winner is "+b7, Toast.LENGTH_SHORT).show();
                    thread();
                }else if(b1.equals(b4)&&b4.equals(b7)&&!b1.equals("")){
                    winName.setVisibility(View.VISIBLE);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    tvWiner.setText("Winner is "+b1);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);


                    //1-4-7
                    //Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                    thread();
                }else if(b2.equals(b5)&&b5.equals(b8)&&!b2.equals("")){
                    winName.setVisibility(View.VISIBLE);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    tvWiner.setText("Winner is "+b2);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //2-5-8
                    //Toast.makeText(this, "Winner is "+b2, Toast.LENGTH_SHORT).show();
                    thread();
                }else if(b3.equals(b6)&&b6.equals(b9)&&!b3.equals("")){
                    winName.setVisibility(View.VISIBLE);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    tvWiner.setText("Winner is "+b3);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //3-6-9
                    //Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                    thread();
                }else if(b1.equals(b5)&&b5.equals(b9)&&!b1.equals("")){
                    winName.setVisibility(View.VISIBLE);
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    tvWiner.setText("Winner is "+b1);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //1-5-9
                    //Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                    thread();
                }else if(b3.equals(b5)&&b5.equals(b7)&&!b3.equals("")){
                    audio = MediaPlayer.create(this, R.raw.high_score);
                    audio.start();
                    winName.setVisibility(View.VISIBLE);

                    tvWiner.setText("Winner is "+b3);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //3-5-9
                    //Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                    thread();
                }else if (count==9){
                    winName.setVisibility(View.VISIBLE);
                    tvWiner.setText("Match Draw!");
                    audio = MediaPlayer.create(this, R.raw.low_score);
                    audio.start();
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // This method will be executed once the timer is over
                            // Start your app main activity
                            winName.setVisibility(View.GONE);

                            // close this activity

                        }
                    }, 2000);
                    //Toast.makeText(this, "Match Draw!", Toast.LENGTH_LONG).show();
                    thread();
                }

            }

        }
    }
}