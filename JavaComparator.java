package HackersRankk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//Comparators are used to compare two objects.
// In this challenge, you'll create a comparator and use it to sort an array.
//
//The Player class is provided for you in your editor.
// It has  fields: a  String and a  integer.
//
//Given an array of  Player objects,
// write a comparator that sorts them in order of decreasing score;
// if  or more players have the same score, sort those players alphabetically by name.
// To do this, you must create a Checker class that implements the Compara
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {

    public int compare(Player p1,Player p2){
        if(p1.score<p2.score){
            return 1;
        }
        else if(p1.score==p2.score){
            return p1.name.compareTo(p2.name);
        }
        else{
            return -1;
        }
    }
}
public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
