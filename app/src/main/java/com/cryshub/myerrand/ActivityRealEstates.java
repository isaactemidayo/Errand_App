package com.cryshub.myerrand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityRealEstates extends AppCompatActivity {

    TextInputLayout BuyRent, MinBudget, MaxBudget, Beds, Baths, Phone_number, Email, Full_name, Other_details, Date_ordered;

    Button sendmessage;
    DatabaseReference reff;
    RE_HelperClass re_helperClass;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_estates);

        BuyRent = findViewById(R.id.reg_buyrent);
        MinBudget = findViewById(R.id.reg_min_budget);
        MaxBudget = findViewById(R.id.reg_max_budget);
        Beds = findViewById(R.id.reg_beds);
        Baths = findViewById(R.id.reg_baths);
        Other_details = findViewById(R.id.reg_other_details);
        Date_ordered = findViewById(R.id.reg_date_ordered);
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

                String buyrent = BuyRent.getEditText().getText().toString();
                String min_budget = MinBudget.getEditText().getText().toString();
                String max_budget = MaxBudget.getEditText().getText().toString();
                String beds = Beds.getEditText().getText().toString();
                String baths = Baths.getEditText().getText().toString();
                String date_ordered = Date_ordered.getEditText().getText().toString();
                String otherdetails = Other_details.getEditText().getText().toString();
                String fullname = Full_name.getEditText().getText().toString();
                String phonenumber = Phone_number.getEditText().getText().toString();
                String email = Email.getEditText().getText().toString();

                RE_HelperClass re_helperClass = new RE_HelperClass (buyrent, min_budget, max_budget, beds, baths, date_ordered, otherdetails, fullname, phonenumber, email);

                reference.child(phonenumber).setValue(re_helperClass);

                Toast.makeText(ActivityRealEstates.this, "Order received successfully", Toast.LENGTH_LONG).show();


            }
        });

    }
}