//インターフェースの宣言
interface HasGetAreaMethod{
  double getArea();//このインターフェースを実装するクラスはこのメソッドを必ず持つ
}
//抽象クラス
abstract class Shape{
  abstract void draw(); //抽象メソッド(クラスShapeのサブクラスは必ずこのメソッドを持つ)
}

//丸クラス
class Circle{
}

//四角クラス
class Rectangle{
}

//直線クラス
class Polyline{
}

//ポリゴンクラス
class Polygon{
}

//
public class PolymorphismExample2{
public static void main (String[] args){
HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3]; //HasGetAreaMethods型の配列を宣言する
}
}
