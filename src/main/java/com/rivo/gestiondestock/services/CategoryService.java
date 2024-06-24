package com.rivo.gestiondestock.services;

import java.util.List;

import com.rivo.gestiondestock.dto.CategoryDto;

public interface CategoryService {

	  CategoryDto save(CategoryDto dto);

	  CategoryDto findById(Integer id);

	  CategoryDto findByCode(String code);

	  List<CategoryDto> findAll();

	  void delete(Integer id);

	}
