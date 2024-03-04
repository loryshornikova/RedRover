package employees;
import months.Month;


public final class Employee extends BaseEmployee{

        public  double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary +=  monthArray[i].getNumberOfWorkingDays() * getSalaryPerDay();

        }

        return salary;
    }


}
