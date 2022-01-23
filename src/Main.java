public class Main {

    public static void main(String[] args) {
        //Create a Student
        Student stu1 = new Student("Janelle", "321456987");
        Student stu2 = new Student("Thomas","52145687");
        Student stu3 = new Student("Elisabeth","42145687");

        stu1.enroll("Math151");
        stu1.enroll("Eng255");
        stu1.enroll("His211");

//		stu1.showCourses();
//		stu1.checkBalance();
        stu1.payTuitiom(600);
//		stu1.checkBalance();
        System.out.println(stu1.toString());
    }
}

class Student{
    //Properties( encapsulation private)
    private static int iD = 10;
    private String userID;
    private String name;
    private String ssn;
    private String email;
    private String courses = "";
    private int costOfCourse = 800;
    private int balance = 0;


    public Student(String name, String ssn) {
        iD++;
        this.name = name;
        this.ssn = ssn;
        setUserID();
        setEmail();
    }

    private void setEmail(){
        email = name.toLowerCase() + "." + iD + "@sdeuniversity.com";
        System.out.println("Your email: "+ email);
    }
    private void setUserID() {
        int max = 9000;
        int min = 1000;
        int randNum =(int) (Math.random()  * (max-min));
        randNum = randNum + min;
        System.out.println(randNum);
        userID = iD + "" + randNum + ssn.substring(5);
        System.out.println("Your User ID: " + userID);
    }

    public void enroll(String courses) {
        this.courses = this.courses + "\n" + courses;
        System.out.println(courses);
        balance = balance + costOfCourse;
    }

    public void payTuitiom(int amount) {
        System.out.println("Payment: $" + amount);
        balance = balance - amount;

    }

    public void checkBalance() {
        System.out.println("Balanca: $" + balance);
    }

    public void showCourses() {
        System.out.println(courses);
    }

    public String toString() {
        return "[NAME:" + name + "]\nCOURSES: " + courses + "]\nBALANCE: " + balance + " ]";
    }


}


