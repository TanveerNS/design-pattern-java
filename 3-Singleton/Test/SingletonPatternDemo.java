public class SingletonPatternDemo{
	public static void main(String args[]){
	Singletondemo refw = Singletondemo.getdemo();
	refw.showM();
	}
}
class Singletondemo{
	private static Singletondemo obj = new Singletondemo();
	public static Singletondemo getdemo(){
		return obj;
	}
	public void showM(){
		System.out.println("Hello World!");
	}
}