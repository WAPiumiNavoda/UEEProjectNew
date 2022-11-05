package com.example.ueefoodprotectionapp;

public class MainModel {
//    String name,course,email,url;
//
//    public MainModel(String name, String course, String email, String url) {
//        this.name = name;
//        this.course = course;
//        this.email = email;
//        this.url = url;
//    }
//
//    public MainModel() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }

    String userName;
    String currentLocation;
    String address;
    String phone;
    String date;
    String time;

    public MainModel(){
    }

    public MainModel(String userName, String currentLocation, String address, String phone, String date, String time) {
        this.userName = userName;
        this.currentLocation = currentLocation;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.time = time;
    }

    public MainModel(String userName, String date, String time) {
        this.userName = userName;
        this.date = date;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
