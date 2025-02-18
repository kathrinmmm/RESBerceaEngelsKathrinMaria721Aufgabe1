package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    }
}
import model.Haus;
import parser.*;
        import model.Result;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        String tsvFilePath="fisier.tsv";
       TSVParser tsvParser = TSVParser.getInstance();

        List<Result> punkteListe = new ArrayList<>();


        try {

//               punkteListe=tsvParser.parseResults(tsvFilePath);
        } catch (IOException e) {
            System.out.println("A apărut o eroare la citirea fișierului  " + e.getMessage());
        }

//a) lesen von der Datei und auf dem Bildschirm zeigen

        for (Result result : punkteListe) {
            System.out.println(result.toString());
        }
    }
}

