class StudentCard{
	int id;
	String name;


	//コンストラクタの宣言
	StudentCard(int id,String name){
		this.id = id;
		this.name = name;
	}
	//インスタンスメソッドの宣言
	void printInfo(){
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
}
//実行
public class InstanceMethodExample{
	public static void main(String[] args){
		StudentCard a = new StudentCard(4,"yotuya");
		StudentCard b = new StudentCard(6,"akemi");

		//インスタンスに対して、PrintInfoメソッドを呼び出す
		a.printInfo();
		b.printInfo();
	}
}
