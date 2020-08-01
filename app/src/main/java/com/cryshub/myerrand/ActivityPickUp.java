package com.cryshub.myerrand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityPickUp extends AppCompatActivity {

    TextInputLayout Pickup, Delivery, Date_ordered, Pickup_date, Phone_number, Email, Full_name, Other_details;

    Button sendmessage;
    DatabaseReference reff;
    PDHelpClass pmb;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);

        Pickup = findViewById(R.id.reg_pickup);
        Delivery = findViewById(R.id.reg_delivery);
        Other_details = findViewById(R.id.reg_other_details);
        Date_ordered = findViewById(R.id.reg_date_ordered);
        Pickup_date = findViewById(R.id.reg_pickup_date);
        Full_name = findViewById(R.id.reg_full_name);
        Phone_number = findViewById(R.id.reg_phone_number);
        Email = findViewById(R.id.reg_email);
        sendmessage = findViewById(R.id.sendmessage);


        sendmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Pickup and Delivery");

                //Get all the values pickup, delivery, pickup_date, other_details, full_name, phone_number, m_email

                String pickup_area = Pickup.getEditText().getText().toString();
                String delivery_area = Delivery.getEditText().getText().toString();
                String date_ordered = Date_ordered.getEditText().getText().toString();
                String pickUpDate = Pickup_date.getEditText().getText().toString();
                String otherdetails = Other_details.getEditText().getText().toString();
                String fullname = Full_name.getEditText().getText().toString();
                String phonenumber = Phone_number.getEditText().getText().toString();
                String email = Email.getEditText().getText().toString();

                PDHelpClass pdHelpClass = new PDHelpClass (pickup_area, delivery_area, date_ordered, pickUpDate, otherdetails, fullname, phonenumber, email);

                reference.child(phonenumber).setValue(pdHelpClass);

                Toast.makeText(ActivityPickUp.this, "Order received successfully", Toast.LENGTH_LONG).show();


            }
        });

    }
}