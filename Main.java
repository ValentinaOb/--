import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1:
                    main1(args);
                    break;
                case 2:
                    main2(args);
                    break;
                case 3:
                    main3(args);
                    break;
            }
        }
    }

    public static void main1(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int ksi, a = 0;
            double z, prob, sum, lambda, sa;

            System.out.println("L: ");
            lambda = in.nextInt();

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                prob = Math.exp(-25);
                sum = prob;
                System.out.println("Pr: " + prob);

                z = new Random().nextInt();
                System.out.println("Z: " + z);

                do {
                    ksi += 1;
                    prob *= lambda / ksi;
                    sum += prob;
                } while (z > sum);

                System.out.println("Ksi: " + ksi);
                System.out.println("Lambda: " + lambda);
                System.out.println("Pr: " + prob);
                System.out.println("Sum: " + sum);
                a += ksi;
                System.out.println("Ksi: " + ksi);

            }

            sa = a / 100.0;

            System.out.println("A: " + a);
            System.out.println("SA: " + sa);

        }
    }

    public static void main2(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            int ksi, a = 0;
            double z, prob, sum, p, sa;

            System.out.println("P: ");
            p = in.nextInt();

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                prob = p;
                sum = prob;
                System.out.println("Pr: " + prob);

                z = new Random().nextInt();
                System.out.println("Z: " + z);

                do {
                    ksi += 1;
                    prob *= (1 - p);
                    sum += prob;
                } while (z > sum);

                System.out.println("Ksi: " + ksi);
                System.out.println("P: " + p);
                System.out.println("Pr: " + prob);
                System.out.println("Sum: " + sum);
                a += ksi;
                System.out.println("Ksi: " + ksi);

            }

            sa = a / 100.0;

            System.out.println("A: " + a);
            System.out.println("SA: " + sa);

        }
    }

    public static void main3(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            int ksi, a = 0, n, min = 1, max = 100;
            double z, sum = 0, p, sa;

            System.out.println("P: ");
            p = in.nextInt();

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                n = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("N: " + n);

                for (int j = 0; j < n; j++) {
                    z = new Random().nextInt();
                    System.out.println("Z: " + z);

                    if (z < p) {
                        ksi += 1;
                    }
                    System.out.println("Ksi: " + ksi);
                }

                System.out.println("P: " + p);
                System.out.println("Sum: " + sum);
                a += ksi;
                System.out.println("Ksi: " + ksi);

            }

            sa = a / 100.0;

            System.out.println("A: " + a);
            System.out.println("SA: " + sa);

        }
    }
}