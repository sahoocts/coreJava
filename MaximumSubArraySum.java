package HackersRank_06062022;

import java.util.Scanner;
//1
//5 7
//3 3 9 9 5
//https://www.hackerrank.com/challenges/maximum-subarray-sum/problem?h_l=interview&h_r=next-challenge&h_v=zen&isFullScreen=true&playlist_slugs%5B%5D=arcesium&page=6
public class MaximumSubArraySum {
    private static void getMaximumSubArraySum(long[] a,long module) {
        int n=a.length;
        long max=0;

       for(int i=0;i<n;i++){
            long m1=a[i]%module;
            if(max<m1){
                max=m1;
            }
        }
        for(int i=0;i<n-1;i++){
            int c=0;
            long p=0;
            for(int j=i;j<=i+1;j++){
                c++;
                p=p+a[j];
                if(c==2){
                  //  System.out.print("p is"+p);
                    long m2=p%module;
                    if(max<m2){
                        max=m2;
                    }
                }
            }
        }

        for(int i=0;i<n-2;i++){
            long p1=0;
            int c1=0;
            for(int j=i;j<=i+2;j++){
                c1++;
                p1=p1+a[j];
                if(c1==3){
                    long m3=p1%module;
                    if(max<m3){
                        max=m3;
                    }
                   // System.out.print(p1);
                }
            }
        }

        for(int i=0;i<n-3;i++){
            long p2=0;
            int c2=0;
            for(int j=i;j<=i+3;j++){
                c2++;
                p2=p2+a[j];
                if(c2==4){
                    long m4=p2%module;
                    if(max<m4){
                        max=m4;
                    }
                   //
                }
            }
        }
        long p5=0;
        int c3=0;
        for(int i=0;i<n;i++){
            c3++;
            p5=p5+a[i];
            if(c3==5){
                //System.out.print(p5);
                long m5=p5%module;
                if(max<m5){
                    max=m5;
                }
            }
        }
           //return max;
        System.out.print(max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            long module= sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
           getMaximumSubArraySum(a,module);
        }

    }


}
