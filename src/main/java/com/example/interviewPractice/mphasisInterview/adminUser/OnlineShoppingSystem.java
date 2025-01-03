package com.example.interviewPractice.mphasisInterview.adminUser;

public class OnlineShoppingSystem {
    public static void main(String[] args){
        User customer = new Customer("Vijender", "Viju@123");
        User admin = new Admin("Vijender Kumar", "Viju@12");

        if(customer.login("Vijender", "Viju@123")){
            customer.postLoginActions();
        }

        if(admin.login("Vijender Kumar", "Viju@12")){
            admin.postLoginActions();
        }

        if(customer.login("Viju", "Viju@12")){
            admin.postLoginActions();
        }

        if(admin.login("Vij", "Viju@12")){
            admin.postLoginActions();
        }
    }
}
