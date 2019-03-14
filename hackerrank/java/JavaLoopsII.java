package hackerrank.java;

import java.util.*;

class Query{
    public int a, b, c;

    public Query(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

};

public class JavaLoopsII{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        Query[] x = new Query[n];

        for(int i=0; i<n; i++){
            x[i] = new Query(cin.nextInt(), cin.nextInt(), cin.nextInt());
        }

        cin.close();

        for(int i=0; i<n; i++){
            int basis=1, result=x[i].a;
            for(int j=0; j<x[i].c; j++){
                int tmp = basis * x[i].b;
                result += tmp;
                if(j!=(x[i].c - 1)){
                    System.out.print(result + " ");
                }
                else{
                    System.out.print(result);
                }
                basis *= 2;
            }
            System.out.print("\n");
        }

    }
}