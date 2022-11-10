import java.util.Random;

public class Student {
    private String name;
    private  int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void guessingAge(){
        Random rand =new Random();
        int randAge= rand.nextInt(35);
        if (randAge<this.age){
            System.out.println("il numero generato è più piccolo dell'età");
        } else if (randAge>this.age){
            System.out.println(" il numero generato è più grande dell'età");
        } else {
            System.out.println("il numero generato è uguale all'età");
        }
    }




}
