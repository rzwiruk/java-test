package test;
import java.time.LocalDate;
public class test {
	static void test1() {
		System.out.println("method called");
	}
	static int add(int first, int second) {
		return first + second;
	}
	static float add(float first, float second) {
		return first + second;
	}
	static String add(String first, String second) {
		return first + ' ' + second;
	}
	static boolean add(boolean first, boolean second) {
		boolean sum = (first == second) ? false: true;
		return sum;
	}
	public static void main(String[] args) {
		char char_var;
		boolean bool_var, second_bool_var;
		final String null_string_var;
		double narrowing_casting_double = 5.72;
		int narrowing_casting_int;
		
		int values[] = {20, 5, 7, 4, 2, 31};
		
		narrowing_casting_int = (int) narrowing_casting_double;
		
		bool_var = true;
		second_bool_var = true;
		char_var = 60;
		null_string_var = null;
		
		LocalDate current_date = LocalDate.now();
		
		test1();
		System.out.println(add(bool_var, second_bool_var));
		System.out.println(add(values[1], values[3]));

		System.out.println("Today is " + current_date);
		
		switch(Math.max(values[0], values[4])) {
		case 31:
			System.out.println("thirty-one");
			break;
		case 20:
			System.out.println("twenty");
			break;
		default:
			System.out.println("unknown");
		}
		
		
		
		System.out.println(char_var);
		System.out.println(narrowing_casting_int);
		System.out.println(2 | 3);
		//System.out.println(Math.max(values[2], values[5]));
		
		
	}
}
