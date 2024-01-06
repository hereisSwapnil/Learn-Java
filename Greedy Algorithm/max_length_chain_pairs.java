import java.util.Arrays;
import java.util.Comparator;

public class max_length_chain_pairs {
    public static void main(String[] args) {
        int chains[][] = new int[][] { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(chains, Comparator.comparingDouble(o -> o[1]));
        int noOfSelectedChains = 1;
        int lastSelectedEnd = chains[0][1];
        for (int i = 0; i < chains.length; i++) {
            if (chains[i][0] >= lastSelectedEnd) {
                noOfSelectedChains++;
                lastSelectedEnd = chains[i][1];
            }
        }
        System.out.println("The number of selected chains are: " + noOfSelectedChains);
    }
}
