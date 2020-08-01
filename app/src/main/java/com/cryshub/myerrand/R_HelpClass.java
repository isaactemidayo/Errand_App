package com.cryshub.myerrand;

public class R_HelpClass {

    String PackingFrom, PackingTo, PackingWhat, RelocationDate, Phone_number, Email, Full_name, Other_details;

    public R_HelpClass() {
    }

    public R_HelpClass(String packingFrom, String packingTo, String packingWhat, String relocationDate, String phone_number, String email, String full_name, String other_details) {
        PackingFrom = packingFrom;
        PackingTo = packingTo;
        PackingWhat = packingWhat;
        RelocationDate = relocationDate;
        Phone_number = phone_number;
        Email = email;
        Full_name = full_name;
        Other_details = other_details;
    }

    public String getPackingFrom() {
        return PackingFrom;
    }

    public void setPackingFrom(String packingFrom) {
        PackingFrom = packingFrom;
    }

    public String getPackingTo() {
        return PackingTo;
    }

    public void setPackingTo(String packingTo) {
        PackingTo = packingTo;
    }

    public String getPackingWhat() {
        return PackingWhat;
    }

    public void setPackingWhat(String packingWhat) {
        PackingWhat = packingWhat;
    }

    public String getRelocationDate() {
        return RelocationDate;
    }

    public void setRelocationDate(String relocationDate) {
        RelocationDate = relocationDate;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public String getOther_details() {
        return Other_details;
    }

    public void setOther_details(String other_details) {
        Other_details = other_details;
    }
}
