package com.michel.dscommerce.services;

import com.michel.dscommerce.dto.CategoryDTO;
import com.michel.dscommerce.entities.Category;
import com.michel.dscommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map((CategoryDTO::new)).collect(Collectors.toList());
    }
}
