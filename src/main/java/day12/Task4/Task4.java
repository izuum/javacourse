package day12.Task4;

import java.util.ArrayList;
import java.util.List;

import static day12.Task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Ivanov");
        members1.add("Petrov");
        members1.add("Lenin");
        members1.add("Sidorov");

        MusicBand band1 = new MusicBand("Gagaga", 1995, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("petuh");
        members2.add("gus");
        members2.add("voron");
        
        MusicBand band2 = new MusicBand("Opopo", 2001, members2);
        
        band1.printMembers();
        band2.printMembers();

        transferMembers(band1, band2);
        
        band1.printMembers();
        band2.printMembers();
    }
}
