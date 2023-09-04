package main;
import java.util.Date;
public class DosesPerson {
//defines the attributes
    private String Kind;
    private String Where;
    private Health health;
    private String When;
 //Zero-argument constructor(default constructor)
    public DosesPerson() {

    }
//4-argument constructor(default constructor)
    public DosesPerson(String Kind, String Where, Health health, String When) {
        this.Kind = Kind;
        this.Where = Where;
        this.health = health;
        this.When = When;
    }
    
//create method getter (kind) 
    public String getKind() {
        return Kind;
    }
//create method setter (kind) 
    public void setKind(String Kind) {
        this.Kind = Kind;
    }
//create method getter (where person taken) 
    public String getWhere() {
        return Where;
    }
//create method setter (where person taken) 
    public void setWhere(String Where) {
        this.Where = Where;
    }
//create method getter (where person taken) 
    public Health getHealth() {
        return health;
    }
//create method setter (health) 
    public void setHealth(Health health) {
        this.health = health;
    }
//create method getter (when person taken) 
    public String getWhen() {
        return When;
    }
//create method setter (when person taken) 
    public void setWhen(String When) {
        this.When = When;
    }
////Override the toString method defined
    @Override
    public String toString() {
        return "DosesPerson{" + "Kind= " + Kind + ", Where= " + Where +  ", When= " + When + ",\n health: " + health +"}\n";
    }
}// End of class

