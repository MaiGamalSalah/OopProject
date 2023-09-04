package main;
abstract class people  {  //abstract clasa
    protected String My_Name;    //defines the attributes inherite
    protected String Id;

    public people() {
    }
    
//abstract constractor
    public people(String My_Name, String Id) {
        this.My_Name = My_Name;
        this.Id = Id;
    }
    abstract String getMy_Name();   //override method abstract

    abstract void setMy_Name(String My_Name);

    abstract String getId();

    abstract void setId(String Id);
    @Override
    public abstract String toString(); //override method toString abstract
}// End of class