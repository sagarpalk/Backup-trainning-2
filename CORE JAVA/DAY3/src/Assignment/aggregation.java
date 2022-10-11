package Assignment;

public class aggregation {
 public static void main (String args[]){
	 Date d=new Date("24-11-2001","kolhapur", 623169);
	 
	 Employee1 e=new Employee1(1, "Sagr",65656, d);	 
	 System.out.println(d);
	
	 
	 Address a=new Address(65656, "kolhapur", "maharashtra",d);
	 System.out.println(a);
	
	 
 }
}
