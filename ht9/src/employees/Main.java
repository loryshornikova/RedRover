package employees;
import months.Month;
import months.MonthUtils;
import org.w3c.dom.ls.LSOutput;


public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setSalaryPerDay(100.0);


        double salaryFebruary = emp1.getSalary(MonthUtils.SUMMER);
        System.out.println(salaryFebruary);


        Manager manager = new Manager("John Huston", 100.0, 5);
        double managerSalary = manager.getSalary(MonthUtils.SUMMER);
        System.out.println(managerSalary);
        System.out.println(manager.getSalary(new Month[] {MonthUtils.m1, MonthUtils.m2, MonthUtils.m3}));

    }
}