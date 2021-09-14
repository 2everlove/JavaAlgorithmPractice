package ch2;

public class SearchableVar {
	
	public static void main(String[] args) {
		//1st(origin)
		for (int j=0; j<34; j++) {
			int s = (t[j]*4)/5;
		}
		
		//2nd
		int realDaysPerIdealDay = 4;
		final int WORK_DAYS_PER_WEEK = 5;
		final int NUMBER_OF_TASKS = 34;
		int sum = 0;
		for(int j=0; j < NUMBER_OF_TASKS; j++) {
			int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
			int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
			sum += realTaskWeeks;
		}
		
	}
}
