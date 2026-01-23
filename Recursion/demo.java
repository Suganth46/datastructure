
public class main{
	static boolean find(int[] arr,int target,int i){
		if(i==arr.length){
			return false;
		}
		return arr[i]==target || find(arr,target,i+1);
	}
		static int findIndex(int[] arr,int target,int i){
		if(i==arr.length){
			return -1;
		}
		if(arr[i]==target){
			return i;
		}
		else{
			return findIndex(arr,target,i+1);
		}
	}
	public static void main(String args[]){
		int[] arr={1,2,3,10,5,7};
		System.out.println(findIndex(arr,3,0));
	}
}