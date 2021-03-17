
import java.lang.*;
/*class Book{
	
	private String title;
	private int price;
	
	Book(String name, int num){
		title = name;
		price = num;
	}
	Book(){
		title = null;
		price = 0;
	}
	public void setTitle(String a){
		this.title = a;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	public int getPrice() {
		return price;
	}
}

class BookMgr extends Book{
	Book booklist[] = 
	String bn[];
	int bp[];

	BookMgr(Book []a){
		int tot = 0;
		for(int i=0; i< a.length; i++) {
			bn[i] = a[i].getTitle();
			bp[i] = a[i].getPrice();
			tot = a[i].getPrice();
		}
	}
	
}*/

class Book{
	private String title;
	private int price;
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(){}
	public void setTitle(String a){
		this.title = a;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	public int getPrice() {
		return price;
	}
}

class BookMgr{
	Book booklist[];
	BookMgr(Book[] booklist){
		this.booklist = booklist;
	}
	public String toString() {
		String result = "";
		int tot = 0;
		for(int i = 0; i<booklist.length; i++) {
			tot += booklist[i].getPrice();
			result += String.format("%-20s",booklist[i].getTitle()) + "\t | "+ booklist[i].getPrice() + "\n";
		}
		result +="전체 책 가격의 합 : " + tot;
		return result;
	}
}
public class BookStore {

	public static void main(String[] args) {
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("Spring Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록  정보 ===");
		System.out.println(mgr);

	}

}
