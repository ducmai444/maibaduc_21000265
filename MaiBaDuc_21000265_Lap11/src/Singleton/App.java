package Singleton;

public class App {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("Select * from class_infor");

        Database database1 = Database.getInstance();
        database.query("Select * from std_scores");

        System.out.println(database == database1);
    }
}
