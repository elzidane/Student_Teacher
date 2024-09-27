public class fullTime extends teacher{
    private int anualsalary;
    private String unit;

    public int getAnualsalary() {
        return anualsalary;
    }
    public void setAnualsalary(int anualsalary) {
        this.anualsalary = anualsalary;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fullTime(){
        super();
        anualsalary = 0;
        unit = "";
    }

    public fullTime(String name, int age, String subject, int anualsalary, String unit){
        super(name,age,subject);
        this.anualsalary = anualsalary;
        this.unit = unit;
    }

    @Override

    public void print(){
        // super.print();
        System.out.println("Salary: " + anualsalary);
        System.out.println("Unit: " + unit);
    }

}
