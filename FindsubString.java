public class FindsubString {
    
    public static void sol(String str,String ans,int i){

        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        // yes choice
        sol(str,ans+str.charAt(i),i+1);

        //no choice
        sol(str,ans,i+1);
    }
    public static void main(String args[]){

        String str="abc";
        sol(str, "", 0);
    }
}
