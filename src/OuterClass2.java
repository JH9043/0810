
public class OuterClass2 {
	private String name ="한지민"; //Outer Class member 변수
	private static int age = 26; //Outer Class static 변수
	public void display() { //Outer Class member 메소드
		
	}
	public static void print() { //Outer Class static 메소드
		
	}
	public void mymethod() {
		boolean flag =true; //local variable
		class InnerClass2{ //inner Class
			private double avg = 89.5; //inner Class 멤버 변수
//			private static char grade = 'C'; //inner Class static 변수
			public void repair() {
//				System.out.println("나는 로컬 이너 클래스의 멤버 메소드");
				System.out.println("name = " + name); //멤버는 멤버에 접근할 수 있다
				System.out.println("age = " + age); //멤버는 static에 접근할 수 있다
				System.out.println("flag = " + flag); //로컬 클래스는 지역 변수에 접근 가능
			} //inner Class 멤버 메소드
//			public static void sort() {} //inner Class static 메소드
		}
		InnerClass2 inner = new InnerClass2();
		System.out.println(inner.avg);
		inner.repair();
	}
}
