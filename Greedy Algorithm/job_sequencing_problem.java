import java.util.Arrays;
import java.util.Comparator;

public class job_sequencing_problem {
    public static void main(String[] args) {
        Integer[][] jobs = new Integer[][] { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));
        int profit = 0;
        int time = 0;
        for (int i = jobs.length - 1; i >= 0; i--) {
            if (time < jobs[i][0]) {
                profit += jobs[i][1];
                time += jobs[i][0];
            }
        }
        System.out.println(profit);
    }
}
