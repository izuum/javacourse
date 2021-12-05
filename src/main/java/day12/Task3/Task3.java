package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList();
        bands.add(new MusicBand("Green Day", 1986));
        bands.add(new MusicBand("Linkin Park", 1996));
        bands.add(new MusicBand("Limp Bizkit", 1994));
        bands.add(new MusicBand("System of a Down", 1992));
        bands.add(new MusicBand("Metallica", 1981));
        bands.add(new MusicBand("Время и стекло", 2010));
        bands.add(new MusicBand("Нервы", 2010));
        bands.add(new MusicBand("Группа1", 2005));
        bands.add(new MusicBand("Не Группа2", 2003));
        bands.add(new MusicBand("Группа НЕ3", 2009));

        Collections.shuffle(bands);
        for (MusicBand band : bands){
            System.out.println(band);
        }
        System.out.println();

        groupsAfter2000(bands);
    }
    public static void groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupAfter2000 = new ArrayList();
        for (MusicBand band : bands){
            if (band.getYear() > 2000){
                groupAfter2000.add(band);
            }
        }
        for (MusicBand band : groupAfter2000){
            System.out.println(band);
        }
    }
}
