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
                case 4:
                    main4(args);
                    break;
                case 5:
                    main5(args);
                    break;
                case 6:
                    main6(args);
                    break;
            }
        }
    }

    public static void main1(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Pyassonn
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
            // Geom
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
            // Binom
            int ksi, n, min = 1, max = 100;
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
                sum += ksi;
                System.out.println("Ksi: " + ksi);
                System.out.println("Sum: " + sum);

            }

            sa = sum / 100.0;

            System.out.println("Sum: " + sum);
            System.out.println("SA: " + sa);

        }
    }

    public static void main4(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // PP
            int ksi, a = 0, b = 0;
            double z, sum = 0, sa, min = 0, max = 1;

            a = new Random().nextInt();
            b = new Random().nextInt();

            System.out.println("A: " + a);
            System.out.println("B: " + b);

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                for (int j = 0; j < 100; j++) {
                    z = (double) Math.floor(Math.random() * (max - min + 1) + min);
                    System.out.println("Z: " + z);

                    ksi = (int) ((b - a) * z + a);
                    System.out.println("Ksi: " + ksi);
                }

                sum += ksi;
                System.out.println("Sum: " + sum);

            }

            sa = sum / 100.0;

            System.out.println("Sum: " + sum);
            System.out.println("SA: " + sa);

        }
    }

    public static void main5(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // EP
            int ksi;
            double a, z, sum = 0, sa, min = 0, max = 1;

            a = new Random().nextInt();

            System.out.println("A: " + a);

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                for (int j = 0; j < 100; j++) {
                    z = (double) Math.floor(Math.random() * (max - min + 1) + min);
                    System.out.println("Z: " + z);

                    ksi = (int) ((-1 / a) * Math.log(1 - z));
                    System.out.println("Ksi: " + ksi);
                }

                sum += ksi;
                System.out.println("Sum: " + sum);

            }

            sa = sum / 100.0;

            System.out.println("Sum: " + sum);
            System.out.println("SA: " + sa);

        }
    }

    public static void main6(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // NP
            int ksi;
            double a, Sn, S = 0, b, z = 0.0, sa, min = 0.0, max = 1.0;

            a = new Random().nextInt();
            b = new Random().nextInt();

            System.out.println("A: " + a);
            System.out.println("B: " + b);

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                for (int j = 0; j < 100; j++) {
                    z = (double) Math.floor(Math.random() * (max - min + 1) + min);
                    System.out.println("Z: " + z);

                    S += z;
                }
            }

            Sn = S - 50;
            ksi = (int) (Sn * b + a);

            System.out.println("S: " + S);
            System.out.println("Sn: " + Sn);
            System.out.println("Ksi: " + ksi);

            sa = S / 100.0;

            System.out.println("SA: " + sa);

        }
    }

}
