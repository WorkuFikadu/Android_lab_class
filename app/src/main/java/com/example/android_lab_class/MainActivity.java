package com.example.android_lab_class;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Android Lab Class - Lab 1: My First Android App
 *
 * Implements the lecture demo shown in class:
 * - Links views via findViewById
 * - Handles Button click listeners
 * - Reads text from EditText
 * - Displays Toast notifications and updates TextView
 * - Handles input validation and clear actions
 */
public class MainActivity extends AppCompatActivity {

    TextView ftxt;
    EditText name_edit1;
    Button bt1;
    Button clearbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_demo);

        // Bind UI components with their XML IDs
        ftxt = (TextView) findViewById(R.id.fname);
        name_edit1 = (EditText) findViewById(R.id.name_edit1);
        bt1 = (Button) findViewById(R.id.savebt);
        clearbt = (Button) findViewById(R.id.clearbt);

        // Test 1 & 2: Submit button handling
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = name_edit1.getText().toString().trim();

                // Test 2: Leave field empty and press Submit -> ask to enter name
                if (name.isEmpty()) {
                    String errorMsg = getString(R.string.empty_name_error);
                    Toast.makeText(getApplicationContext(), errorMsg, Toast.LENGTH_SHORT).show();
                    ftxt.setText(errorMsg);
                    ftxt.setTextColor(0xFFDC2626); // Alert red
                    name_edit1.setError(errorMsg);
                    name_edit1.requestFocus();
                } else {
                    // Test 1: Enter name (e.g. Worku) -> show "Hello, Worku!"
                    String greeting = "Hello, " + name + "!";
                    Toast.makeText(getApplicationContext(), greeting, Toast.LENGTH_LONG).show();
                    ftxt.setText(greeting);
                    ftxt.setTextColor(0xFF1E3A8A); // Primary navy
                    name_edit1.setError(null);
                }
            }
        });

        // Test 3: Clear button handling -> name and greeting disappear
        clearbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name_edit1.setText("");
                ftxt.setText("");
                name_edit1.setError(null);
                name_edit1.requestFocus();
                Toast.makeText(getApplicationContext(), "Cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
