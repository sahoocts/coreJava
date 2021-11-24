public class Test {
    public static void main(String args[]){
        String str="SAROJ";
        char ch[]=str.toCharArray();
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
       for(int k=0;k<ch.length;k++){
           System.out.println(ch[k]);
       }

        }
    }

