package prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
        Student july22Prototype=new Student();
        july22Prototype.setAverageBatchPsp(90.0);
        july22Prototype.setBatch("July 22");
        registry.register("July 22",july22Prototype );

        IntelligentStudent july22IntPrototype=new IntelligentStudent();
        july22IntPrototype.setAverageBatchPsp(98.0);
        july22IntPrototype.setBatch("July 22Int");
        registry.register("July 22Int", july22IntPrototype);


    }
    public static void main(String[] args){
        StudentRegistry registry=new StudentRegistry();
        fillRegistry(registry);

        Student utsav=registry.get("July 22").clone();
        utsav.setName("UTSAV");
        utsav.setAge(25);
        utsav.setPsp(89.0);

        Student prakash= registry.get("July 22Int").clone();
        prakash.setName("PRAKASH");
        prakash.setAge(26);
        prakash.setPsp(99.0);
    }
}
