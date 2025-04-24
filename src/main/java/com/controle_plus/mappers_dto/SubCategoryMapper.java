package com.controle_plus.mappers_dto;

import com.controle_plus.model.SubCategoryModel;
import org.springframework.stereotype.Component;

@Component
public class SubCategoryMapper{

    public SubCategoryModel map(SubCategoryDTO subCategoryDTO){

        SubCategoryModel subCategoryModel = new SubCategoryModel();

        subCategoryModel.setId(subCategoryDTO.getId());
        subCategoryModel.setName(subCategoryDTO.getName());
        subCategoryModel.setEssentialType(subCategoryDTO.getEssentialType());
        subCategoryModel.setUserId(subCategoryDTO.getUserId());
        subCategoryModel.setEspenses(subCategoryDTO.getExpenses());

        return subCategoryModel;
    }

public SubCategoryDTO map(SubCategoryModel subCategoryModel){

    SubCategoryDTO subCategoryDTO = new SubCategoryDTO();

    subCategoryDTO.setId(subCategoryModel.getId());
    subCategoryDTO.setName(subCategoryModel.getName());
    subCategoryDTO.setEssentialType(subCategoryModel.getEssentialType());
    subCategoryDTO.setUserId(subCategoryModel.getUserId());
    subCategoryDTO.setExpenses(subCategoryModel.getExpenses());

    return subCategoryDTO;
}
}
