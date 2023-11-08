public class Person {
    String fullName;
    int age;
    public Person(){

    }
    public Person(String fullName,  int age){
        this.fullName = fullName;
        this.age = age;
    }

    public static void move(String fullName){
        System.out.println("Говорить move() " + fullName);
    }
    public static void talk(String fullName){
        System.out.println("Говорить talk() " + fullName);
    }
}
