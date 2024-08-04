import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("n: ");
        int n = inp.nextInt();
        System.out.print("r: ");
        int r = inp.nextInt();
        int C_n_r;

        if(r > n || n < 0 || r < 0){
            System.out.println("In combination calculation must have 'n >= r' & n > 0 & r > 0");
        }
        else {
            int factN = 1;
            for (int i = n; i > 0; --i)
                factN *= i;
            //System.out.println(n+"!: "+factN);

            int factR = 1;
            for (int i = r; i > 0; --i)
                factR *= i;
            //System.out.println(n+"!: "+factR);

            int fact_N_R = 1;
            for (int i = n - r; i > 0; --i)
                fact_N_R *= i;
            //System.out.println(n+"!: "+fact_N_R);


            C_n_r = factN / (factR * fact_N_R);
            System.out.println("C(" + n + "," + r + ") = " + C_n_r);
        }
    }
}