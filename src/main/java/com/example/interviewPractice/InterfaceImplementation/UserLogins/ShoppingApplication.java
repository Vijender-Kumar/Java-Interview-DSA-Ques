package com.example.interviewPractice.InterfaceImplementation.UserLogins;

public class ShoppingApplication {
    public static void main(String[] args){
        User cust = new CustomerUser("VijenderCustomer", "1234");
        User admin = new AdminUser("VijuAdmin", "1234");

        if(admin.login("VijuAdmin", "1234")){
            admin.postLoginActions();
        }
        if(cust.login("VijenderCustomer", "1234")){
            cust.postLoginActions();
        }
        if(cust.login("VijuAdmin", "1234")){
            cust.postLoginActions();
        }
        if(admin.login("VijenderCustomer", "1234")){
            admin.postLoginActions();
        }
    }
}
