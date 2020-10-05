package dant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProsteDzialania {
    public static void main(String[] args) throws IOException {

        float x, y, total, difference, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczy sumę, różnicę, iloczyn oraz iloraz dwóch liczb");
        System.out.println("wprowadź pierwszą liczbę:");
        x = Float.parseFloat(br.readLine());
        System.out.println("Podaj drugą liczbę:");
        y = Float.parseFloat(br.readLine());
        total = x+y;
        difference = x-y;
        product = x*y;
        quotient = x/y;
        System.out.printf("Suma: " +  total + "\n");
        System.out.printf("Różnica: " +  difference + "\n");
        System.out.printf("Iloczyn: " +  product + "\n");
        System.out.printf("Iloraz: " + quotient);


    }
}
