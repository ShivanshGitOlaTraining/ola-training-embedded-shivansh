public class Demo {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 101;
        obj.name = "Alex";
        obj.show();
    }
}
class Student {
    int id;
    String name;
    int age;

    public void setAge(int value)
    {
        this.id=value;
    }

    public void show() {
        System.out.println(this.id + ":" + this.name);
    }
}

