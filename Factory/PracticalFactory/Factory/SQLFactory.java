package DesignPattern.Factory.PracticalFactory.Factory;

public class SQLFactory implements  Factory{

    @Override
    public void CreateQuery() {
        System.out.println("SQL create query");

    }

    @Override
    public void createUpdate() {
        System.out.println("SQL update query");

    }

    @Override
    public void transaction() {
        System.out.println("SQL transaction");

    }
}
