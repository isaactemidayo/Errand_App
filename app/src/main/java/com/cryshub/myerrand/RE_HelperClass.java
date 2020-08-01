package com.cryshub.myerrand;

public class RE_HelperClass {

    String BuyRent, MinBudget, MaxBudget, Beds, Baths, Phone_number, Email, Full_name, Other_details, Date_ordered;

    public RE_HelperClass() {
    }

    public RE_HelperClass(String buyRent, String minBudget, String maxBudget, String beds, String baths, String phone_number, String email, String full_name, String other_details, String date_ordered) {
        BuyRent = buyRent;
        MinBudget = minBudget;
        MaxBudget = maxBudget;
        Beds = beds;
        Baths = baths;
        Phone_number = phone_number;
        Email = email;
        Full_name = full_name;
        Other_details = other_details;
        Date_ordered = date_ordered;
    }

    public String getBuyRent() {
        return BuyRent;
    }

    public void setBuyRent(String buyRent) {
        BuyRent = buyRent;
    }

    public String getMinBudget() {
        return MinBudget;
    }

    public void setMinBudget(String minBudget) {
        MinBudget = minBudget;
    }

    public String getMaxBudget() {
        return MaxBudget;
    }

    public void setMaxBudget(String maxBudget) {
        MaxBudget = maxBudget;
    }

    public String getBeds() {
        return Beds;
    }

    public void setBeds(String beds) {
        Beds = beds;
    }

    public String getBaths() {
        return Baths;
    }

    public void setBaths(String baths) {
        Baths = baths;
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

    public String getDate_ordered() {
        return Date_ordered;
    }

    public void setDate_ordered(String date_ordered) {
        Date_ordered = date_ordered;
    }
}
