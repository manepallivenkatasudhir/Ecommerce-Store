package com.example.manep.myecommerce.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.manep.myecommerce.MainActivity;
import com.example.manep.myecommerce.R;

import butterknife.BindView;



/**
 * Created by manep on 2/25/2018.
 */

public class SplashScreen extends Activity{
    String id = "";
    @BindView(R.id.splashscreen);
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
