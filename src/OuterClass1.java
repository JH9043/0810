
public class OuterClass1 extends DeprecationDemo { // 외부 클래스
	private String name = "한지민"; // Outer Class Member Variable
	private static int age = 26; // Outer class static variable

	public void display() { // Outer Class member method
		System.out.println("name = " + this.name);
	}

	public static void print() { // Outer class static method
		System.out.println("Age = " + age);
	}

	public class InnerClass1 extends Main { // 멤버 클래스 (Inner Class에서 Static이 붙지 않으면)
		public double avg = 89.5; // InnerClass의 멤버 변수
//		public static boolean flag = true; // InnerClass의 static 변수

		public void show() { // InnerCalss의 멤버 메소드
			display();//멤버 메소드 접근 가능
			System.out.println("나이 = " + age); //같은 식구이므로 접근 가능
			System.out.println("이름 = " + name); //멤버 클래스이므로 멤버 변수에 접근 가능
		}
//		public static void 출력하다() { //InncerClass의 static 메소드
//			System.out.println("나이 = " + age);
//			System.out.println("이름 = " + name);
			
		}
	}

