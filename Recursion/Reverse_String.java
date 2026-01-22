public class Reverse_String {
    static char[] rs(char[] s,int left,int right){
        if(left>right){
            return s;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        return rs(s,left++,right--);
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        System.out.println(rs(s,0,s.length-1));
    }
}
