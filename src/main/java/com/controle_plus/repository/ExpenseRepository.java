package com.controle_plus.repository;

import com.controle_plus.model.EssentialType;
import com.controle_plus.model.ExpensesModel;
import com.controle_plus.model.SubCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ExpenseRepository extends JpaRepository <ExpensesModel, Long> {

    List<ExpensesModel> findBySubCategory(SubCategoryModel subCategoryModel);

    List<ExpensesModel> findByAmountGreaterThan(BigDecimal amount);

    List<ExpensesModel> findByAmountLessThan(BigDecimal amount);

    List<ExpensesModel> findByEssentialType (EssentialType essentialType);

}
