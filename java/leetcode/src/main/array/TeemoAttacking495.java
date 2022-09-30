package main.array;

/**
 * @author User
 */
public class TeemoAttacking495 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        //Input: timeSeries = [1,4], duration = 2
        //Output: 4
        int[] list = {1, 4};
        System.out.println(new TeemoAttacking495().findPoisonedDuration(list, 2));
        System.out.println("========================");
        /*
        Input: timeSeries = [1,2], duration = 2
        Output: 3
        */
        list = new int[]{1,2};
        System.out.println(new TeemoAttacking495().findPoisonedDuration(list, 2));
        System.out.println("========================");
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        int begin = timeSeries[0];
        int total = 0;
        for (int t : timeSeries) {
            total = total + (t < begin + duration ? t - begin : duration);
            begin = t;
        }
        return total + duration;
    }
}
