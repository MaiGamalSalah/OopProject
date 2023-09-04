package main;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
//test file
public class functionsOfData {
//Invoking methods
    private static ArrayList<Citizenes> ListCitizen = new ArrayList<Citizenes>();
//check add and add this in arraylist
    public static void Addtion(Citizenes C) {
        boolean flagVarible = false;
        for (Citizenes addtion : ListCitizen) {
            if (addtion.equals(C)) {
                flagVarible = true;
            }
        }
        if (flagVarible) {
            System.out.println(C.getMy_Name() + "Name is exists");
        } else {
            ListCitizen.add(C);
            System.out.println("Done Added");
        }
    }
//check if that's exast
    public static void AddTo(Citizenes a, DosesPerson b) {
        boolean flager = false;
        for (Citizenes addTo : ListCitizen) {
            if (addTo.equals(a)) {
                addTo.setDose(b);
                flager = true;
            }
        }
        if (flager == false) {
            a.setDose(b);
            ListCitizen.add(a);
        }
    }
//add methods toString
    public static int getNumberVaccine() {
        int check = 0;
        for (Citizenes C : ListCitizen) {
            if (C.getDoses().size() >= 2) {
                System.out.print(C.infro().toString()+"\n");

                check++;
            }
        }
        return check;
    }
//method to save in file
    public static PrintWriter SaveOfData() {   
        Collections.sort(ListCitizen, Citizenes.ByID);
        int counter = functionsOfData.getNumberVaccine();
        try {
 // create a File object that points in text file(Mai).
            File file = new File("C:\\Users\\sun com\\Desktop\\main\\src\\main\\Mai.txt");
//define a PrintWriter object,  pr or any name, which you can use it to write into the text file, use the file object you created 
            PrintWriter Print = new PrintWriter(file);
// use the PrintWriter object to write data.
            Print.println(ListCitizen.toString());
            Print.println(" full vaccinated Citizenes = "+ counter);
//close the Scanner when finished using it
            Print.close();
            return Print;
//if we can occur when a program attempts to open or write to an existing file, but the file is not found.
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        finally{
            System.out.println("filled is oky");
        }
        return null;
    }
}// End of class
