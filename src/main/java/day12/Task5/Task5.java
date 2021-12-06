package day12.Task5;

import day12.Task5.Classes.MusicBand;
import day12.Task5.Classes.MusicArtist;

import java.util.ArrayList;
import java.util.List;

import static day12.Task5.Classes.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist ma1 = new MusicArtist("Ivanov", 25);
        MusicArtist ma2 = new MusicArtist("Petrov", 35);
        MusicArtist ma3 = new MusicArtist("Lenin", 19);
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(ma1);
        members1.add(ma2);
        members1.add(ma3);
        MusicBand band1 = new MusicBand("Gagaga", 1995, members1);

        MusicArtist ma4 = new MusicArtist("petuh", 23);
        MusicArtist ma5 = new MusicArtist("gus", 30);
        MusicArtist ma6 = new MusicArtist("voron", 27);
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(ma4);
        members2.add(ma5);
        members2.add(ma6);
        MusicBand band2 = new MusicBand("Opopo", 2001, members2);

        band1.printMembers();
        band2.printMembers();

        transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }

}
