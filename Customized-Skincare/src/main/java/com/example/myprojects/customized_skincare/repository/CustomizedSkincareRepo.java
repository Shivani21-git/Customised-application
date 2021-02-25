package com.example.myprojects.customized_skincare.repository;

import com.example.myprojects.customized_skincare.model.ModelForDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizedSkincareRepo extends CrudRepository<ModelForDb,Integer> {
}
