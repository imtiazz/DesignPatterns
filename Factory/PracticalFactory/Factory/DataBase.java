package DesignPattern.Factory.PracticalFactory.Factory;

public class DataBase {
    private TypeOfQuerry typeOfQuerry;
    public  DataBase(TypeOfQuerry typeOfQuerry){
        this.typeOfQuerry=typeOfQuerry;
    }
    public void displayDatabaseType(){
        System.out.println("This is "+typeOfQuerry+" type of database");
    }
    public Factory createfactory(){
        return SQLfactoryfactory.createFactory(typeOfQuerry);
    }
}
