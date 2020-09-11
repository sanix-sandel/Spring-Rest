package com.sanix.SpringmvcRest.services;

import com.sanix.SpringmvcRest.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
