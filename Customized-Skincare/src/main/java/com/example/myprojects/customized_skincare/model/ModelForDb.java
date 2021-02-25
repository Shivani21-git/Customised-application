package com.example.myprojects.customized_skincare.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModelForDb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    //@OneToOne
    //ModelForProducts modelForProducts;
    String name;
    String gender;
    String skintype;
    String concern;
    @OneToMany(cascade = CascadeType.ALL)
    List<ModelForProducts> products = new ArrayList<>();
    int age;

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public ModelForDb() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ModelForProducts> getProducts() {
        return products;
    }

    public void setProducts(List<ModelForProducts> products) {
        this.products = products;
    }

    public ModelForDb(String name, String gender, String skintype, int age, String concern) {
        this.name = name;
        this.gender = gender;
        this.skintype = skintype;
        this.age = age;
        this.concern = concern;
    }





}
