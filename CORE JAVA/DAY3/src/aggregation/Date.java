package aggregation;

public class Date {
	int dd,mm,yyyy;

	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
}
