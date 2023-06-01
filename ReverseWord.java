package AddDigit;

public class ReverseWord {
    public static void main(String args[]){
        String str="My name is Saroj";
        String str2[]=str.split(" ");
       /* for(String s:str2){
            System.out.println(s);
        }*/
        int i=0;
        int j=str2.length-1;
        String s="";
        while(i<j){
            s=str2[i];
            str2[i]=str2[j];
            str2[j]=s;
            i++;
            j--;
        }
        for(String s1:str2){
            System.out.print(s1+" ");
        }
    }
}

