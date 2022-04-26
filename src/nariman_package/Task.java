package nariman_package;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] inhabitants = new int[]{3, 6, 0, 4, 3, 2, 7, 0};
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int length = inhabitants.length;
        int day = 0;
        int sum;

        do {
            day++;
            sum = 0;
            int[] temp = Arrays.copyOf(inhabitants, length);
            for (int i = 0; i < length; i++) {
                if (inhabitants[i] == 0 && i != 0 && i != length - 1) {
                    temp[i - 1] = inhabitants[i - 1] / 2;
                    temp[i + 1] = inhabitants[i + 1] / 2;

                } else if (i == 0 && inhabitants[i] == 0) {
                    temp[i + 1] = inhabitants[i + 1] / 2;

                } else if (i == length - 1 && inhabitants[i] == 0) {
                    temp[i - 1] = inhabitants[i - 1] / 2;
                }
            }
            for (int j = 0; j < length; j++) {
                inhabitants[j] = temp[j];
            }
            for (int city : inhabitants) {
                sum += city;
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }


        } while (sum != 0);
    }
}


