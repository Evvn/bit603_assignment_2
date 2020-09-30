package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sign in button logic
        final Button buttonSignIn = findViewById(R.id.buttonSignIn);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // if credentials are correct, nav to main Inventory activity screen
                Intent i = new Intent(getApplicationContext(), InventoryActivity.class);
                startActivity(i);
            }
        });

        // alert dialog stuff here
//        private void DialogTest1() {
//            // Instantiate
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            // Set characteristics
//            builder.setMessage("Messages goes here!")
//                    .setTitle("Dialog title...");
//
//            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int id) {
//                    // OK button was clicked
//                }
//            });
//            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int id) {
//                    // Cancel button was clicked
//                }
//            });
//            // Get AlertDialog
//            AlertDialog dialog = builder.create();
//
//            // Show dialog
//            dialog.show();
//        }

        // list dialog stuff here
//        private void DialogTest3() {
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setTitle(R.string.dialog_test3_title);
//            builder.setNegativeButton(R.string.dialog_test3_cancel, new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int id) {
//                    // Cancel button was clicked
//                }
//            });
//            String dialog_options[] = { "Apple", "Orange", "Banana", "Pear" };
//            builder.setItems(dialog_options, new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int which) {
//                    // Code to run when an option is clicked
//                     Toast.makeText(MainActivity.this, "You selected " + dialog_options[which], Toast.LENGTH_SHORT).show();
//                }
//            });
//            AlertDialog dialog = builder.create();
//            dialog.show();
//        }
    }
}