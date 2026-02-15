package com.finance.expense_tracker.repository;

import com.finance.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate; // Import for Date
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // This finds all expenses that match a specific date
    List<Expense> findByDate(LocalDate date);
}