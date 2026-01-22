import java.util.*;
public class main{
	static int reverse_number(int n,int sum){
        if(n%10==n){
            return (sum*10)+n;
        }
        return reverse_number(n/10,(sum*10)+n%10);
    }
	public static void main(String args[]){
		System.out.println(reverse_number(9474,0));
		int n=9474;
		int rev=0;
		while(n!=0){
			rev=(rev*10)+n%10;
			n/=10;
		}
		System.out.println(rev);
	}
}