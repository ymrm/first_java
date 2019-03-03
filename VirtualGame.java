class VirtualPet{
	String name;
	int maxlove;
	int love;

	void gift_for_you(){
		System.out.println("もしもし、"+this.name+"です。贈り物をどうもありがとう。");
		this.love += 10;
	}

	void tell_love_you(){
		System.out.println("もしもし、あの、"+this.name+"です。留守電聞きました……うれしかったです。");
		this.love += 20;
	}

	void break_promise(){
		System.out.println("もしもし、"+this.name+"ですが、今日、私"+this.love+"分も待っていたんですが。");
		this.love -= 30;
	}

	void see_someone_date(){
		System.out.println("もしもし、"+this.name+"です……私、今日、見ちゃったんです。一体どういうことですか?");
		this.love = 0;
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



public class VirtualGame{
	public static void main(String[] args){
		VirtualPet kyoko = new VirtualPet();
		VirtualPet yagami = new VirtualPet();
		VirtualPet kozue = new VirtualPet();

		kyoko.name = "音無";
		kyoko.maxlove = 80;
		kyoko.love = 30;

		yagami.name = "八神";
		yagami.maxlove = 100;
		yagami.love = 90;

		kozue.name = "こずえ";
		kozue.maxlove = 75;
		kozue.love = 60;


//イベント
kyoko.tell_love_you();
kozue.gift_for_you();
kozue.invite_date();
kozue.break_promise();
kozue.invite_date();
kyoko.see_someone_date();
kyoko.invite_date();
//状態表示
kyoko.printInfo();
kozue.printInfo();
yagami.printInfo();
	}
}

