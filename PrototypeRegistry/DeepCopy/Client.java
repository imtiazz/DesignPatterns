package DesignPattern.PrototypeRegistry.DeepCopy;

public class Client {
    public static void main(String[] args) {
        Registry registry=new Registry();

        Student aprBatch=new Student();
        aprBatch.setBatch_name("Feb 22 Batch");
        aprBatch.setBatch_psp(76);
        aprBatch.setBatch_YOE(2022);
        registry.save(aprBatch);

        Student mayBatch=new Student();
        mayBatch.setBatch_name("May 22 Batch");
        mayBatch.setBatch_psp(76);
        mayBatch.setBatch_YOE(2022);
        registry.save(mayBatch);

        Student mayStudent=registry.get("May 22 Batch").clone();
        Student aprStudent=registry.get("Feb 22 Batch").clone();

        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setIq(150);
        intelligentStudent.setBatch_name("Mar 2022 Batch");
        intelligentStudent.setBatch_psp(86);
        intelligentStudent.setBatch_YOE(2022);
        intelligentStudent.setName("Zoraiz");
        intelligentStudent.setRoll_no(3);

        IntelligentStudent intelligentStudent1=new IntelligentStudent(intelligentStudent).clone();
        intelligentStudent1.setIq(123);
        intelligentStudent1.setName("Rajeev");
        intelligentStudent1.setRoll_no(4);

        //System.out.print(student2.getBatch_name());


        
    }
}
