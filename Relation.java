public class Relation {
    public static void main(String[] args) {

        int mark = 85;

        System.out.println("Mark: " + mark);

        System.out.println("Passed: " + (mark >= 50));
        System.out.println("Excellent: " + (mark >= 80));
        System.out.println("Perfect Score: " + (mark == 100));
        System.out.println("Failed: " + (mark < 50));
        System.out.println("Not Full Mark: " + (mark != 100));
    }
}
