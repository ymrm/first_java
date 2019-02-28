/*sample5*/
public class sample5{
	public static void main(String[] args){
		Publication[] pub = new Publication[4];

		pub[0] = new Article("Java Compiler","IEEE Software");
		pub[1] = new TechReport("Research of the Software Engineering","The University of the world");
		pub[2] = new Article("An apple a day","Nature");
		pub[3] = new TechReport("Research of Global Warming","The University of the world");

		for(int i=0;i<pub.length;i++){
			pub[i].showInfo();
		}
	}
}
