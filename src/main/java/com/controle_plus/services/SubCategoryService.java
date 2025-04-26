package com.controle_plus.services;

import com.controle_plus.mappers_dto.SubCategoryDTO;
import com.controle_plus.mappers_dto.SubCategoryMapper;
import com.controle_plus.model.SubCategoryModel;
import com.controle_plus.repository.SubCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubCategoryService {

    private final SubCategoryRepository subCategoryRepository;
    private final SubCategoryMapper subCategoryMapper;

    public SubCategoryService(SubCategoryRepository subCategoryRepository, SubCategoryMapper subCategoryMapper) {
        this.subCategoryRepository = subCategoryRepository;
        this.subCategoryMapper = subCategoryMapper;
    }

    //Create Sub-Category
    public SubCategoryDTO createSubCategory(SubCategoryDTO subCategoryDTO){
        SubCategoryModel newSubCategory = subCategoryMapper.map(subCategoryDTO);
        newSubCategory  = subCategoryRepository.save(newSubCategory);
        return subCategoryMapper.map(newSubCategory);
    }

    //Find all
    public List<SubCategoryDTO> listSubCategory(SubCategoryDTO subCategoryDTO){
        List<SubCategoryModel> listSubCategories = subCategoryRepository.findAll();
        return listSubCategories.stream()
                .map(subCategoryMapper::map)
                .collect(Collectors.toList());
    }

    //Find by id
    public SubCategoryDTO listSubCategoryById(Long id){
        Optional<SubCategoryModel> subCategoryById = subCategoryRepository.findById(id);
        return subCategoryById.map(subCategoryMapper::map).orElse(null);
    }

    //Delete by id
    public void deleteSubCategoryById(Long id){
        subCategoryRepository.deleteById(id);
    }

    


}
