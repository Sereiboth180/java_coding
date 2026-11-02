public class logical {
    public static void main(String[] args) {

        int mark = 85;
        boolean hasAssignment = true;

        // AND
        System.out.println(mark >= 50 && hasAssignment);

        // OR
        System.out.println(mark >= 90 || hasAssignment);

        // NOT
        System.out.println(!hasAssignment);
    }
}