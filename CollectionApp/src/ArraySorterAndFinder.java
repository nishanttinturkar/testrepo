import java.util.Arrays;

public class ArraySorterAndFinder {
	public static void main(String[] args) {
		float salaries[] = {434.23f, 4234.25f, 47464,15f, 5645.45f };
		String cities[] = {"HYD", "PUNE", "BENGALURU", "GURUGRAM", "VIJAYAWADA"};
		
		System.out.println("Array salaries without sorting");
		
		for(float salary : salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(salaries);
		
		System.out.println("Array salaries after sorting");
		
		for (float salary : salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(cities);
		
		for(String city : cities) {
			System.out.println(city);
		}
		
		//Binary Search - pre requisite - Array has to be sorted
		int index = Arrays.binarySearch(cities, "PUNE");
		if(index < 0) System.out.println("Search element is not in the list");
		else System.out.println("City found at index " + index);
	}
}
