/* sample2 */
public class kihon10{
		public static void main(String [] args ){


				//コマンドラインで引数を得る
				//System.out.println(args[0]); //文字列の表示
				int threshold = Integer.parseInt(args[0]);//整数の格納
				System.out.println(threshold+"ドルが入力されました"); //整数の表示	

				Book Book_keyword = new Book(args[1],args[2]); //引数を1つとるBookコンストラクタに入力された引数を与える//引数を一つとるコンストラクタは配列kwywordsに文字列を格納するため、与えた日キスが配列に格納される
				if (Book_keyword.ContainsInKeywords("k")){
					System.out.println("true");
				}else{
					System.out.println("false");
				}

				System.out.println(Book_keyword.keywords[0]+"と"+ Book_keyword.keywords[1]  +"が入力されました"); //文字列の表示	
				/*Bookクラスからひとつめのインスタンスを生成して利用 */
Book[] books;
books = new Book[3];

books[0] = new Book();
books[1] = new Book();
books[0].title = "hon";
books[0].price = 20;
books[0].year = 2000;

books[1].title = "hon2";
books[1].price = 20;
books[1].year = 2000;

			//	Book mybook = new Book("How to cook sushi",55,55f);
				int myyear;
				myyear=1996;	



			//	boolean mybook_xcheaper;
			//	mybook_xcheaper = mybook.isCheaperThan(threshold);
			//	if (mybook_xcheaper){ //50より安ければ表示

			//		if (mybook.title.contains(Book_keyword.keywords[0]) && mybook.title.contains(Book_keyword.keywords[1])){
						System.out.println("my book title = " + books[0].title);
						System.out.println("my book price = " + books[0].getPrice());
//						System.out.println("my book yen = " + mybook.doublegetYenPrice());
//						mybook.setPrice(44);
//						System.out.println("my book price = " + mybook.getPrice());
						books[0].setYear(myyear);
						System.out.println("my book year = " + books[0].getYear());
			//		}
			//	}
				/* Bookクラスからふたつめのインスタンスを生成して利用 */
//				Book yourbook = new Book("How to cook sail", 40,40f);
//				boolean yourbook_xcheaper;
//				yourbook_xcheaper = yourbook.isCheaperThan(threshold);
//				if (yourbook_xcheaper == true){ //50より安ければ表示
//					if (yourbook.title.contains(Book_keyword.keywords[0]) && yourbook.title.contains(Book_keyword.keywords[1])){
						System.out.println("your book title = " + books[1].getTitle());
						System.out.println("your book price = " + books[1].getPrice());
	//					System.out.println("your book yen = " + yourbook.doublegetYenPrice());
						books[1].setPrice(55);
						System.out.println("your book price = " + books[1].getPrice());
//					}
//				}

				Book hisbook = new Book();
				boolean hisbook_xcheaper;
				hisbook_xcheaper = hisbook.isCheaperThan(threshold);
				if (hisbook_xcheaper == true){ //50より安ければ表示
					if (hisbook.title.contains(Book_keyword.keywords[0]) && hisbook.title.contains(Book_keyword.keywords[1])){
						System.out.println("his book title = " + hisbook.title);
						System.out.println("his book price = " + hisbook.price);
						System.out.println("his book year = " + hisbook.year);
					}
				}
		}
}


