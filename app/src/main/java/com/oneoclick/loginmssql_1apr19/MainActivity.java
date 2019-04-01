package com.oneoclick.loginmssql_1apr19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ConnectionClass connectionClass;
    EditText edtuserid, edtpass;
    Button btnlogin;
    ProgressBar pbbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        connectionClass = new ConnectionClass();
        edtuserid = (EditText) findViewById(R.id.editText);
        edtpass = (EditText) findViewById(R.id.editText2);
        btnlogin = (Button) findViewById(R.id.btn_login);
        pbbar = (ProgressBar) findViewById(R.id.progressBar);
        pbbar.setVisibility(View.GONE);


        




    }//onCreate

}//main
