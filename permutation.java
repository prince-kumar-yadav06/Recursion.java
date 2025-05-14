import java.io.StringBufferInputStream;
import java.util.*;

public class permutation {
    
    // approach 1 
//     public static void printpermutation(String str,String ans){

//         if(str.length() ==0){
//             System.out.println(ans);
//             return;
//         }

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);

//             String newstr=str.substring(0,i)+str.substring(i+1);


// printpermutation(newstr, ans+ch);
        // }

        public static void printpermutation(StringBuilder str,int idx,List<String> ans){

            if(str.length() == idx){
                ans.add(str.toString());
                return;
            }

            for(int i=idx;i<str.length();i++){
                swap(str,idx,i);

                printpermutation(str, idx+1, ans);

                swap(str,idx,i);
            }
        }
        public static List<String> findpermutation(String str){

            List<String> ans=new ArrayList();

            StringBuilder s=new StringBuilder(str);

            printpermutation(s, 0, ans);
              Collections.sort(ans);
            return ans;
        }
    

        public static void swap(StringBuilder str, int idx,int i){

            char temp=str.charAt(i);
            str.setCharAt(i, str.charAt(idx));
            str.setCharAt(idx, temp);

            
        }
    public static void main(String args[]){

        String str="abc";
       
       List<String> res= findpermutation(str);

        for (String x : res) {
            System.out.print(x + " ");
        }
    }
}
