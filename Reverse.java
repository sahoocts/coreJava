package HackersRankk;

public class Reverse {
    public static void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);
        String A = sc.next();*/
        String A="madam";
        char ch[] = A.toCharArray();
        int i = 0;
        int j = A.length()-1;
       // char c;
        while (i < j) {
           char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
        String str = String.valueOf(ch);
        System.out.print(str);
        if (A.equals(str)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
