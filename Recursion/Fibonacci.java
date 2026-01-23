import java.util.*;
public class Fibonacci{
	static int fibonocci(int n){
		if(n<2){
			return n;
		}
		return fibonocci(n-1)+fibonocci(n-2);
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println(fibonocci(20));
	}
}