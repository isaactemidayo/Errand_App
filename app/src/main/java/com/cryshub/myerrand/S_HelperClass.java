package com.cryshub.myerrand;

public class S_HelperClass {

    String TypeOfFoodstuff, TypeOfMeal, OrderingLocation, DeliveryLocation, Date_ordered, Phone_number, Email, Full_name, Other_details;


    public S_HelperClass() {
    }

    public S_HelperClass(String typeOfFoodstuff, String typeOfMeal, String orderingLocation, String deliveryLocation, String date_ordered, String phone_number, String email, String full_name, String other_details) {
        TypeOfFoodstuff = typeOfFoodstuff;
        TypeOfMeal = typeOfMeal;
        OrderingLocation = orderingLocation;
        DeliveryLocation = deliveryLocation;
        Date_ordered = date_ordered;
        Phone_number = phone_number;
        Email = email;
        Full_name = full_name;
        Other_details = other_details;
    }

    public String getTypeOfFoodstuff() {
        return TypeOfFoodstuff;
    }

    public void setTypeOfFoodstuff(String typeOfFoodstuff) {
        TypeOfFoodstuff = typeOfFoodstuff;
    }

    public String getTypeOfMeal() {
        return TypeOfMeal;
    }

    public void setTypeOfMeal(String typeOfMeal) {
        TypeOfMeal = typeOfMeal;
    }

    public String getOrderingLocation() {
        return OrderingLocation;
    }

    public void setOrderingLocation(String orderingLocation) {
        OrderingLocation = orderingLocation;
    }

    public String getDeliveryLocation() {
        return DeliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        DeliveryLocation = deliveryLocation;
    }

    public String getDate_ordered() {
        return Date_ordered;
    }

    public void setDate_ordered(String date_ordered) {
        Date_ordered = date_ordered;
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
