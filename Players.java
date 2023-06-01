package Comparator;

public class Players {
    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    String name;
    int score;

    public Players(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }


}
