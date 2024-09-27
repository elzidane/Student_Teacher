public class partTime extends teacher{
    private int hoursworked;

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public partTime(String name, int age, String subject, int hoursworked1){
        super();
        hoursworked = 0;
    }

    public partTime(String name, int age, String subject, int anualsalary, String unit){
        super(name, age, subject);
        // this.subject = subject;
    }
    
    private double calculatesalary(){
        return hoursworked * 4 * 20000;
    }

    @Override

    public void print(){
        System.out.println("Hours worked: " + hoursworked + "hours/week");
    }
}
