package ex1.ex1_2;

public class TestPerson {
    public static void main(String[] args){
        Person person = new Person("Nam", "HCM City");
        System.out.println(person);
        person.setAddress("HN City");
        System.out.println(person);

        Student student = new Student("Long", "HP City", "Java", 2022, 4000);
        System.out.println(student);
        student.setFee(3000);
        student.setProgram("Python");
        System.out.println(student);

        Staff staff = new Staff("Hue", "HP City", "Thang Long school",  4000);
        System.out.println(staff);
        System.out.println(staff.getSchool());;
        staff.setAddress("HN City");
        System.out.println(staff);
    }
}