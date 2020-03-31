/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Treetacle
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //zad1
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedzialek");
        zbiorDni.add("wtorek");
        zbiorDni.add("sroda");
        zbiorDni.add("czwartek");
        zbiorDni.add("piatek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");
        
        System.out.println(zbiorDni);
        
        //Odpowiedzi na pytania z zadania 1:
        //1. HashSet zapewnia tylko unikalność elementów, natomiast TreeSet dodatkowo sortuje dane.
        //2. HashSet jeżeli zależy nam na szybkości operacji, notmiast TreeSet kiedy potrzebujemy danych posortowanych
        //3. Dodaanie biblioteki java.util.HashSet, ale jeżeli chciałbym zastosować inny rodzaj sortowania to musiałbym zaimplementować interfejs "Comparator"
        
        //zad2
        Map<String, Person> sT = new HashMap<>();
        
        sT.put("Aplikacje internetowe w technologii .NET", new Person("Maciej", "Poliwoda", "mpoliwoda@zut.edu.pl"));
        sT.put("Architektura informacji w serwisach internetowych", new Person("Adam", "Nowosielski", "anowosielski@zut.edu.pl"));
        sT.put("Programowanie Obiektowe", new Person("Mateusz", "Nowak", "jkowalski@zut.edu.pl"));
        sT.put("Bazy i hurtownie danych w Internecie", new Person("Łukasz", "Cieszyński", "lcieszynski@zut.edu.pl"));
        
        System.out.println(sT.get("Programowanie Obiektowe"));
        
        List<Student> g1 = new ArrayList<>();
        List<Student> g2 = new ArrayList<>();
        List<Student> g3 = new ArrayList<>();
        
        g1.add(new Student("Jan", "kowalski", "22321@zut.edu.pl", "1"));
        g1.add(new Student("Marcin", "Mickiewicz", "4323@zut.edu.pl", "1"));
        g1.add(new Student("Jerzy", "Kalibabka", "2321@zut.edu.pl", "1"));

        g2.add(new Student("Michał", "Wojcik", "43234@zut.edu.pl", "2"));
        g2.add(new Student("Adam", "Mak", "4325@zut.edu.pl", "2"));
        g2.add(new Student("Zbigniew", "tunczyk", "5332@zut.edu.pl", "2"));
    
        g3.add(new Student("Adam", "Malysz", "3455@zut.edu.pl", "3"));
        g3.add(new Student("Marcin", "Marciniak", "5545@zut.edu.pl", "3"));
        g3.add(new Student("Janusz", "Tracz", "666@zut.edu.pl", "3"));
    
        Map<String, List<Student>> listStudent = new HashMap<>();
        
        listStudent.put("32", g1);
        listStudent.put("33", g2);
        listStudent.put("34", g3);
        
        System.out.println(listStudent.get("32"));
        
        //zad3
        Product[] p1 = new Product[20];
        List<Product> list_p1 = new ArrayList<>();
        Map<Integer,Product> id_p1 = new HashMap<>();
        Map<String, List<Product>> cat_p1 = new HashMap<>();
        
        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {
            int i = 0;
            String s = in.readLine();
            while(s!=null) {
                String[] pola = s.split(";");
                p1[i] = new Product(Integer.parseInt(pola[0]), pola[1], pola[2], Double.parseDouble(pola[3]));
                list_p1.add(p1[i]);
                id_p1.put(Integer.parseInt(pola[0]), p1[i]);
                
                if (!cat_p1.keySet().contains(pola[2])) {
                    cat_p1.put(pola[2], new ArrayList<Product>());
                }
                cat_p1.get(pola[2]).add(p1[i]);
                
                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(list_p1);
        System.out.println(id_p1.get(108));
        for (String cat : cat_p1.keySet()) {
            for (int i = 0; i < cat_p1.get(cat).size(); i++) {
                System.out.println(cat + " - " + cat_p1.get(cat).get(i));
            }
        }
        
    }
    
}
