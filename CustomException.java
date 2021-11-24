class InvalidException extends RuntimeException{
    InvalidException(String str){

    }
}

public class CustomException {

    static void validate(int age){
        if(age<23){
            throw new InvalidException("Not valid");
        }
        System.out.println("done");
    }

    public static void main(String args[]){
        try{
            validate(34);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

    }


