public class ElectricGuitar {

    // Instance variables
    private String brand;
    private int numOfPickups;
    private boolean rockstarUsesIt;

    // Methods
    String getBrand() {
        return brand;
    }
    void setBrand(String aBand) {
        brand = aBand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockstarUsesIt(){
        return rockstarUsesIt;
    }
    void setRockstarUsesIt(boolean yesOrNo) {
        rockstarUsesIt = yesOrNo;
    }

}
