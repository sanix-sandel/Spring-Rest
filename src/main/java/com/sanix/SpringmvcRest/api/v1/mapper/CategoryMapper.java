package com.sanix.SpringmvcRest.api.v1.mapper;

import com.sanix.SpringmvcRest.api.v1.model.CategoryDTO;
import com.sanix.SpringmvcRest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);

    @Mapping(source="id", target="id")
    CategoryDTO categoryToCategory(Category category);
}
