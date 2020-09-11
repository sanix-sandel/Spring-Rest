package com.sanix.SpringmvcRest.repositories;

import com.sanix.SpringmvcRest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
