public class RepeatingDigitInGivenNumber {

    public static void printDup(String n){
        int cnt[]=new int[10];
        for(int i=0;i<n.length();i++){
            int digit=(n.charAt(i)-'0');
            cnt[digit]=cnt[digit]+1;
        }
        for(int i=0;i<10;i++){
            if(cnt[i]>1){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        String N = "45244336543";
        printDup(N);
    }
}
