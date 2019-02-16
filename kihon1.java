/* sample2 */
public class kihon1{
	public static void main(String [] args ){

	/*Bookクラスからひとつめのインスタンスを生成して利用 */
	Book mybook = new Book("How to cook sushi",55,55f);
	System.out.println("my book title = " + mybook.title);
	System.out.println("my book price = " + mybook.getPrice());
	System.out.println("my book yen = " + mybook.doublegetYenPrice());

	/* Bookクラスからふたつめのインスタンスを生成して利用 */
	Book yourbook = new Book("How to cook sail", 40,40f);
	System.out.println("your book title = " + yourbook.getTitle());
	System.out.println("your book price = " + yourbook.getPrice());
	System.out.println("your book yen = " + yourbook.doublegetYenPrice());
	}
}


