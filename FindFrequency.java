package Geeksforgeeks;
//Given a vector of N positive integers and an integer X. The task is to find the frequency of X
//N = 5
//vector = {1, 1, 1, 1, 1}
//X = 1
//Output:
//5
public class FindFrequency {

    static int getFre(int a[],int x){
        int fre=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                fre++;
            }
        }
        return fre;
    }

    public static void main(String args[]){
       int N = 5;
        int a[]={1, 1, 1, 1, 1};
        int X = 1;
       int x= getFre(a,X);
       System.out.println("fre is:"+x);

    }
}
