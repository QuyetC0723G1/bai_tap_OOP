public class Car {
    public String name;
    public double weight;
    public String color;
    public int sobanh;
    public Car(String name, double height, String color , int sobanh){
        this.name = name;
        this.weight = height;
        this.color = color;
        this.sobanh = sobanh;
    }
    public void run(){
       System.out.println("The Car : "+ this.name + " Color "+this.color + " Start Run");
    }
}

class Main1{
    public static void main(String[] args) {
        Car Honda = new Car("Audi" , 500, "red", 4);
        Honda.run();
        Car Huyndai = new Car("HuyndaiG1",600,"blue",4);
        Huyndai.run();
        Car Ferrari = new Car("FrH11",350,"white",4);
        Ferrari.run();
    }
}