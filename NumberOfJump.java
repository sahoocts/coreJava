package New_Leetcode;

public class NumberOfJump {
   private static int getJump(int s[]){
       int pos=0;
       int des=0;
       int jump=0;
       for(int i=0;i<s.length-1;i++){
           des=Math.max(des,s[i]+i);
           if(pos==i){
               pos=des;
               jump++;
           }
       }
        return jump;
    }
    public static void main(String args[]){
        int a[]={2,3,1,1,4};
        int x=getJump(a);
        System.out.print(x);
    }
}
