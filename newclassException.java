package Java8.MCQS;
import java.io.IOException;
import java.util.EmptyStackException;

public class newclassException {

  //  public class newclass

        public static void main(String[] args)
        {
            try
            {
                System.out.printf("%d", 1);
                throw new Exception();
            }
            catch(IOException e)
            {
                System.out.printf("%d", 2);
            }
            catch(EmptyStackException e)
            {
                System.out.printf("%d", 3);
            }
            catch(Exception e)
            {
                System.out.printf("%d", 4);
            }
            finally
            {
                System.out.printf("%d", 5);
            }
        }
    }


