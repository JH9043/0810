
public class MemberInnerClassDemo {
	public static void main(String[] args) {
		OuterClass1 out = new OuterClass1(); //바깥 클래스의 참조 변수
		OuterClass1.InnerClass1 inner = out.new InnerClass1();
										//바깥 클래스의 주소로부터 new 생성자
//		System.out.println(inner.avg);
		inner.show();
		
	}

}
