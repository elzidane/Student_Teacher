public class student extends person{
    private int studentNumber;
    private int score;
    private String major;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public student (String name, int age, int studentNumber1, int score1, int major1){ 
        super(); //mengakses constructor
        studentNumber = 0;
        score = 0;
        major = "";
       }
    
       public student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    @Override
    
    public void print(){
        super.print();
        System.out.println("Student number: " + studentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
        System.out.println("");
        System.out.println("================================");
        System.out.println("");
    }
}
