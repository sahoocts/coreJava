package stack;

public class CustomStack {
    protected int data[];
    private static final int default_size=10;
    int ptr=-1;
    CustomStack(){
        this(default_size);
    }
    CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.print("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;

        return true;
    }

    public int pop()throws StackException{
        if(isEmpty()){
            throw new StackException("Not empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Not empty");
        }
        return data[ptr];
    }
    public boolean isFull(){
       return ptr==data.length-1;
            //return true;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
}
