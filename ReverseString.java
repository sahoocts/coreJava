package NewTry;

public class ReverseString {
    static void swap(char ch[]){
        int i=0;
        int j=ch.length-1;
        char temp;
        while(i<j){
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for(char c:ch){
            System.out.print(c);
        }
    }


    public static void main(String[] args) {
        String str="SAROJ";
        char ch[]=str.toCharArray();
        swap(ch);
    }
}
