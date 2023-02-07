public class Anagram {
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
//    This method Sort the Given Character array in ascending order
    static void Sort(char[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
//    This method compare to Character Array and checks if character present in array are same or not, if not same return false, otherwise true
    static boolean compare(char[] arr1, char[] arr2){
        for (int i=0; i<arr1.length; i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="school master";
        String s2="the classroom";

        s1=replaceWhiteSpace(s1);
        s2=replaceWhiteSpace(s2);

//        Converting these Strings into character array
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
//Sorting the Character Array
        Sort(chars1);
        Sort(chars2);

        if (compare(chars1,chars2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
