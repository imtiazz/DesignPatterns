package DesignPattern.Factory.PracticalFactory.Factory;

public class SQLfactoryfactory {

    public static Factory createFactory(TypeOfQuerry typeOfQuerry){
        return switch(typeOfQuerry){
            case SQL -> new SQLFactory();
            case NOSQL -> new NOSQLFactory();
        };
    }

}
