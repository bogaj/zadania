package dant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pi {
    public static void main(String[] args) throws IOException {
        System.out.println("Działania na Pi");
        System.out.printf("PI =" +"%6.5f\n",Math.PI); //oznacza ze przeznaczamy 6 pól w tym 5 na część ułamkową
        System.out.println();
        System.out.println("pierwiastek kwadratowy z Pi z dokładnością do 3 miejsc po przecinku");
        System.out.printf("PI =" +"%4.3f\n",Math.sqrt(Math.PI));
        System.out.println();
        System.out.println("Oblicza objętość kuli do 3 miejsc po przecinku \n");

        double r, objetosc;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj promień kuli");
        r = Double.parseDouble(br.readLine());
        objetosc = 4*Math.PI * r*r*r/3;
        System.out.printf("Objetosc kuli to: " + "%3.3f\n",objetosc);

    }
}
