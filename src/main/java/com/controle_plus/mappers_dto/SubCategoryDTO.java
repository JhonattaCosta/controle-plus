package com.controle_plus.mappers_dto;

import com.controle_plus.model.EssentialType;
import com.controle_plus.model.ExpensesModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryDTO {

    private Long id;
    private String name;
    private EssentialType essentialType;
    private Long userId;
    private List<ExpensesModel> expenses = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EssentialType getEssentialType() {
        return essentialType;
    }

    public void setEssentialType(EssentialType essentialType) {
        this.essentialType = essentialType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<ExpensesModel> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<ExpensesModel> expenses) {
        this.expenses = expenses;
    }
}
