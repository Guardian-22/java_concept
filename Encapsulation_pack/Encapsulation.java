package Encapsulation_pack;

public class Encapsulation {
// this data are hidden so to access this data we make to make getter and setter .
    private int roll_no=99;
    private String Name="Goku";
    // Getter method
    public String  getname(){
        // this fuction or method help us to retrive the name
        return Name ;
    }

    public int getRoll_no(){
        // this fuction or method  help us to retrive the roll number
        return roll_no;
    }
    // Setter
    public void  setName_setRollno(String Name , int roll_no ){
        this.Name=Name ;
        this.roll_no=roll_no;
    }
}
