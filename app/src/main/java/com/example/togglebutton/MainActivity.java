package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton1,toggleButton2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){

        toggleButton1 = (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton)findViewById(R.id.toggleButton2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result =new StringBuilder();
                result.append("ToggleButton1 :").append(toggleButton1.getText());
                result.append("\nToggleButton2 :").append(toggleButton2.getText());

                Toast.makeText(getApplicationContext(),result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
