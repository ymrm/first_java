/*Onlinemagazine*/
class OnlineMagazine extends OnlineBook{
	int m;
	int d;
	OnlineMagazine(String t,int p ,String website){
		super(t,p,website);
	}
	public void setMonth(int month){
		m = month;
	}

	void setDate(int date){
		d = date;
	}

	public String getPublication(){
		return m+"月"+d+"日"; 
	}

}
