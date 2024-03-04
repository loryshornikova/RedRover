package employees;
import months.Month;
public class Manager extends Employee {
    private int numberOfEmployees;

   public void setNumberOfEmployees (int numberOfEmployees) {
       this.numberOfEmployees = numberOfEmployees;
   }
    public int getNumberOfEmployees() {
       return numberOfEmployees;
    }
     public Manager (String fullName, double salaryPerDay, int numberOfEmployees) {
       this.setFullName(fullName);
       this.setSalaryPerDay(salaryPerDay);
       this.numberOfEmployees = numberOfEmployees;
     }

    public double getSalary(Month[] monthArray) {
       double salaryPerDay = getSalaryPerDay();
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getNumberOfWorkingDays() * salaryPerDay; //+ 0.01 * getNumberOfEmployees();
        }
        return salary * (1 + numberOfEmployees * 0.01);
    }
}
