package Java.Fundamentals;

public class March_10th_handleExceptionThrows{


		// TODO Auto-generated method stub
		void method1() throws ArithmeticException{  
			throw new ArithmeticException("Calculation error"); 
		   }  
		   void method2() throws ArithmeticException{  
			method1();  
		   }  
		   void method3(){  
			try{  
			   method2();  
			}
			catch(ArithmeticException e){
			   System.out.println("ArithmeticException handled");
			}  
		   }  
		   public static void main(String args[]){  
			   March_10th_handleExceptionThrows obj=new March_10th_handleExceptionThrows();  
			obj.method3();  
			System.out.println("End Of Program"); 
	}
	}


