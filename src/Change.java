import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Change {
    public static int getChange(int m) {
        List<Integer> facials = new ArrayList<Integer>(){{ add(10); add(5); add(1);}};

        int leftQuantity = m;
        int numberOfFacials = 0;
        while (leftQuantity > 0) {
            while (leftQuantity >= facials.get(0)) {
                leftQuantity -= facials.get(0);
                numberOfFacials++;
            }
            facials.remove(0);
        }

        return numberOfFacials;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

