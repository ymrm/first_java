/*kihon12*/
class kihon12{
	public static void main(String[] args){
		OnlineMagazine magazine1 = new OnlineMagazine(
				"Manga",2,"https://google.com");
		magazine1.setMonth(3);
		magazine1.setDate(8);
		magazine1.getPublication();
		System.out.println(magazine1.getPublication());
	}

}
