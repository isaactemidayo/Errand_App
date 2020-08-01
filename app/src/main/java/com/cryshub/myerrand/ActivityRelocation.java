package com.cryshub.myerrand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityRelocation extends AppCompatActivity {

    TextInputLayout PackingFrom, PackingTo, PackingWhat, RelocationDate, Phone_number, Email, Full_name, Other_details;

    Button sendmessage;
    DatabaseReference reff;
    R_HelpClass r_helpClass;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relocation);

        PackingFrom = findViewById(R.id.reg_packing_from);
        PackingTo = findViewById(R.id.reg_packing_to);
        PackingWhat = findViewById(R.id.reg_packing_what);
        RelocationDate = findViewById(R.id.reg_date_relocation);
        Other_details = findViewById(R.id.reg_other_details);
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

                String packingfrom = PackingFrom.getEditText().getText().toString();
                String packingto = PackingTo.getEditText().getText().toString();
                String packingwhat = PackingWhat.getEditText().getText().toString();
                String relocationdate = RelocationDate.getEditText().getText().toString();
                String otherdetails = Other_details.getEditText().getText().toString();
                String fullname = Full_name.getEditText().getText().toString();
                String phonenumber = Phone_number.getEditText().getText().toString();
                String email = Email.getEditText().getText().toString();

                R_HelpClass r_helpClass = new R_HelpClass (packingfrom, packingto, packingwhat, relocationdate, otherdetails, fullname, phonenumber, email);

                reference.child(phonenumber).setValue(r_helpClass);

                Toast.makeText(ActivityRelocation.this, "Order received successfully", Toast.LENGTH_LONG).show();


            }
        });

    }
}