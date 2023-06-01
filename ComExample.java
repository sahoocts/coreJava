package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyCom implements Comparator<Players>{

    public int compare(Players a,Players b){

        if(a.score>b.score)
            return 1;
        else if(a.score<b.score){
            return -1;
        }
        else{
            return a.name.compareTo(b.name);
        }
    }
}

public class ComExample {

    public static void main(String args[]){
        ArrayList<Players> al=new ArrayList<>();
        al.add(new Players("amy ",100));
        al.add(new Players("david  ",100));
        al.add(new Players("heraldo  ",50));
        al.add(new Players("aakansha  ",75));
        al.add(new Players("aleksa  ",150));
        Collections.sort(al,new MyCom());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
