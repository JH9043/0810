
public class StaticInnerClassDemo {
	public static void main(String[] args) {
		OuterClass.print();
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		System.out.println(inner.avg);
//		System.out.println(OuterClass.InnerClass.flag);
		inner.show();
	}
}
