import java.util.Scanner;
//import com.example.libs.*;
import com.example.product.Ballpen;

public class Main{
    public static void main(String[] args) {
//        Car sonata = new Car("Silver Sonata");
//        java.util.Date now = new java.util.Date();
//        System.out.println(sonata); //sonata.toString()
        //선언형에서도 Car를 못찾고
        //실제형에서도 Car를 못찾아서 오류
        Ballpen monami = new Ballpen();
        System.out.println(monami.name);
        
        com.example.finance.Money money = new com.example.finance.Money();
        System.out.println(money.balance);
        
    }
}