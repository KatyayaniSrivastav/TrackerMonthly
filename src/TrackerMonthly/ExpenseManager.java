package TrackerMonthly;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class ExpenseManager {
	
	private List<Expense> expenses = new ArrayList<>();

    public void addExpense(String category, double amount, LocalDate date)
            throws NegativeAmountException {

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative");
        }
        expenses.add(new Expense(category, amount, date));
    }

    
    public void showMonthlySummary(Month month) {
        System.out.println("\n--- Monthly Summary for " + month + " ---");

        Map<String, Double> summary = expenses.stream()
                .filter(e -> e.getDate().getMonth() == month)
                .collect(Collectors.groupingBy(
                        Expense::getCategory,
                        Collectors.summingDouble(Expense::getAmount)
                ));

        summary.forEach((cat, total) ->
                System.out.println(cat + ": ₹" + total)
        );
    }

    
    public void sortByAmount() {
        Collections.sort(expenses,
                Comparator.comparingDouble(Expense::getAmount));
    }

    public void displayExpenses() {
        expenses.forEach(System.out::println);
    }
}
