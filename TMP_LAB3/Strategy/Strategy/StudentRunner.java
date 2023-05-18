package Strategy;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setActivity(new Sleeping());
        student.executeActivity();

        student.setActivity(new Studying_at_RTUMIREA());
        student.executeActivity();

        student.setActivity(new Doing_Prak());
        student.executeActivity();
        
        student.setActivity(new Skate());
        student.executeActivity();

        student.setActivity(new Party());
        student.executeActivity();

        student.setActivity(new Sleeping());
        student.executeActivity();
    }
}
