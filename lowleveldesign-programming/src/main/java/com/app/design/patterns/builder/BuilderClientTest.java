package com.app.design.patterns.builder;

public class BuilderClientTest {

    public static void main(String[] args) {

        User user = new User.Userbuilder(1,"Dinesh Sahu").phoneNumber("9739310902").age(30).build();
        System.out.println("User is - " + user);
    }
}
