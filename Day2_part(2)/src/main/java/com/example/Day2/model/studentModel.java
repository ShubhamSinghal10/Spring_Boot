package com.example.Day2.model;

public class studentModel {

    private int id;
    private String name;
    private String email;

    public studentModel(){

    }
    public studentModel(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
