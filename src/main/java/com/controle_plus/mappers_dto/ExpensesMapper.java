package com.controle_plus.mappers_dto;

import com.controle_plus.model.ExpensesModel;
import org.springframework.stereotype.Component;

@Component
public class ExpensesMapper {

    public ExpensesModel map(ExpensesDTO expensesDTO) {

        ExpensesModel expensesModel = new ExpensesModel();

        expensesModel.setId(expensesDTO.getId());
        expensesModel.setDescription(expensesDTO.getDescription());
        expensesModel.setAmount(expensesDTO.getAmount());
        expensesModel.setDate(expensesDTO.getDate());
        expensesModel.setEssentialType(expensesDTO.getEssentialType());
        expensesModel.setSubCategory(expensesDTO.getSubCategory());
        expensesModel.setUserId(expensesDTO.getUserId());

        return expensesModel;
    }

    public ExpensesDTO map(ExpensesModel expensesModel){

        ExpensesDTO expensesDTO = new ExpensesDTO();

        expensesDTO.setId(expensesModel.getId());
        expensesDTO.setDescription(expensesModel.getDescription());
        expensesDTO.setAmount(expensesModel.getAmount());
        expensesDTO.setDate(expensesModel.getDate());
        expensesDTO.setEssentialType(expensesModel.getEssentialType());
        expensesDTO.setSubCategory(expensesModel.getSubCategory());
        expensesDTO.setUserId(expensesModel.getUserId());

        return expensesDTO;
    }

}
