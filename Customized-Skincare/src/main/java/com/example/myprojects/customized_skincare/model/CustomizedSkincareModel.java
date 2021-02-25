package com.example.myprojects.customized_skincare.model;

public class CustomizedSkincareModel {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String gender;

    int age;
    String skintype;
    String concern;
    public CustomizedSkincareModel(String name,String gender, int age, String skintype, String concern) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.skintype = skintype;
        this.concern = concern;
    }

    public CustomizedSkincareModel() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }


}
