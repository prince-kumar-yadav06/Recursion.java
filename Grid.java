public class Grid{

    public static int Sol(int i,int j,int n,int m){

        if(i==n-1 && j== m-1){
            return 1;
        }

        // agr i ya j koi bhi grid se bahaar chal gya mtlb solution nhi hai 
        else if(i== n || j==m){
            return 0;
        }

        int w1=Sol(i, j+1, n, m);
        int w2=Sol(i+1, j, n, m);

        return w1+w2;
    }
    public static void main(String args[]){

        int n=3;
        int m=3;

        System.out.println(Sol(0,0,n,m));
    }
}
