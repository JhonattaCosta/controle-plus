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
    private EssentialType essentialType;
    @Column(name = "subcategory_id")
    @NonNull
    private Long subcategoryId;
    @Column(name = "user_id")
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

    public Long getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
