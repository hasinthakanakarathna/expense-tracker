package com.finance.expense_tracker.controller;

import com.finance.expense_tracker.model.Expense;
import com.finance.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDate; // Fixes the "cannot find symbol" error

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository repository;

    // 1. Get ONLY Today's expenses (Default view)
    @GetMapping
    public List<Expense> getTodayExpenses() {
        return repository.findByDate(LocalDate.now());
    }

    // 2. Get EVERYTHING (History view)
    @GetMapping("/all")
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // 3. Add a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        // Ensure the date is set if it wasn't already
        if (expense.getDate() == null) {
            expense.setDate(LocalDate.now());
        }
        return repository.save(expense);
    }
    // 4. Delete an expense
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        repository.deleteById(id);
    }
}