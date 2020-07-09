public class PhraseOMatic {

    public static void main(String[] args){

        // Creating word lists
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-B","win-win","front-end","web-based","critical-path","dynamic"};
        String[] wordListTwo = {"value-added","branded","core","centric","leveraged","aligned"};
        String[] wordListThree = {"point","solution","shared"};

        //Determining length of list items
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generate random number for indexing list
        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        // Building phrase
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        // Printing final output
        System.out.println("What we need is a " + phrase + ".");



    }

}
