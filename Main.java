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
            int ksi;
            double s = 0, s1 = 0, sa, sa1, z, prob, sum, lambda, d = 0;

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

                System.out.println("Lambda: " + lambda);
                System.out.println("Pr: " + prob);
                System.out.println("Ksi: " + ksi);

                s += ksi;
                s1 += Math.pow(ksi, 2);

            }

            sa = s / 100.0;
            sa1 = s1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("S: " + s);
            System.out.println("S1: " + s1);
            System.out.println("Sa: " + sa);
            System.out.println("Sa1: " + sa1);
            System.out.println("D: " + d);

        }
    }

    public static void main2(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // Geom
            int ksi;
            double s = 0, s1 = 0, sa, sa1, z, prob, sum, p, d = 0;

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

                s += ksi;
                s1 += Math.pow(ksi, 2);
                System.out.println("Ksi: " + ksi);

            }

            sa = s / 100.0;
            sa1 = s1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("S: " + s);
            System.out.println("S1: " + s1);
            System.out.println("Sa: " + sa);
            System.out.println("Sa1: " + sa1);
            System.out.println("D: " + d);

        }
    }

    public static void main3(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // Binom
            int ksi, n, min = 1, max = 100;
            double s = 0, s1 = 0, sa, sa1;
            double z, p, d = 0;

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

                s += ksi;
                s1 += Math.pow(ksi, 2);
                System.out.println("Ksi: " + ksi);

            }

            sa = (int) s / 100.0;
            sa1 = (int) s1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("S: " + s);
            System.out.println("S1: " + s1);
            System.out.println("Sa: " + sa);
            System.out.println("Sa1: " + sa1);
            System.out.println("D: " + d);

        }
    }

    public static void main4(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // PP
            int a = 5, b = 15;
            double s = 0, s1 = 0, ksi, z, sa, sa1, d = 0;

            System.out.println("A: " + a);
            System.out.println("B: " + b);

            for (int i = 0; i < 100; i++) {
                Random rd = new Random();
                z = rd.nextDouble();
                System.out.println("Z: " + z);

                ksi = ((b - a) * z + a);
                System.out.println("Ksi: " + ksi);

                s += ksi;
                s1 += Math.pow(ksi, 2);
            }

            sa = s / 100.0;
            sa1 = s1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("S: " + s);
            System.out.println("S1: " + s1);
            System.out.println("Sa: " + sa);
            System.out.println("Sa1: " + sa1);
            System.out.println("D: " + d);
        }
    }

    public static void main5(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // EP
            double ksi = 0, a, sa, sa1, z = 0, d = 0, s = 0, s1 = 0;

            a = new Random().nextInt();

            System.out.println("A: " + a);

            for (int i = 0; i < 100; i++) {

                for (int j = 0; j < 100; j++) {
                    Random rd = new Random();
                    z = rd.nextDouble();
                    System.out.println("Z: " + z);
                }

                ksi = ((-1 / a) * Math.log(1 - z));

                s += ksi;
                s1 += Math.pow(ksi, 2);

                System.out.println("Ksi: " + ksi);

            }

            sa = s / 100.0;
            sa1 = s1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("S: " + sa);
            System.out.println("S1: " + sa1);
            System.out.println("D: " + d);

        }
    }

    public static void main6(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            // NP
            int ksi;
            double a, Sn = 0, S = 0, S1 = 0, b, z = 0.0, sa, sa1, d;

            a = new Random().nextInt();
            b = new Random().nextInt();

            System.out.println("A: " + a);
            System.out.println("B: " + b);

            for (int i = 0; i < 100; i++) {

                ksi = 0;

                for (int j = 0; j < 100; j++) {
                    Random rd = new Random();
                    z = rd.nextDouble();
                    System.out.println("Z: " + z);
                }

                Sn = (S - 50) / Math.sqrt(100 / 12);
                ksi = (int) (Sn * b + a);

                S += ksi;
                S1 += Math.pow(ksi, 2);

                System.out.println("S: " + S);
                System.out.println("S1: " + S1);
                System.out.println("Sn: " + Sn);
                System.out.println("Ksi: " + ksi);
            }

            sa = S / 100.0;
            sa1 = S1 / 100.0;

            d = sa1 - Math.pow(sa, 2);

            System.out.println("SA: " + sa);
            System.out.println("SA1: " + sa1);
            System.out.println("D: " + d);

        }
    }

}
