package com.controle_plus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subcategory_tb")
public class SubCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",unique = true)
    @NonNull
    private String name;

    @Column(name = "essential_type")
    @NonNull
    private EssentialType essentialType;

    @Column(name = "user_id")
    private Long userId;

    @OneToMany(mappedBy = "subCategory")
    private List<ExpensesModel> espenses = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NonNull String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public @NonNull EssentialType getEssentialType() {
        return essentialType;
    }

    public void setEssentialType(@NonNull EssentialType essentialType) {
        this.essentialType = essentialType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<ExpensesModel> getEspenses() {
        return espenses;
    }

    public void setEspenses(List<ExpensesModel> espenses) {
        this.espenses = espenses;
    }
}
