/*article*/
class Article extends Publication{//クラスpublicationを継承
	private String journal;//雑誌名
	Article(String t,String j){
		super(t);
		journal = j;
	}
	public void showInfo(){ //showInfoの実装(サブクラスで抽象メソッドをすべて実装する必要がある)
		System.out.println("Article:"+title+", in "+journal);
	}
}
