package Encapsulation_pack;

public class Main {
    public static void main(String[] args) {


// Here we create the object of Encapsulation Class
        Encapsulation obj = new Encapsulation();
        // We have use getter method in it
        System.out.println("My Name is "+ obj.getname()+" "+ "And my Roll Number is"+ obj.getRoll_no());
        //
        obj.setName_setRollno("Zoro",69);
        System.out.println("My Name is "+ obj.getname()+" "+ "And my Roll Number is"+ obj.getRoll_no());

    }
}