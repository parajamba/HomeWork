package com.example.user.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.redCars).setSelected(true);
        findViewById(R.id.greenPedestrians).setSelected(true);
    }

        View temp = findViewById(R.id.button2);

    public void TrafficLight(View view){

        if(view.getId() == temp.getId()) {

            int count= 3;

            while(count>0){

                new Timer().schedule(
                        new java.util.TimerTask(){
                            @Override
                            public void run(){
                                findViewById(R.id.greenPedestrians).setSelected(true);
                            }
                        }, 1000
                );

                new Timer().schedule(
                        new java.util.TimerTask(){
                            @Override
                            public void run(){
                                findViewById(R.id.greenPedestrians).setSelected(true);
                            }
                        }, 3000
                );

                count--;
            }

            findViewById(R.id.greenPedestrians).setSelected(false);
            findViewById(R.id.yellowPedestrians).setSelected(true);

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.yellowPedestrians).setSelected(false);
                        }
                    }, 3000
            );

            findViewById(R.id.textView2).setSelected(true);

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.yellowCars).setSelected(true);
                        }
                    }, 3000
            );

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.redCars).setSelected(false);
                            findViewById(R.id.yellowCars).setSelected(false);
                            findViewById(R.id.greenCars).setSelected(true);
                        }
                    }, 3000
            );

        }

        else{

            int count= 3;

            while(count>0){

                new Timer().schedule(
                        new java.util.TimerTask(){
                            @Override
                            public void run(){
                                findViewById(R.id.greenCars).setSelected(true);
                            }
                        }, 1000
                );

                new Timer().schedule(
                        new java.util.TimerTask(){
                            @Override
                            public void run(){
                                findViewById(R.id.greenCars).setSelected(true);
                            }
                        }, 3000
                );

                count--;
            }

            findViewById(R.id.greenCars).setSelected(false);
            findViewById(R.id.yellowCars).setSelected(true);

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.yellowCars).setSelected(false);
                        }
                    }, 3000
            );

            findViewById(R.id.textView2).setSelected(true);

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.yellowPedestrians).setSelected(true);
                        }
                    }, 3000
            );

            new Timer().schedule(
                    new java.util.TimerTask(){
                        @Override
                        public void run(){
                            findViewById(R.id.redPedestrians).setSelected(false);
                            findViewById(R.id.yellowPedestrians).setSelected(false);
                            findViewById(R.id.greenPedestrians).setSelected(true);
                        }
                    }, 3000
            );
        }
    }
}
