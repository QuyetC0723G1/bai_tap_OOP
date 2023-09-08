public class Rectangle {
    public int height;
    public  int width;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void acreage(){
        System.out.println("Acreage of Rectangle is : " + (this.height*this.width));
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle is : " +(this.height+this.width)*2);
    }
}
class Main2{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,6);
        System.out.println("The rectangle has height : " + rec1.height + " and width: " + rec1.width);
        rec1.acreage();
        rec1.perimeter();
    }

}
