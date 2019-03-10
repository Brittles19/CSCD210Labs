package cscd210Classes;

public class Author implements Comparable <Author>{
	private String first;
	private String last;
	private String publisher;



public Author(final String first, final String last, final String publisher) {
	if(first == null || first.isEmpty())
		throw new IllegalArgumentException("first name is empty");
	if(last == null || last.isEmpty())
		throw new IllegalArgumentException("last name is empty");
	if(publisher == null || publisher.isEmpty())
		throw new IllegalArgumentException("Publisher is empty");
	this.first = first;
	this.last = last;
	this.publisher = publisher;
}
public String getLast() {
	String str = this.last;
	return str;
	
}
@Override
public String toString() {
	String str = this.first + " " + this.last + " " + " - " + this.publisher;
	return str;
}

@Override
public int compareTo(final Author another) {
	if(another == null)
		throw new IllegalArgumentException("Another parameter is empty");

	int res = this.last.compareTo(another.last); //compare author last names
	Integer.valueOf(res);
	if(res != 0) {
		return res; 
	}else
	if(res == 0) {
		int res2 = this.first.compareTo(another.last); //compare first and last names
		Integer.valueOf(res2);
		res = res2;
		return res;
	}else
	if(res == 0) {
		int res3 = this.publisher.compareTo(another.publisher); //compare publishers if first and last are same
		Integer.valueOf(res3);
		res = res3;
		return res;
		
	}
	return res;

}//end class
}
