package Java8.MCQS;

public class MainC {

        static int methodOne(int i)
        {
           // return methodTwo(i=i*11);
            return methodTwo(i=i*11);
        }

        static int methodTwo(int i)
        {
            return methodThree(i /= 11);
        }

        static int methodThree(int i)
        {
            return methodFour(i -= 11);
        }

        static int methodFour(int i)
        {
            return i += 11;
        }

        public static void main(String[] args)
        {
            System.out.println(methodOne(11));
        }
    }

