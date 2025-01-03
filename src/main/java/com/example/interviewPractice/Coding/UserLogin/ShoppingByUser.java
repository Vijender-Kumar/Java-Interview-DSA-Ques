package com.example.interviewPractice.Coding.UserLogin;

public class ShoppingByUser {
    public static void main(String[] args){
        User admin = new AdminUser("VijAdmin", "V1234");
        User cust = new CustomerUser("VijCust", "V123");

        if(admin.login("VijAdmin", "V1234")){
            admin.postLoginActions();
        }
        if(cust.login("VijCust", "V123")){
            cust.postLoginActions();
        }

        if(cust.login("VijAdmin", "V1234")){
            cust.postLoginActions();
        }
        if(admin.login("VijCust", "V123")){
            admin.postLoginActions();
        }
    }
}
