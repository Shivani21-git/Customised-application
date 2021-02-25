package com.example.myprojects.customized_skincare.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModelForProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String skintype;

    public ModelForProducts(String skintype) {
        this.skintype = skintype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype;
    }

}
