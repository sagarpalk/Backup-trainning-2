class Book
{
	//Instance variables
	private String bookName,authorName;
	private float price;
	
	//public getter and setter

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
public class GetterSetterExample 
{
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setBookName("C Programming");
		b1.setAuthorName("Ajay Mittal");
		b1.setPrice(560f);
		
		System.out.println(b1.getBookName()+"\t"+b1.getAuthorName()+"\t"+b1.getPrice());
	}

}








