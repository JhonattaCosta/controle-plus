package com.controle_plus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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

    public Long getId() {
        return id;
    }

    public @NonNull String getName() {
        return name;
    }

    public @NonNull EssentialType getEssentialType() {
        return essentialType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setEssentialType(@NonNull EssentialType essentialType) {
        this.essentialType = essentialType;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
