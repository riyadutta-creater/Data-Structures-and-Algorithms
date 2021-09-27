public class Fibo {
    public static void main(String[] args) {
        int f1=0,f2=1;
        int n = 5,f=0;
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        for(int i=2;i<=n;i++){
            f=f1+f2;
            System.out.print(f+" ");
            f1=f2;
            f2=f;
        }
    }
}
