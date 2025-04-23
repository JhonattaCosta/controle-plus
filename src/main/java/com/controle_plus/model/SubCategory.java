package com.controle_plus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SubCategory {

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

}
