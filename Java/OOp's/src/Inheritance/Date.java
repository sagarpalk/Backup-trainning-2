package Inheritance;

public class Date 
{
	int dd,mm,yyyy;

	public Date
	(int dd, int mm, int yyyy) 
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public String toString()
	{
		return yyyy+"-"+mm+"-"+dd;
	}
	

}
