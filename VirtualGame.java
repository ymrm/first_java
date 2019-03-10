class VirtualPet{
	String name;
	int maxlove;
	int love;

	VirtualPet(String name,int maxlove,int love){
		this.name = name;
		this.maxlove = maxlove;
		this.love = love;
	}

	void with_you(){ //オーバーロードの元
	}


	void gift_for_you(){
		System.out.println("もしもし、"+this.name+"です。贈り物をどうもありがとう。");
		this.love += 10;
	}

	void break_promise(){
		System.out.println("もしもし、"+this.name+"ですが、今日、私"+this.love+"分も待っていたんですが。");
		this.love -= 30;
	}


	void invite_date(){
		System.out.println("次の週末、喫茶店へ行きませんか?");
		if(love > 60){
			System.out.println("もしもし、"+this.name+"です。喫茶店ですか!!ぜひ行きましょう。嬉しいです。");
		}
		else if(love > 20){
			System.out.println("もしもし、先ほどの件ですが、"+this.name+"です。考えておきます。");
		}
		else{
			System.out.println("もしもし、先ほどの件ですが、"+this.name+"です。顔も見たくありません。");
		}
	}

	void printInfo(){
		System.out.println(this.name+"さん。現状は"+this.love+"。最高は"+this.maxlove+"。");

	}

}


class VirtualGirl extends VirtualPet{
	VirtualGirl(String name,int maxlove,int love){
		super(name,maxlove,love);
	}
	void tell_love_you(){ //気持ちを伝えるメソッド
		System.out.println("好きです。"+this.name+"さん。");
		if(love > 80){
			System.out.println("私もです。嬉しいです。");
		}
		else if(love > 20){
			System.out.println("ありがとうございます。");
		}
		else{
			System.out.println("そうですか……");
		}
	}

	void see_someone_date(){
		System.out.println("もしもし、"+this.name+"です……私、今日、見ちゃったんです。一体どういうことですか?");
		this.love = 0;
	}

	void with_you(){ //オーバーライド　お茶に行く
		System.out.println("もしもし、"+this.name+"です。昨日はどうもありがとう。");
		this.love += 20;
	}

}

class VirtualOther extends VirtualPet{
	VirtualOther(String name,int maxlove,int love){
		super(name,maxlove,love);
	}
	void with_you(){ //オーバーライド　パチンコに行く
		System.out.println("もしもし、"+this.name+"だけど。昨日はどうもありがとな。");
		this.love += 20;
	}
}

public class VirtualGame{

	public static void thankyou(VirtualPet pet){
		pet.with_you(); //クラスによって変わる
		pet.gift_for_you();
	}

	public static void main(String[] args){
		VirtualGirl kyoko = new VirtualGirl("音無",80,30); //サブクラス
		VirtualPet yagami = new VirtualPet("八神",100,90);
		VirtualPet kozue = new VirtualPet("こずえ",75,60);
		VirtualOther sakamoto = new VirtualOther("坂本",80,60);//サブクラス




		//イベント
		kyoko.tell_love_you();
		kyoko.see_someone_date();
		kyoko.invite_date();
		kyoko.tell_love_you();
		sakamoto.with_you();//同じメソッドだが、クラスによって処理が違う
		kyoko.with_you();//同じメソッドだが、クラスによって処理が違う
		thankyou(sakamoto);//クラスによって違う
		thankyou(kyoko);//クラスによって違う

		//状態表示
		kyoko.printInfo();
		kozue.printInfo();
		yagami.printInfo();
		sakamoto.printInfo();
	}
}

