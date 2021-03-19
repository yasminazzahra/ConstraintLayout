package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hal2 extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("Parameter1");
        String pass = bundle.getString("Parameter2");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
