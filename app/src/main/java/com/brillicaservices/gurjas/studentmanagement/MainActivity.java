package com.brillicaservices.gurjas.studentmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText studentName, studentPhone, studentAddress;
    Button submitButton;
    ArrayList<StudentModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentName = findViewById(R.id.ma_name);
        studentPhone = findViewById(R.id.ma_phone);
        studentAddress = findViewById(R.id.ma_address);
        submitButton = findViewById(R.id.ma_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = studentName.getText().toString();
                long phone = Long.parseLong(studentPhone.getText().toString());
                String address = studentAddress.getText().toString();

                arrayList.add(new StudentModel(name, phone, address));
            }
        });
    }
}
