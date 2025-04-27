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
    public List<SubCategoryDTO> listSubCategory(){
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

    //Change
    public SubCategoryDTO changeSubCategory(SubCategoryDTO subCategoryDTO, Long id){
        Optional<SubCategoryModel> subCategoryExistingOpt = subCategoryRepository.findById(id);
        if (subCategoryExistingOpt.isPresent()){
            SubCategoryModel subCategoryExisting = subCategoryExistingOpt.get();
            if(subCategoryDTO.getName() != null){
                subCategoryExisting.setName(subCategoryDTO.getName());
            }
            if(subCategoryDTO.getEssentialType() != null){
                subCategoryExisting.setEssentialType(subCategoryDTO.getEssentialType());
            }
            if (subCategoryDTO.getUserId() != null){
                subCategoryExisting.setUserId(subCategoryDTO.getUserId());
            }
            if (subCategoryDTO.getExpenses() != null){
                subCategoryExisting.setEspenses(subCategoryDTO.getExpenses());
            }
            SubCategoryModel subCategorySave = subCategoryRepository.save(subCategoryExisting);
            return subCategoryMapper.map(subCategorySave);
        }
        return null;
    }

    //Delete by id
    public void deleteSubCategoryById(Long id){
        subCategoryRepository.deleteById(id);
    }

    


}
