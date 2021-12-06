package day12.Task5.Classes;


import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();



    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public String getName() {
        return name;
    }
    public int getYear(){
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public List<MusicArtist> getMembers() {
        return members;
    }
    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
    public static void transferMembers(MusicBand a, MusicBand b){
        for (MusicArtist member : a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }
    public void printMembers(){
        System.out.println(this.members);
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }


}
