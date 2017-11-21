package com.example.gurjantsidhu.exam_practice_form;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,dob,phone,sh;

    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       name=(EditText)findViewById(R.id.f_name);
        dob=(EditText)findViewById(R.id.f_dob);
        phone=(EditText)findViewById(R.id.f_phone);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
       // sh=(EditText)findViewById(R.id.editText5);
    }

    public void show_data(View view) {
        String name_data=name.getText().toString();
        String dob_data=dob.getText().toString();
        String phone_data=phone.getText().toString();
        int radio=rg.getCheckedRadioButtonId();
       RadioButton rb=(RadioButton)findViewById(R.id.radio);
        String rb_data= (String) rb.getText();
       String complete=name_data+" "+dob_data+" "+phone_data+" "+rb_data;
     //  sh.setText(complete);
        Toast.makeText(MainActivity.this,complete, Toast.LENGTH_LONG).show();
    }
}
