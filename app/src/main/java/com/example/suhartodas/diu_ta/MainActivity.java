package com.example.suhartodas.diu_ta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    btp=(Button)findViewById(R.id.buttonlogin);
          btp.setOnClickListener(this) ;


}


    public void onClick(View v) {

        Intent i=new Intent(MainActivity.this,leaveAdd.class);
        startActivity(i);
    }


}
