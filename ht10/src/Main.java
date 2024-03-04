
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



    }
}