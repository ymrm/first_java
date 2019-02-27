/*sample3*/
public class sample3{
	public static void main(String[] args){
		Book book = new Book("How to cook sushi",55);
		System.out.println("Title=" + book.getTitle());
		System.out.println("Price=" + book.getPrice());

OnlineBook obook = new OnlineBook(
"The Java Visual Machine Specification",0,
"https://java.sun.com/docs/books/vmspec/index.html");
System.out.println("Title="+ obook.getTitle());
		System.out.println("Price=" + obook.getPrice());
		System.out.println("Website=" + obook.getWebsite());


	}
}

