import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClassDemo1 {
	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product("볼펜", 200), new Product("키보드", 10000), new Product("연필", 100),
				new Product("마우스", 5000));
	
		Collections.sort(list, new Comparator<Product>() {
		//익명 클래스를 재정의
			@Override
			public int compare(Product front, Product back) { //오름차순으로 정렬하세요
				return front.price - back.price;

			}
						
		});
		System.out.println(list);
	}
	// Comparable을 상속받은 클래스를 이용하는 방법
//		int array[] = {3,4,8,1,2,3,6,9,3,4,5};
//		AnonymousInnerClassDemo1 acd = new AnonymousInnerClassDemo1();
//		MyClass mc = acd.new MyClass();
//		sort(array,mc); 
//	}
//	static void sort(int array[], Comparable<Integer> MyObject) {
//		
//		
//	}
//	class MyClass implements Comparable<Integer>{
//		@Override
//		public int compareTo(Integer o) {
//			
//			return 0;
//		}
//	}
}
