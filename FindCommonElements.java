package Geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class FindCommonElements {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[]){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: A){

            if(!hm.containsKey(i)){
                hm.put(i, 1);
            }else{
                hm.put(i, hm.get(i)+1);
            }

        }

        for(int i: B){

            if(hm.containsKey(i)){

                hm.remove(i);
                temp.add(i);

            }

        }

        hm.clear();

        for(int i: temp){

            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }

        }
        for(int i: C){

            if(hm.containsKey(i)){

                hm.remove(i);
                ans.add(i);

            }

        }
        return ans;
    }


    public static void main(String args[]){
        int n1 = 6;
        int A[] = {1, 5, 10, 20, 40, 80};
        int n2 = 5; int B[] = {6, 7, 20, 80, 100};
       int n3 = 8; int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> al=commonElements(A,B,C);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
