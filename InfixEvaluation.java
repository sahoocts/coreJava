package TwentyFive;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
       // String st=sc.nextLine();
        String st="2+(5-3*6/2)";
      //  System.out.print(st);
        Stack<Integer> opands=new Stack<>();
        Stack<Character> optors=new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='('){
                optors.push(ch);
            }
            else if(Character.isDigit(ch)){
                opands.push(ch-'0');
            }
            else if(ch==')'){
                while(optors.peek()!='('){
                    char aptor=optors.pop();
                    int v2=opands.pop();
                    int v1=opands.pop();
                    int opv= operation(v1,v2,aptor);
                    opands.push(opv);
                }

            }
            else if(ch=='+' || ch== '-' || ch== '*' || ch=='/'){
              while(optors.size()>0 && optors.peek()!='(' && precedence(ch)<=precedence(optors.peek())){
                  char aptor=optors.pop();
                  int v2=opands.pop();
                  int v1=opands.pop();
                  int opv= operation(v1,v2,aptor);
                  opands.push(opv);
              }
                optors.push(ch);
            }
            while(optors.size()!=0){
                char aptor=optors.pop();
                int v2=opands.pop();
                int v1=opands.pop();
                int opv= operation(v1,v2,aptor);
                opands.push(opv);
            }
            System.out.println(opands.peek());
        }

    }

    private static int precedence(char aptor) {
        if(aptor =='+'){
            return 1;
        }
        else if(aptor =='-'){
            return 1;
        }

        else if(aptor == '*'){
            return 2;
        }
        else{
            return 2;
        }
    }

    private static int operation(int v1, int v2, char aptor) {
        if(aptor =='+'){
            return v1+v2;
        }
        else if(aptor=='-'){
            return v1-v2;
        }

        else if(aptor== '*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }


}
