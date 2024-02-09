package DesignPattern.Factory.PracticalFactory.Factory;

public class NOSQLFactory implements  Factory{

    @Override
    public void CreateQuery() {
        System.out.println("No SQL create query");

    }

    @Override
    public void createUpdate() {
        System.out.println("No SQL update query");
    }

    @Override
    public void transaction() {
        System.out.println("No SQL transaction");

    }
}
