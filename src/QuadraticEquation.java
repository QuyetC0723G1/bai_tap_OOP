import java.util.Scanner;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Scanner input = new Scanner(System.in);
    public void getA(){
        this.a = input.nextDouble();
    }
    public void getB(){
        this.b = input.nextDouble();
    }
    public void getC(){
        this.c = input.nextDouble();
    }
    public double getDiscriminant(){
        return this.b* this.b - 4 * this.a * this.c;
    }
    public void showABC(){
        System.out.println("Enter number 1 : ");
        getA();
        System.out.println("Enter number 2 : ");
        getB();
        System.out.println("Enter number 3 : ");
        getC();
    }
    public void getRoot1(){
        if (getDiscriminant()>0){
            double root1 = (-b + Math.pow(getDiscriminant(),0.5))/(2*a);
            double root2 = (-b - Math.pow(getDiscriminant(),0.5))/(2*a);
            System.out.println("The equation has two roots : " + root1 + "and " + root2);
        }else if (getDiscriminant()<0){
            System.out.println("The equation has no real root");
        }
        else {
            double root1 = -this.b / (2*this.a);
            System.out.println("The equation has one roots : " + root1);
        }
    }
}
class Main4{
    public static void main(String[] args) {
        QuadraticEquation abc = new QuadraticEquation(1,2,3);
        abc.showABC();
        System.out.println();
        abc.getRoot1();

    }
}
