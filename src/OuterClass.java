
public class OuterClass { // 외부 클래스
	private String name = "한지민"; // Outer Class Member Variable
	private static int age = 26; // Outer class static variable

	public void display() { // Outer Class member method
		System.out.println("name = " + this.name);
	}

	public static void print() { // Outer class static method
		System.out.println("Age = " + age);
	}

	static class InnerClass { // 내부 클래스
		public double avg = 89.5; // InnerClass의 멤버 변수
		public static boolean flag = true; // InnerClass의 static 변수

		public void show() { // InnerCalss의 멤버 메소드
//			display();//멤버 메소드이므로 접근 불가
			System.out.println("나이 = " + age); //static끼리 접근할 수 있다
//			System.out.println("이름 = " + name); //static 클래스지만 멤버 변수에 접근하므로 접근 불가
		}
		public static void 출력하다() { //InncerClass의 static 메소드
			System.out.println("나이 = " + age);
//			System.out.println("이름 = " + name);
			
		}
	}
}
