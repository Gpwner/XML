package com.example.geekp.intent;

import android.content.Intent;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Looper
        setContentView(R.layout.activity_first);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                显式Intent
//                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
//                隐式Intent
                Intent intent = new Intent();
                intent.setAction("android.intent.action.ACTION_START");
                if(null!=intent.resolveActivity(getPackageManager()))
                startActivity(intent);
                else
                    Toast.makeText(v.getContext(),"intent没有响应对象",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
