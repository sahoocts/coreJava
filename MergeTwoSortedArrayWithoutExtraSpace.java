package TwentySeven;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutExtraSpace {
    static void mergeTwoSorted(int a1[],int a2[]){
        int n=a1.length;
        int m=a2.length;
        int i=0;
        int j=0;
        while(i<n){
            if(a1[i]>a2[j]){
                int temp=a1[i];
                a1[i]=a2[j];
                a2[j]=temp;
                fixA2(a2);
            }
            i++;
        }
        StringBuffer sf=new StringBuffer();
        for(int k=0;k<n;k++){
            sf.append(a1[k]+" ");
        }

        for(int k=0;k<n;k++){
            sf.append(a2[k]+" ");
        }
        System.out.print(sf);
    }
    static void fixA2(int a3[]){
        int n1=a3.length;
        for(int i=1;i<n1;i++){
            if(a3[i]<a3[i-1]){
                int temp=a3[i];
                a3[i]=a3[i-1];
                a3[i-1]=temp;
            }

        }

    }
    public static void main(String args[]){
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        mergeTwoSorted(arr1,arr2);
    }
}
