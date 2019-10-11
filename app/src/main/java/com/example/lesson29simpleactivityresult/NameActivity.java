package com.example.lesson29simpleactivityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName;

    Button btnOk;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        etName = findViewById(R.id.etName);
        btnOk = findViewById(R.id.btnOK);

        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", etName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
