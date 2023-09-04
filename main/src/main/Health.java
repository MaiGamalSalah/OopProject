package main;
import java.util.ArrayList;
public class  Health extends people { // methods and fields  
//that's class abstract from people
    private int Professionis;

    public Health() {
    }
    
//this constractor override from citizens
    public Health(String My_Name, String Id) {
        super(My_Name, Id);
    }
//this constractor override from citizens
    public Health(int Professionis, String My_Name, String Id) {
        super(My_Name, Id);
        //some statmants
        this.Professionis = Professionis;
    }
    
// Other methods are omitted

    public int getProfessionis() {
        return Professionis;
    }
//one-argument constructor(default constructor)
    public void setProfessionis(int Professionis) {
        this.Professionis = Professionis;
    }

//this methods override abstracts  from citizens

    @Override
    String getMy_Name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setMy_Name(String My_Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setId(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//Override abstract the toString method defined
    @Override
    public String toString() {
        return "Health{" + "Professionis= " + Professionis + " name= "+My_Name+" ID= "+Id+'}';
    }

 
}// End of class
