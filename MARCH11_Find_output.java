package Java.Fundamentals;

public class MARCH11_Find_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 try {
			 int value=5;
				    if(value<10)
			 
				throw new RuntimeException("Vlaue is less than 10");
			 }
			 catch(RuntimeException ex)
	          {
	                 	System.out.println(ex.getMessage());
	          }
			     System.out.println("Outside_try_catch_block");
	}

}
