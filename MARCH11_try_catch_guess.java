package Java.Fundamentals;

public class MARCH11_try_catch_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=0;

try {
	int z=x/y;
	System.out.println(z);
} catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.toString());
} 

	}

}
