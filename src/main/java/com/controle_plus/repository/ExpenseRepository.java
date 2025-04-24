package com.controle_plus.repository;

import com.controle_plus.model.ExpensesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository <ExpensesModel, Long> {
}
