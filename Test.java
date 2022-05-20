package Eighteen_four;

public class Test {

    static int[] getDetails(int a[]){

        int c[]=new int[a.length];
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                c[s]=a[i];
                s++;
            }
        }
         for(int i=0;i<a.length;i++){
             if(a[i]<0){
                 c[s]=a[i];
                 s++;
             }
        }

       /* for(int i=0;i<a.length;){
            if(s<c){
                d[i]=a[s];
                s++;
                i++;
            }
            if(l<a.length){
                d[i]=a[l];
                l++;
                i++;
            }
        }
        return d;*/
        return c;
    }

    public static void main(String args[]){
        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};


        int e[]=getDetails(Arr);
        for(int ee:e){
            System.out.print(ee);
        }

    }
}
