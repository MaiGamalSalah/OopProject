package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //add frist object of Professionis doctors
        Health h1 = new Health(12, "mai", "123"); //1 -objects

        Health h2 = new Health(2, "nona", "127"); //2-objects

        Health h3 = new Health(22, "doaa", "123"); //3-obects

//Add at least 7 citizens to the collection that stores the whole data
        Citizenes Mai1 = new Citizenes(12, "a6", "mai", "123");
//fiilling constractors  
        Citizenes Mai2 = new Citizenes(18, "a6", "kholoud", "2222222");

        Citizenes Mai3 = new Citizenes(12, "a6", "gamal", "33333333");

        Citizenes Mai4 = new Citizenes(12, "a6", "bebo ", "2051711934");

        Citizenes Mai5 = new Citizenes(20, "a6", "manar", "555555");

        Citizenes Mai6 = new Citizenes(55, "a6", "naglaa", "2051711078");

        Citizenes Mai7 = new Citizenes(19, "a6", "doaa", "33");
//Add 1, 2 and 3 doses to different citizens and keep some citizens unvaccinated
        DosesPerson ChAdOx1 = new DosesPerson("ChAdOx ", "Elsafwaa BaneiSweef", h1, "20/2/2022");

        DosesPerson ChAdOx2 = new DosesPerson("BVT162B2 ", "shopra", h2, "20/2/2022");

        DosesPerson ChAdOx3 = new DosesPerson("Mayo Clinic ", " matareya hospital", h3, "22/2/2020");
//Add functionsOfData to file to check
        functionsOfData.Addtion(Mai1);    //add object to function

        functionsOfData.AddTo(Mai1, ChAdOx1);   //add object to function and kind of vaccine

        functionsOfData.AddTo(Mai1, ChAdOx2);

        functionsOfData.Addtion(Mai2);            //add data

        functionsOfData.AddTo(Mai2, ChAdOx3);   //add kind vcciene

        functionsOfData.Addtion(Mai3);

        functionsOfData.AddTo(Mai3, ChAdOx1);

        functionsOfData.AddTo(Mai3, ChAdOx2);

        functionsOfData.Addtion(Mai4);

        functionsOfData.Addtion(Mai4);

        functionsOfData.AddTo(Mai4, ChAdOx2);

        functionsOfData.Addtion(Mai5);

        functionsOfData.Addtion(Mai6);//don't add to doses

        functionsOfData.Addtion(Mai7);

        functionsOfData.AddTo(Mai7, ChAdOx2);

        functionsOfData.AddTo(Mai7, ChAdOx3);
        
        functionsOfData.SaveOfData();
        System.out.println("if you need to add more citizens enter true or false to finish");
        boolean qustion = input.nextBoolean();  //enter true or false to add
        if (qustion == true) {
            int age = 0;
            String address = null, name = null, ID = null;
            System.out.println("enter number of citizens");
            int num = input.nextInt();
            
            for (int i = 0; i < num; i++) {
                System.out.println("enter age , address,name and ID");  //add some citizenes
                age = input.nextInt();
                address = input.next();
                name = input.next();
                ID = input.next();
                Citizenes Mai = new Citizenes(age, address, name, ID);

                functionsOfData.Addtion(Mai);

                functionsOfData.AddTo(Mai, ChAdOx1);

                functionsOfData.AddTo(Mai, ChAdOx3);
                functionsOfData.SaveOfData();

            }
        } else {
            System.out.println("thank you");
        }
    }
}// End of class
