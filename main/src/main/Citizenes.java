package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Citizenes extends people {

//that's class abstract from people
//defines the attributes
    private int age;//by defualt null
    private String adress;
    private ArrayList<DosesPerson> doses;//Invoking methods

    public Citizenes() {
    }

//abstract two arrgument constractor    
    public Citizenes(String My_Name, String Id) {
        super(My_Name, Id);
    }
//abstract over ride  constractor    

    public Citizenes(int age, String adress, String My_Name, String Id) {
        super(My_Name, Id);
        this.age = age;
        this.adress = adress;
        this.doses = doses;
        this.doses = new ArrayList<DosesPerson>();
    }
//abstracts over ride methods

    public String getMy_Name() {
        return My_Name;
    }

    public void setMy_Name(String My_Name) {
        this.My_Name = My_Name;
    }
//methods getter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//methods setter

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<DosesPerson> getDoses() {
        return doses;
    }
//Invoking methods

    public void setDoses(ArrayList<DosesPerson> doses) {
        this.doses = doses;
    }
//abstract override

    public String getId() {
        return Id;
    }
//abstract override

    public void setId(String Id) {
        this.Id = Id;
    }
//methode add doses

    void setDose(DosesPerson d) {
        this.doses.add(d);
    }
//Override the toString method defined

    public String infro() {
        return "My_Name=" + My_Name + ", age=" + age + ", adress=" + adress + ", Id=" + Id;
    }
//Override the toString method defined

    @Override
    public String toString() {
        return "\nCitizenes{" + "My_Name= " + My_Name + ", age= " + age + ", adress= " + adress + ", Id= " + Id + ", doses= " + doses + "}\n";
    }
//method check add

    @Override
    public boolean equals(Object Mai) {
        Citizenes Citizen = (Citizenes) Mai;
        if (this.getId() == Citizen.getId()) {
            return true;
        } else {
            return false;
        }
    }
//method commerTo
    public static Comparator<Citizenes> ByID = new Comparator<Citizenes>() {
        @Override
        public int compare(Citizenes M1, Citizenes M2) {
            String obj1 = M1.getId();
            String obj2 = M2.getId();
            return obj1.compareToIgnoreCase(obj2);
        }
    };

}// End of class
