class Employee{
    String name;
    int yoj;
    int salary;
    String address;
}
public class Information {
    public static void main(String[] args){
        Employee a = new Employee();
        a.name = "Robert";
        a.yoj = 1994;
        a.address = "64C- WallsStreet";
        Employee b = new Employee();
        b.name = "Sam";
        b.yoj = 2000;
        b.address = "64D- WallsStreet";
        Employee c = new Employee();
        c.name = "John";
        c.yoj = 1999;
        c.address = "26B- WallsStreet";
        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
        System.out.println(a.name + "\t" + a.yoj + "\t" + a.address);
        System.out.println(b.name + "\t" + b.yoj + "\t" + b.address);
        System.out.println(c.name + "\t" + c.yoj + "\t" + c.address);
    }
}
