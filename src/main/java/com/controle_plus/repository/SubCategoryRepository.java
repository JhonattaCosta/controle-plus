package com.controle_plus.repository;

import com.controle_plus.model.EssentialType;
import com.controle_plus.model.SubCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubCategoryRepository extends JpaRepository <SubCategoryModel, Long> {

    List<SubCategoryModel> findByNameContainingIgnoreCase(String name);

    List<SubCategoryModel> findByEssentialType(EssentialType essentialType);

    List<SubCategoryModel> findByNameContainingIgnoreCaseAndEssentialType(String name, EssentialType essentialType);

}
