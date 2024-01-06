import java.util.Arrays;
import java.util.Collections;

public class chocola_problem {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer cosVer[] = new Integer[] { 2, 1, 3, 1, 4 };
        Integer cosHor[] = new Integer[] { 4, 1, 2 };
        // solution below
        Arrays.sort(cosVer, Collections.reverseOrder());
        Arrays.sort(cosHor, Collections.reverseOrder());
        int v = 1;
        int h = 1;
        int vp = 0;
        int hp = 0;
        int cost = 0;
        while (hp < cosHor.length && vp < cosVer.length) {
            if (cosHor[hp] >= cosVer[vp]) {
                cost += v * (cosHor[hp]);
                hp++;
                h++;
            } else {
                cost += h * (cosVer[vp]);
                vp++;
                v++;
            }
        }
        while (hp < cosHor.length) {
            cost += v * (cosHor[hp]);
            hp++;
            h++;
        }
        while (vp < cosVer.length) {
            cost += h * (cosVer[vp]);
            vp++;
            v++;
        }
        System.out.println("Minimum cost is: " + cost);
    }
}
