public class StringRotationEachOher {
    public static void main(String args[]){
        String str1="abcd";
        String str2="adbc";
        if(str1.length()!=str2.length()){
            System.out.println("Not present");
            return;
        }
        int count=0;
        int n=str1.length();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    count++;
                }
            }
        }

        if(count==n){
            System.out.println("Is a substring");
        }
        else{
            System.out.println("No");
        }

    }
}
