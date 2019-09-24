package student;

public class Student {
    private int rollNo;
    private String name;
    private double cpi;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
    @Override
    public String toString(){
        return "Student [\nName =\t" + name +"\nRollNo =\t" +
                rollNo + "CPI =\t" + cpi + "\n]";

    }
}
