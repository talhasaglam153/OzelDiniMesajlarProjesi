package com.TCoding.zelmesajlarprojesi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread mySplash ;
        mySplash = new Thread(){
            @Override
            public void run() {
                try {
                synchronized (this){
                    wait(1500);
                }
                }catch (InterruptedException ex){

                }finally {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
            }
        };
        mySplash.start();
    }
}
