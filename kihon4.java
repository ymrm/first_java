/* sample2 */
public class kihon4{
	public static void main(String [] args ){

	/*Bookクラスからひとつめのインスタンスを生成して利用 */
	Book mybook = new Book("How to cook sushi",55,55f);
	int myyear;

	myyear=1996;	

	System.out.println("my book title = " + mybook.title);
	System.out.println("my book price = " + mybook.getPrice());
	System.out.println("my book yen = " + mybook.doublegetYenPrice());
	mybook.setPrice(44);
	System.out.println("my book price = " + mybook.getPrice());
	mybook.setYear(myyear);
	System.out.println("my book year = " + mybook.getYear());

	/* Bookクラスからふたつめのインスタンスを生成して利用 */
	Book yourbook = new Book("How to cook sail", 40,40f);
	System.out.println("your book title = " + yourbook.getTitle());
	System.out.println("your book price = " + yourbook.getPrice());
	System.out.println("your book yen = " + yourbook.doublegetYenPrice());
	yourbook.setPrice(55);
	System.out.println("your book price = " + yourbook.getPrice());
	Book hisbook = new Book();
	System.out.println("his book title = " + hisbook.title);
	System.out.println("his book price = " + hisbook.price);
	System.out.println("his book year = " + hisbook.year);

	}
}


