package com.app.design.patterns.CreationalDesignPatter.builder;

public class User {

    private int id;
    private String name;
    private String phoneNumber;
    private int age;

    private User(Userbuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;

    }

    public static class Userbuilder {
        private int id;
        private String name;
        private String phoneNumber;
        private int age;

        public Userbuilder(int id, String name) {
            this.id = id;
            this.name = name;

        }

        public Userbuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Userbuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
