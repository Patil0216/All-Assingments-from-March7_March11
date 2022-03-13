package Java.Fundamentals;

public class MARCH11_Byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte num;
System.out.println("Scientech");
try {
	num=Byte.parseByte("Easy");
	System.out.println("num"+num);
}
catch(Exception ex) {
	System.out.println(ex.getMessage());
	System.out.println(ex.toString());
} 
	}

}
