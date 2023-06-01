package Small_Program;

public class Testing {

    static int count[]=new int[256];
    static void getchar(String str){
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

    }
    static void getchar1(String str1){
        getchar(str1);
       // int index = -1;
        for(int i=0;i<str1.length();i++){
            if(count[str1.charAt(i)]==1){
                System.out.println(str1.charAt(i));

            }

        }
    }

    public static void main(String args[]){
        String str="daaabbebcccc";
        getchar1(str);
    }
}
