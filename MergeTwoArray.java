public class MergeTwoArray {

    public static void getArray(int a[],int b[]){

        int n1=a.length;
        int n2=b.length;
        int c[]=new int[n1+n2];
        int j=0;
        for(int i=0;i<n1;i++){
            c[j]=a[i];
            j++;
        }
        for(int k=0;k<n2;k++){
            c[j]=b[k];
            j++;
        }
        for(int s:c){
            System.out.print(s);
        }

        int temp;
        for(int x=0;x<c.length;x++){
            for (int z=x+1;z<c.length;z++){
                if(c[x]>c[z]){
                    temp=c[x];
                    c[x]=c[z];
                    c[z]=temp;
                }

            }
        }
        for(int d:c){
            System.out.println("sort is::"+d);
        }

    }
    public static void main(String args[]){
        int a[]={4,2,7,8};
        int b[]={1,5,3};
        MergeTwoArray.getArray(a,b);

    }
}
