import java.util.Arrays;
import java.util.Scanner;

public class Jobs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] JobDone = new int[5];

        for (int i = 0; i < JobDone.length; i++) {
            System.out.print("Enter the Frequency of the Job in "+ (i+1) +" is :");
            JobDone[i] = in.nextInt();;

        }
        System.out.println();
        System.out.println("Your Frequency of works are following : ");
        System.out.println();

        System.out.println(Arrays.toString(JobDone));
    }
}
