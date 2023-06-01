package NewPrepare;

public class removeCharDup {

    public static void main(String args[]){
        char a[] = "aabcca".toCharArray();
        int n=a.length;
        n = removeduplicates(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }

    private static int removeduplicates(char[] a, int n) {
    char temp[]=new char[a.length];
    int k=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[k++]=a[i];
            }
        }
        temp[k++]=a[n-1];
        for(int i=0;i<k;i++){
            a[i]=temp[i];
        }
        return k;
    }
}
