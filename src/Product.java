import java.util.Comparator;

public class Product implements Comparator<Product> {
	public int price;
	public String name;

	public Product(String name, int price) {
		this.price = price;
		this.name = name;
	}

	@Override
	public int compare(Product front, Product back) { // Product를 이용해서 재정의
		return front.price - back.price;
	}

	@Override
	public String toString() {
		return "이름 = " + this.name + "가격 = " + this.price;
	}

}
