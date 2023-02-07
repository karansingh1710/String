public class Pangram {
    //    This method replace all the whitespaces present in the String and return the String
    static String replaceWhiteSpace(String s){
        String ans="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!=' '){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    static void sort(int[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String s="the quick brown fox jumps over  a lazy dog";
        s=replaceWhiteSpace(s);
        char[] chars=s.toCharArray();

        int[] arr=new int[26];
        for (int i=0; i<s.length(); i++){
            arr[chars[i]-97]++;
        }
        sort(arr);
        if (arr[0]!=0){
            System.out.println("Pangram");
        }
        else {
            System.out.println("Not Pangram");
        }
    }
}
