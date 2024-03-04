
import school.redrover.ht10.Director;
import school.redrover.ht10.Employee;
import school.redrover.ht10.Manager;
import school.redrover.ht10.Worker;


import static school.redrover.ht10.Utils.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(findEmployee(allWorkers, "olga"));

        System.out.println(findEmployeeByPartName(allWorkers, "VAS"));

        System.out.println(countSalaryReserve(allWorkers));

        System.out.println(findSmallestSalary(allWorkers));

        System.out.println(findBiggestSalary(allWorkers));

        System.out.println(findSmallestNumberOfSubordinates(allManagers));

        System.out.println(findBiggestNumberOfSubordinates(allManagers));

        System.out.println(findMaxBonus(allManagers));

        System.out.println(findMinBonus(allManagers));

        Manager mng = new Manager("Sergey", 5);
       double mng_salary = mng.getSalary();
        System.out.println(mng_salary);
        System.out.println(mng.getRate());
        System.out.println(mng.getBaseSalary());

        Director dr = new Director("Anton", 5);
        System.out.println(dr.getSalary());
        System.out.println(dr.getRate());



    }
}