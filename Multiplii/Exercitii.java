package Multiplii;

import java.util.Scanner;

public class Exercitii {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;

//        ismultiple3(4);
//isMultiple5(0);

        String sir = new String("Andrei");

        System.out.println(Math.pow(2, 3));


        for (int i = 0; i < 10; i++) {
            if (ismultiple3(i) || isMultiple5(i)) {
                sum += i;

            }


        }


        System.out.println("Suma numerelor divizibile cu 3 si 5 este " + sum);

//        ariaCercului();
//        circumferintaCerc();

        //sumofDigits();
        // reverseString();


//        System.out.println("Introduceti numarul :");
//        int numar = scanner.nextInt();
//        boolean rezultat = PrimeNumber(numar);

        //  System.out.println(rezultat);

        int numardeverificat = 26;

        int maxPrimeDiv = CMMDC(numardeverificat);

        System.out.println("Cel mai mare divizor al lui " + numardeverificat + " este " + maxPrimeDiv);

        // System.out.println(maxPrimeNumber(14));


        int [] c={14,26,10,30};

        System.out.println("CMMDC pt fiecare element din sirul :");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("este :");

        returnCMMDCFromArray(c);

    }


    public static boolean ismultiple3(int a) {

        return a % 3 == 0;

    }


    public static boolean isMultiple5(int b) {


        return b % 5 == 0;
    }


    public static void ariaCercului() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti raza cercului :");
        double raza = scanner.nextDouble();
        double pi = 3.14F;

        double aria = pi * Math.pow(raza, 2);

        System.out.println("Aria cercului este " + aria);

    }


    public static void circumferintaCerc() {
        Scanner scanner = new Scanner(System.in);
        float pi = 3.14F;
        System.out.println("Introduceti raza:");
        float raza = scanner.nextFloat();

        float circumferinta = 2 * pi * raza;

        System.out.println("Circumferinta cercului este " + circumferinta);
    }


    public static void sumofDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int a = scanner.nextInt();
        int sum = 0;

        while (a != 0) {
            sum += a % 10;
            a = a / 10;

        }

        System.out.println("Suma cifrelor este " + sum);

    }


    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti sirul:");
        String sir = scanner.nextLine();
        String sirnou = new String();
        String sir3;

        for (int i = 0; i < sir.length(); i++) {


        }


        System.out.println(sirnou);
    }

    public static boolean primeNumber(int a) {


        for (int divizor = 2; divizor < a; divizor++) {
            if (a % divizor == 0) {

                return false;


            }


        }

        return true;

    }

    //CMMDC
    public static int CMMDC(int altnumar) {
        int max = 0;


        for (int i = 2; i <= altnumar / 2; i++) {         //pt optimizare impartim altnumar la 2,pt ca dupa jumatatea lui nu mai sunt divizori,<= ca sa verifice si jumatatea
            boolean esteDivizor = altnumar % i == 0;
            if (esteDivizor && primeNumber(i)) {

                max = i;


            }

        }


        return max;
    }


    public static void returnCMMDCFromArray(int[] c) {
        for (int i = 0; i < c.length; i++) {
            CMMDC(c[i]);

            System.out.print(CMMDC(c[i])+" ");

        }


    }


}

//TEMA: De pus toate exercitiile pe git 