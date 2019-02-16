/* Book */
class Book{ //クラスBookの宣言
	String title;
	private int price;
//	private float price_f;
//	private float yenprice;

	Book(String t, int p){
	title = t;
	price = p;
//	price_f = p2;
//    yenprice = price_f * 120;
	}

	public String getTitle(){ //題名の取得
		return title;
	}

	public int getPrice(){ //価格の取得
		return price;
	}

//	public float doublegetYenPrice(){ //価格の取得
//		return yenprice;
//	}
}
