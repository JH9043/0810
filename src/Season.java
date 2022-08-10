/**
 * @author <font size='7' color='green'>Henry</font>
 * @version <b> 1.0 </b>
 * @since <i> 2022-08-10 </i>
 */
public enum Season {
//	SPRING, SUMMER, FALL, WINTER;
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000); //값을 줄려면 생성자 만들어야 됨
	private int value;
	Season(int value){
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}