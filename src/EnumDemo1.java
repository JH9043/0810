import java.util.Arrays;

public class EnumDemo1 {
public static void main(String[] args) {
//	Season season = Season.SUMMER;
//	System.out.println(season);
	Season array[] = Season.values();
//	System.out.println(Arrays.toString(array));
	for(Season season : array) {
		System.out.print(season + ",");
		System.out.println(season.ordinal() + ","+season.getValue());
		//ordinal 순서값 (0, 1, 2, ...)
	}
}
}
