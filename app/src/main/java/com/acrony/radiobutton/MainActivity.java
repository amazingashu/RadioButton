package com.acrony.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnClick;
RadioButton generateButton;
RadioGroup rbGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbGroup=(RadioGroup)findViewById(R.id.radioGroup);
        btnClick=(Button) findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButton=rbGroup.getCheckedRadioButtonId();
                generateButton=(RadioButton)findViewById(selectedButton);

                if(selectedButton==-1)
                {
                    Toast.makeText(MainActivity.this,"Nothing Selected",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,generateButton.getText(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
