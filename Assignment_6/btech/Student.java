package btech;

public class Student {
    int rollNo;
    String name;
    int sub1, sub2, sub3;

    public Student(int rollNo, String name, int sub1, int sub2, int sub3) {
        this.rollNo = rollNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public void display() {
        System.out.println("\nRoll_no = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("-----------MARKS-----------");
        System.out.println("Sub 1      : " + sub1);
        System.out.println("Sub 2      : " + sub2);
        System.out.println("Sub 3      : " + sub3);
    }

    public int getTotal() {
        return sub1 + sub2 + sub3;
    }

    public double getPercentage() {
        return (getTotal() / 300.0) * 100;
    }
}
