package com.example.life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        myToast.show();
    }
}
