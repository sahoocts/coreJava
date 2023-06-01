package JAVA8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String args[]){
        String sr[]=new String[5];
        int n=sr.length;
        for(int i=0;i<n;i++){
            sr[i]="ok";
        }
        Optional<String> s=Optional.ofNullable(sr[4]);
        if(s.isPresent()){
         System.out.print("ok");
        }
        else{
            System.out.print("no");
        }

    }
}
