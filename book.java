 /* Book */
class Book{ //クラスBookの宣言
	String title;
	int price;
//	private float price_f;
	private float yenprice;
	int year;

	Book(String t, int p, float p2){
	title = t;
	price = p;
    yenprice = p2 * 120.47f;
	}

	Book(){
		this.title = "Soft drink book"; //thisはこのインスタンスという意味
		this.price = 20;
		this.year = 1984;
	}

	public boolean isCheaperThan(int x){
		if (x > price){ //xドルより安い場合のみ
//		return price;
		return true;
		}
	return false;
	}


	public void setYear(int y){ //西暦の取得	
		year = y;
	}

	public int getYear(){ //西暦の取得	
		return year;
	}

	public void setPrice(int p){ //priceの書き換え
		price = p;
	}

	public String getTitle(){ //題名の取得
		return title;
	}

	public int getPrice(){ //価格の取得
		return price;
	}

	public float doublegetYenPrice(){ //価格の取得
		return yenprice;
	}

}
