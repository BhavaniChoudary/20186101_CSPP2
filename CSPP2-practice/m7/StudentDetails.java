/**
 * Class for student details.
 */
class StudentDetails {
    private String student;
    private String rollNo;
    private double subjone;
    private double subjtwo;
    private double subjthree;
    public StudentDetails(String student, String rollNo, double subjone, double subjtwo , double subjthree ) {
        this.student = student;
        this.rollNo = rollNo;
        this.subjone = subjone;
        this.subjtwo = subjtwo;
        this.subjthree = subjthree;
    }
    /**
     * Calculates output and returns the value.
     *
     * @return     description_of_the_return_value.
     */
    public double GPA() {
        return (subjone + subjtwo + subjthree) / 3;
    }
    /**
     * Main function.
     */
    public static void main(String args[]) {
        StudentDetails s1 = new StudentDetails("Tony mahfud", "1231", 7.5, 7.0, 8.0);
        System.out.println(s1.GPA());
        StudentDetails s2 = new StudentDetails("Bidhya", "1235", 8.5, 6.0, 7.5);
        System.out.println(s2.GPA());
        StudentDetails s3 = new StudentDetails("Kelzang", "1234", 7.5, 8.0, 9.0);
        System.out.println(s3.GPA());
    }
}

