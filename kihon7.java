/* kihon7 */
public class kihon7{
		public static void main(String [] args ){

				//コマンドラインで引数を得る
				//System.out.println(args[0]); //文字列の表示
				int threshold = Integer.parseInt(args[0]);//整数の格納
				System.out.println(threshold+"ドルが入力されました"); //整数の表示	

				Book_keyword = new Book(args[1]); //引数を1つとるBookコンストラクタに入力された引数を与える//引数を一つとるコンストラクタは配列kwywordsに文字列を格納するため、与えた日が配列に格納される

				System.out.println(Book_keyword.keywords[0]+"が入力されました"); //文字列の表示	
				/*Bookクラスからひとつめのインスタンスを生成して利用 */
				Book mybook = new Book("How to cook sushi",55,55f);
				int myyear;
				myyear=1996;	



				boolean mybook_xcheaper;
				mybook_xcheaper = mybook.isCheaperThan(threshold);
				if (mybook_xcheaper == true){ //50より安ければ表示

					if (mybook.title.contains(Book_keyword.keywords[0])){
							System.out.println("my book title = " + mybook.title);
							System.out.println("my book price = " + mybook.getPrice());
							System.out.println("my book yen = " + mybook.doublegetYenPrice());
							mybook.setPrice(44);
							System.out.println("my book price = " + mybook.getPrice());
							mybook.setYear(myyear);
							System.out.println("my book year = " + mybook.getYear());
					}
				}
				/* Bookクラスからふたつめのインスタンスを生成して利用 */
				Book yourbook = new Book("How to cook sail", 40,40f);
				boolean yourbook_xcheaper;
				yourbook_xcheaper = yourbook.isCheaperThan(threshold);
				if (yourbook_xcheaper == true){ //50より安ければ表示
					if (yourbook.title.contains(Book_keyword.keywords[0])){
						System.out.println("your book title = " + yourbook.getTitle());
						System.out.println("your book price = " + yourbook.getPrice());
						System.out.println("your book yen = " + yourbook.doublegetYenPrice());
						yourbook.setPrice(55);
						System.out.println("your book price = " + yourbook.getPrice());
					}
				}

				Book hisbook = new Book();
				boolean hisbook_xcheaper;
				hisbook_xcheaper = hisbook.isCheaperThan(threshold);
				if (hisbook_xcheaper == true){ //50より安ければ表示
					if (hisbook.title.contains(Book_keyword.keywords[0])){
						System.out.println("his book title = " + hisbook.title);
						System.out.println("his book price = " + hisbook.price);
						System.out.println("his book year = " + hisbook.year);
					}
				}
		}
}


