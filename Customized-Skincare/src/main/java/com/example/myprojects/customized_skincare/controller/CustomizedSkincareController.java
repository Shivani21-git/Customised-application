package com.example.myprojects.customized_skincare.controller;

import com.example.myprojects.customized_skincare.model.CustomizedSkincareModel;
import com.example.myprojects.customized_skincare.model.ModelForDb;
import com.example.myprojects.customized_skincare.model.ModelForProducts;
import com.example.myprojects.customized_skincare.repository.CustomizedSkincareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class CustomizedSkincareController {
  //  Map<String, CustomizedSkincareModel> detailsDB = new HashMap<>();



    @Autowired
    CustomizedSkincareRepo repo;

  //  static  Map<Integer, String>   ageWiseCreams = new HashMap<>();

/*    static {
        ageWiseCreams.put(20,"Kiehls face wash");
        ageWiseCreams.put(30,"Kiehls serum");
        ageWiseCreams.put(40,"Kiehls Moisturizer");
        ageWiseCreams.put(50,"Kiehls face oil");
    } */


    @GetMapping("/customisedSkincare/{naam}")
    public String indexPageMethod(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name, @PathVariable(value = "naam") String naam)
    {
        model.addAttribute("name",  name);
        model.addAttribute("naam",  naam);
        return "index_page.jsp";
    }
    @GetMapping("/filldetails")
    public String formMethod(Map<String,Object> model)
    {
        model.put("details", new CustomizedSkincareModel());
        return "formpage.jsp";
    }
    @PostMapping("/submit")
    public String registerDost(@ModelAttribute("details") CustomizedSkincareModel details,Model model) {
        ModelForDb dbobject = new ModelForDb();
        dbobject.setAge(details.getAge());
        dbobject.setGender(details.getGender());
        dbobject.setName(details.getName());
        dbobject.setConcern(details.getConcern());
        dbobject.setSkintype(details.getSkintype());
        if("dry".equalsIgnoreCase(details.getSkintype())) {
            ModelForProducts modelForProducts2 = new ModelForProducts("Dry");
            ModelForProducts modelForProducts1 = new ModelForProducts("Oily");
            dbobject.setProducts(Arrays.asList(modelForProducts1,modelForProducts2));
        } else if("oily".equalsIgnoreCase(details.getSkintype())) {
            ModelForProducts modelForProducts3 = new ModelForProducts("Oily1");
            ModelForProducts modelForProducts4 = new ModelForProducts("Dry1");
            dbobject.setProducts(Arrays.asList(modelForProducts3,modelForProducts4));
        }
        ModelForDb objfromDb = repo.save(dbobject);


        ModelForDb  objBySearch = repo.findById(objfromDb.getId()).get();

    /*    List<String> recommandedproducts = ageWiseCreams.
                entrySet().
                stream().
                filter(e -> e.getKey() <= details.getAge()).map( e -> e.getValue()).collect(Collectors.toList()); */
        model.addAttribute("name", objBySearch.getName());
        model.addAttribute("products",objBySearch.getProducts());
        return "submit.jsp";
    }
}
