package com.example.listviewandroid37;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAdmin, etPass;
    TextView tvThongBao;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Oder Foods And Drinks");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAdmin = findViewById(R.id.etAdmin);
        etPass = findViewById(R.id.etPass);
        tvThongBao = findViewById(R.id.tvThongBao);
        btnSignIn = findViewById(R.id.btnSignIn);



        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str01 = "admin";
                String str1 = etAdmin.getText().toString();
                String str2 = etPass.getText().toString();


                if(str1.equals(str01) && str2.equals(str01)){
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }else {
                    tvThongBao.setText("Mật khẩu hoặc Tên đăng nhập sai, hãy thử lại");
                }

            }
        });

    }
}
