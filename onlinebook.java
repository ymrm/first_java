/*onlinebook*/
class OnlineBook extends Book{
public String website;
OnlineBook(String t,int p,String website){
super(t,p);//スーパークラスのコンストラクタの呼び出し
this.website = website;
}

public String getWebsite (){ //URLの取得
return website;
}

public String getTitle (){ //URLの取得
return "Online:"+title;
}

}
