package dant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.SortedMap;

public class PoleProstokata {
    public static void main(String[] args) throws IOException  {


        System.out.println("Wpisz bok a prostokąta");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Wpisz drugi bok prostokąta");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner.nextDouble();

        System.out.println("Pole prostokąta to " + a*b);

        // drugie rozwiązanie
        System.out.println();

            double x, y, sqr;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Program obliczy pole prostokąta.");
            System.out.println("Podaj pierwszy bok");
            x = Double.parseDouble(br.readLine());
            System.out.println("Podaj drugi bok prostokąta");
            y = Double.parseDouble(br.readLine());
            sqr = x * y;
            System.out.println("Pole prostokąta wynosi " + sqr);


    }
}
