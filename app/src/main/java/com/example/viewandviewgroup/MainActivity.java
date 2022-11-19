package com.example.viewandviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Xiaomi Note 10s");
        }

        Button btnBeli = findViewById(R.id.btn_beli);
        btnBeli.setOnClickListener(this);

        ImageView ivCS = findViewById(R.id.iv_cs);
        ivCS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_beli:
                Intent intent = new Intent(MainActivity.this, Terbeli.class);
                startActivity(intent);
                break;
            case R.id.iv_cs:
                String phoneNumber = "081234567890";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}