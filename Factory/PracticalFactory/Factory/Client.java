package DesignPattern.Factory.PracticalFactory.Factory;

public class Client {
    public static void main(String[] args){
        DataBase db=new DataBase(TypeOfQuerry.NOSQL);
        Factory ft= db.createfactory();
        ft.CreateQuery();
        ft.transaction();
        ft.createUpdate();

    }
}
