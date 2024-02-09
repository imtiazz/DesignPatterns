package DesignPattern.PrototypeRegistry.DeepCopy;

public class Student implements Prototype<Student>{
    private int roll_no;
    private String name;

    private String batch_name;
    private int batch_psp;
    private int batch_YOE;
    public Student(){
    }
    public Student(Student s){
        this.batch_name=s.batch_name;
        this.batch_psp=s.batch_psp;
        this.batch_YOE=s.batch_YOE;

    }
    @Override
    public Student clone() {
        return new Student(this);

    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public int getBatch_psp() {
        return batch_psp;
    }

    public int getBatch_YOE() {
        return batch_YOE;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public void setBatch_psp(int batch_psp) {
        this.batch_psp = batch_psp;
    }

    public void setBatch_YOE(int batch_YOE) {
        this.batch_YOE = batch_YOE;
    }
}

