package com.cryshub.myerrand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivitySupply extends AppCompatActivity {

    TextInputLayout TypeOfFoodstuff, TypeOfMeal, OrderingLocation, DeliveryLocation, Date_ordered, Phone_number, Email, Full_name, Other_details;

    Button sendmessage;
    DatabaseReference reff;

    S_HelperClass s_helperClass;
    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supply);

        TypeOfFoodstuff = findViewById(R.id.reg_type_of_foodstuff);
        TypeOfMeal = findViewById(R.id.reg_type_of_meal);
        OrderingLocation = findViewById(R.id.reg_ordering_location);
        DeliveryLocation = findViewById(R.id.reg_delivery_location);
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
                reference = rootNode.getReference("Supply of Food");

                //Get all the values pickup, delivery, pickup_date, other_details, full_name, phone_number, m_email

                String type_of_foodstuff = TypeOfFoodstuff.getEditText().getText().toString();
                String type_of_meal = TypeOfMeal.getEditText().getText().toString();
                String ordering_location = OrderingLocation.getEditText().getText().toString();
                String delivery_location = DeliveryLocation.getEditText().getText().toString();
                String date_ordered = Date_ordered.getEditText().getText().toString();
                String otherdetails = Other_details.getEditText().getText().toString();
                String fullname = Full_name.getEditText().getText().toString();
                String phone_number = Phone_number.getEditText().getText().toString();
                String email = Email.getEditText().getText().toString();

                S_HelperClass s_helperClass = new S_HelperClass (type_of_foodstuff, type_of_meal, ordering_location, delivery_location, date_ordered, otherdetails, fullname, phone_number, email);

                reference.child(phone_number).setValue(s_helperClass);

                Toast.makeText(ActivitySupply.this, "Order received successfully", Toast.LENGTH_LONG).show();


            }
        });

    }
}