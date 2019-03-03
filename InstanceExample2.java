//StudentCardの変数を定義
class StudentCard{
int id;
String name;
}


public class InstanceExample2{
	public static void main(String[] args){
		//StudentCard a b
StudentCard a = new StudentCard ();
StudentCard b = new StudentCard ();

		//StudentCard c (bの値をcに代入)
StudentCard c = b;

		//変数が参照するインスタンスに値を代入
a.id = 0;
a.name = "kyouko"; 
b.id = 1;
b.name = "hanae"; 
		//表示
System.out.println("わたしは、番号"+a.id+"の"+a.name+"です");
System.out.println("わたしは、番号"+b.id+"の"+b.name+"です");
System.out.println("わたしは、番号"+c.id+"の"+c.name+"です");
		//cの値を変更する
c.id = 6;
c.name = "akemi"; 

		//表示
System.out.println("わたしは、番号"+a.id+"の"+a.name+"です");
System.out.println("わたしは、番号"+b.id+"の"+b.name+"です");
System.out.println("わたしは、番号"+c.id+"の"+c.name+"です");

	}
}
