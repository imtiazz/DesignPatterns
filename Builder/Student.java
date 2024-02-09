package DesignPattern.Builder;

import DesignPattern.CustomException.InvalidRollNoException;
import DesignPattern.CustomException.InvalidYOException;

import java.util.Locale;

public class Student {
    private int id;
    private String name;
    private int roll_no;
    private int yoe;
    private  Student(Builder b){
        this.id=b.id;
        this.name=b.name;
        this.roll_no=b.roll_no;
        this.yoe=b.yoe;

    }
    public static Builder builder(){
        Builder b=new Builder();
        return b;
    }
    static   class Builder{
        int id;
        String name;
        int roll_no;
        int yoe;
        public Builder setId(int id){
            this.id=id;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setRoll_no(int roll_no){
            this.roll_no=roll_no;
            return this;
        }
        public  Builder setYoe(int yoe){
            this.yoe=yoe;
            return this;
        }
        public Student build() throws InvalidRollNoException, InvalidYOException {
            if (yoe<2){
                throw new InvalidYOException("Invalid Years of Experience");
            }
            if (roll_no>1000){
                throw new InvalidRollNoException("Invalid Roll no");
            }
            Student s=new Student(this);
            return s;
        }

    }
}
