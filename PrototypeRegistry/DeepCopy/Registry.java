package DesignPattern.PrototypeRegistry.DeepCopy;

import java.util.HashMap;

public class Registry {
    HashMap<String, Student> registry;

    public Registry(){
        registry=new HashMap<>();
    }
    public void save(Student student){
        registry.put(student.getBatch_name(),student);
    }
    public Student get(String batchName){
        return registry.get(batchName);
    }
}
