package Student;

public class Student {
    String name = "Om";
    String phone = "9863576413";
    String address ="Satdobato";
    public static void main(String[] args){
        Student studentObject = new Student();
        System.out.println("First Output:");
        System.out.println(studentObject.name+studentObject.phone+studentObject.address+"\n");
        System.out.println("Second Output:");
        System.out.println(studentObject.name+"\n"+studentObject.phone+"\n"+studentObject.address+"\n");
        System.out.println("Third Output:");
        System.out.println(studentObject.name+" "+studentObject.phone+" "+studentObject.address+"\n");

    }

}

