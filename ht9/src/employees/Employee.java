package employees;
import months.Month;


public class Employee {
    private String fullName;
    private int age;
    private String sex;
    private double salaryPerDay;

    public void setFullName (String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSalaryPerDay (double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public  double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary +=  monthArray[i].getNumberOfWorkingDays() * salaryPerDay;

        }

        return salary;
    }


}
