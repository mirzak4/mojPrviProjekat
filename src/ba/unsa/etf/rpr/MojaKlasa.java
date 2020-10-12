package ba.unsa.etf.rpr;

import java.util.Scanner;

public class MojaKlasa {

    public static int sumaCifara (int n)
    {
        int cifra,suma=0;
        do{
            cifra=n%10;
            suma+=cifra;
            n/=10;
        }while(n>0);
        return suma;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.print("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        System.out.print("Brojevi izmedju 1-"+n+" koji su djeljivi sa sumom svojih cifara su: ");
        for (int i=1;i<=n;i++)
            if (i%sumaCifara(i)==0) System.out.print(i+" ");
    }
}
