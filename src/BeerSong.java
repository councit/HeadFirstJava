// This program is to output the Song "99 Bottles of Beer on the Wall"

public class BeerSong {

    public static void main(String[] args){

        int numBottles = 99;
        String lastItem = "bottle";
        String Items = "bottles";

        while(numBottles > 1){
            System.out.println(numBottles + " " + Items + " of beer on the wall,");
            System.out.println(numBottles + " " + Items  + "of beer. ");
            System.out.println("Take one down pass it around.");
            numBottles--;
            System.out.println(numBottles + " " + "bottles of beer on the wall!");
            System.out.println();

        }
        System.out.println(numBottles + " " + lastItem + " of beer on the wall,");
        System.out.println(numBottles + " " + lastItem  + " of beer. ");
        System.out.println("Take one down pass it around.");
        System.out.println("No more bottles of beer on the wall!");

    }

}
