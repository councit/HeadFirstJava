public class ElectricGuitarTestDrive {

    public static void main(String[] args){

        ElectricGuitar tayGuitar = new ElectricGuitar();

        tayGuitar.setBrand("Epiphone");
        tayGuitar.setNumOfPickups(5);
        tayGuitar.setRockstarUsesIt(true);

        System.out.println(tayGuitar.getBrand());


    }

}
