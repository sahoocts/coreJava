package NewHackersRank;

public class RecursionExample {

        /*static int count=0;
        static void p(){
            count++;
            if(count<=5){
                System.out.println("hello "+count);
                p();
            }
        }*/

    static int count=0;
    static void p(){
        count++;
        if(count<=5){
            System.out.println("hellow"+count);
            p();
        }
    }
        public static void main(String[] args) {
            p();
        }
    }

