package com.example.profileth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DangNhapActivity extends AppCompatActivity {
            Button dangnhap;
            TextView dangky;
            EditText tendangnhap, matkhau;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.dangnhap);
                dangnhap = (Button) findViewById(R.id.dangnhap);
                dangky =(TextView) findViewById(R.id.dangky);
                tendangnhap =(EditText) findViewById(R.id.tendangnhap);
                matkhau = (EditText) findViewById(R.id.matkhau);
                dangnhap.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(DangNhapActivity.this,Profile2Activity.class);
                        if(tendangnhap.getText().toString().equals("") || matkhau.getText().toString().equals("")){
                            Toast.makeText(DangNhapActivity.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                        }
                        else
                        if (tendangnhap.getText().toString().equals("t") && matkhau.getText().toString().equals("1")){
                            Toast.makeText(DangNhapActivity.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(DangNhapActivity.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
                        }


                    }
                });
                dangky.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent(DangNhapActivity.this, DangkyActivity.class);

                        startActivity(in);
                    }
                });
            }
        };

