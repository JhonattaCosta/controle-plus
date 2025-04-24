package com.controle_plus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expense_tb")
public class ExpensesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    @NonNull
    private String description;
    @Column(name = "amount")
    @NonNull
    private BigDecimal amount;
    @Column(name = "date")
    @NonNull
    private LocalDate date;
    @Column(name = "type")
    @NonNull
    @Enumerated(EnumType.STRING)
    private EssentialType essentialType;
    @ManyToMany
    @Column(name = "subcategory_id")
    private SubCategoryModel subCategoryModel;
    @Column(name = "user_id")
    private Long UserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NonNull String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    public @NonNull BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(@NonNull BigDecimal amount) {
        this.amount = amount;
    }

    public @NonNull LocalDate getDate() {
        return date;
    }

    public void setDate(@NonNull LocalDate date) {
        this.date = date;
    }

    public @NonNull EssentialType getEssentialType() {
        return essentialType;
    }

    public void setEssentialType(@NonNull EssentialType essentialType) {
        this.essentialType = essentialType;
    }

    public SubCategoryModel getSubCategoryModel() {
        return subCategoryModel;
    }

    public void setSubCategoryModel(SubCategoryModel subCategoryModel) {
        this.subCategoryModel = subCategoryModel;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
