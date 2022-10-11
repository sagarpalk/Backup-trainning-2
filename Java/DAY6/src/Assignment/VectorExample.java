package Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

class Movies {
	String movieName;
	String directorName;
	int ratting;
	String releaseDate;
	
	public Movies(String movieName, String directorName, int ratting, Date releaseDate) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.ratting = ratting;
		this.releaseDate = this.releaseDate;
	}
	public Movies() {
		super();
	}
	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", directorName=" + directorName + ", ratting=" + ratting
				+ ", releaseDate=" + releaseDate + "]";
	}
	
}

public class VectorExample {

	public static void main(String[] args) {
		Vector<Movies>ve=new Vector<Movies>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of employee");
		int c=sc.nextInt();
		
		for(int i=0;i<c;i++) {
			System.out.println("Enter the movie details:");
			String mName=sc.next();
			String dName=sc.next();
			int rat=sc.nextInt();
		  String datee = sc.nextLine();
		  
		  
		  
					
					
					
					
//		    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(Date); 
		}

	}

}
