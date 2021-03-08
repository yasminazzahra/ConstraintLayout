package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edEmail, edPassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=findViewById(R.id.buttonlgn);
        edEmail=findViewById(R.id.inpEmail);
        edPassword=findViewById(R.id.inpPass);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();

                if(InputData() == true){
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Berhasil, \n Email : "+nama+"\nPassword : "+password,Toast.LENGTH_LONG);
                    y.show();
                }
                else{
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Tidak Berhasil", Toast.LENGTH_LONG);
                    y.show();
                }
            }
        });

    }
    public boolean InputData()
    {
        String emailActive = "yasminazzahra.ya@gmail.com";
        String passActive = "achii24";

        if(emailActive.equals(edEmail.getText().toString()) && passActive.equals(edPassword.getText().toString())){
            return true;
        }
        return false;
    }
}