package com.cryshub.myerrand;

public class PDHelpClass {

   String pickup, delivery, date_ordered, pickup_date, other_details, full_name, phone_number, m_email;

    public PDHelpClass() {

    }

    public PDHelpClass(String pickup, String delivery, String date_ordered, String pickup_date, String other_details, String full_name, String phone_number, String m_email) {
        this.pickup = pickup;
        this.delivery = delivery;
        this.date_ordered = date_ordered;
        this.pickup_date = pickup_date;
        this.other_details = other_details;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.m_email = m_email;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDate_ordered() {
        return date_ordered;
    }

    public void setDate_ordered(String date_ordered) {
        this.date_ordered = date_ordered;
    }

    public String getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(String pickup_date) {
        this.pickup_date = pickup_date;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getM_email() {
        return m_email;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }
}
