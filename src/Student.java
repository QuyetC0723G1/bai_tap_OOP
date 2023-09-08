import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double[] score;
    public Student(String name, int age, double[] score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    Scanner input = new Scanner(System.in);
    public void showProfile (){
        System.out.println("Student name is : " + this.name + "\nAge : " + this.age + "\nand Score : " + Arrays.toString(this.score));
    }
    public double getMediumScore(){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < this.score.length; i++) {
            sum += score[i];
            count++;
        }
        System.out.println("Medium Score of " + this.name + " is : " + sum/count);
        return sum/count;
    }
    public String setName(){
        this.name = input.nextLine();
        return this.name;
    }
    public int setAge(){
        this.age = input.nextInt();
        return this.age;
    }


    public double[] setScore(){
        double[] newScore = new double[this.score.length];
        for (int i = 0; i < this.score.length; i++) {
            System.out.println("Score " +(i+1) + " Is :");
            newScore[i] = input.nextDouble();
        }
        this.score = newScore;
        return this.score;
    }
    public void editProfile(){
        System.out.println("Enter the new name : ");
        setName();
        System.out.println("Enter the new age : ");
        setAge();
        System.out.println("Enter the new Score : ");
        setScore();
        System.out.println("New name is : "+ this.name +"\nAge :" +this.age+ "\nScore : " + Arrays.toString(this.score) );
    }
}
class Main3{
    public static void main(String[] args) {
        Student student1 = new Student("Quyet",31, new double[]{7.5,8.25,9} );
//        student1.showProfile();
        student1.editProfile();
        double hs1 = student1.getMediumScore();

        Student student2 = new Student("Quyet",31, new double[]{7.5,8.25,9} );
//        student2.showProfile();
        double hs2 = student2.getMediumScore();
        if (hs1>hs2){
            System.out.println("Student " + student1.name + " Có điểm trung bình cao hơn");
        }else if(hs1<hs2){
            System.out.println("Student " + student2.name + " Có điểm trung bình cao hơn");
        }
        else {
            System.out.println("2 hoc sinh co diem trung binh bang nhau");
        }
    }
}