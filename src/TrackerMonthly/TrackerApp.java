package TrackerMonthly;

import java.time.LocalDate;
import java.time.Month;

public class TrackerApp {

	public static void main(String[] args) {
		
		 ExpenseManager manager = new ExpenseManager();

	        BackupThread backup = new BackupThread();
	        backup.setDaemon(true);
	        backup.start();

	        try {
	            manager.addExpense("Food", 250, LocalDate.of(2025, 3, 5));
	            manager.addExpense("Travel", 1200, LocalDate.of(2025, 3, 10));
	            manager.addExpense("Shopping", 800, LocalDate.of(2025, 3, 15));
	        } catch (NegativeAmountException e) {
	            System.out.println(e.getMessage());
	        }

	        manager.sortByAmount();
	        manager.displayExpenses();
	        manager.showMonthlySummary(Month.MARCH);

	}

}

