public class Person {// tên theo kiểu Pascal Case
    public String name; // các thuộc tính thì luôn có giá trị mặc định tuỳ theo kiểu dữ liệu
    public int age; // 0
    public boolean IsHandSome;

    public Person(String name , int age , boolean IsHandSome){ // hàm contructor phải trùng tên với Class.
        this.name = name;
        this.age = age;
        this.IsHandSome = IsHandSome;
    }

    //Nếu không khai báo contructor thì nó sẽ tự động có 1 contructor không tham số.
    //Có thể tạo được nhiều hàm tạo( contructor ) trong 1 lớp và các hàm tạo phải trùng tên với Class.
    // This sẽ đại diện cho đối tượng đang sử dụng nó

    public  Person(String name , int age){
        this.name = name;
        this.age = age;
        this.IsHandSome = true;

    }


    //Tạo phương thức

    public void go(){
        System.out.println(this.name + "Running");
    }
}
 class Main{
     public static void main(String[] args) {
         Person p = new Person("Quyet",31,true);
         p.go();
     }
 }
