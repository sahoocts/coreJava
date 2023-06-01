package LogicImplemented;

public class RemoveCommonCharcter {

    public static void main(String argc[])
    {
        String str1="aahcdb";
        String str2="gakfd";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            int flag=0;
            for(int j=0;j<str2.length();j++){

                if(str1.charAt(i)==str2.charAt(j)){
                    flag=1;
                }
                if(flag==0){
                    sb.append(str1.charAt(i));
                }
            }
        }
        for(int k=0;k<str2.length();k++){
            int flag=0;
            for(int p=0;p<str1.length();p++){

                if(str2.charAt(k)==str1.charAt(p)){
                    flag=1;
                }
                if(flag==0){
                    sb.append(str1.charAt(k));
                }
            }
        }
        System.out.println(sb);
    }
}
