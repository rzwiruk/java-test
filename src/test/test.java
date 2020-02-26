package test;
public class test {
	public static void main(String[] args) {
		char char_var;
		boolean bool_var;
		final String null_string_var;
		double narrowing_casting_double = 5.72;
		int narrowing_casting_int;
		
		narrowing_casting_int = (int) narrowing_casting_double;
		
		bool_var = false;
		char_var = 60;
		null_string_var = null;
		
		
		System.out.println(char_var);
		System.out.println(narrowing_casting_int);
		System.out.println(2 | 3);
	}
}
