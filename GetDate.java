package HackersRankTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class GetDate {

    public static void main(String args[]){
        LocalDate today=LocalDate.now();
        int day=today.getDayOfMonth();
        int month=today.getMonthValue();
        int year=today.getYear();
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

    }
}
