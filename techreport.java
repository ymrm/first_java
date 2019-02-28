/*TechReport*/
class TechReport extends Publication{
	private String institution; //発行機関

	TechReport(String t,String i){
		super(t);
		institution = i;
	}

	public void showInfo(){
		System.out.println("Report:"+title+" , by "+institution);
	}
}
