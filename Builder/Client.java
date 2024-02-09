package DesignPattern.Builder;

import DesignPattern.CustomException.InvalidRollNoException;
import DesignPattern.CustomException.InvalidYOException;

public class Client {
    public static void main(String[] args) {
        try {
            Student s = Student.builder()
                    .setId(1)
                    .setName("Imtiaz")
                    .setYoe(1)
                    .setRoll_no(10)
                    .build();
        }
        catch (InvalidYOException | InvalidRollNoException ex){
            System.out.print(ex.getMessage());

        }

    }
}
