
public class AnonymousInnerClassDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("나는 쓰레드");
			}
		};
		t.run();
	}
}

//class MyThread extends Thread {  // 이렇게 쓰면 자식을 만들어야 되므로 있는 거를 그대로 재정의하자
//	@Override
//	public void run() {
//		System.out.println("나는 쓰레드");
//	}
//}
