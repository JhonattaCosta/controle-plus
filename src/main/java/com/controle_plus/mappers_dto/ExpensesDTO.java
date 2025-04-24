package com.controle_plus.mappers_dto;

import com.controle_plus.model.EssentialType;
import com.controle_plus.model.SubCategoryModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class ExpensesDTO {

    private Long id;
    private String description;
    private BigDecimal amount;
    private LocalDate date;
    private EssentialType essentialType;
    private SubCategoryModel subCategory;
    private Long UserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public EssentialType getEssentialType() {
        return essentialType;
    }

    public void setEssentialType(EssentialType essentialType) {
        this.essentialType = essentialType;
    }

    public SubCategoryModel getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategoryModel subCategory) {
        this.subCategory = subCategory;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
