package school.redrover.ht10;

public class Utils {
    public static Worker[] allWorkers = {
            new Worker ("Petr"),
            new Worker ("Olga"),
            new Worker("Kathrine"),
            new Worker ("Vasiliy"),
            new Manager("Robert",  50),
            new Worker("Travis"),
            new Director("Richie", 250)
    };
    public static Manager[] allManagers = {
            new Manager("Kirk",  5),
            new Manager("Steve",  500),
            new Manager("Blade",  178)
    };

    //	поиск сотрудника в массиве по его имени
    public static int findEmployee(Worker [] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static int findEmployeeByPartName(Worker [] allWorkers, String partName) {
        for (int i = 0; i < allWorkers.length; i++) {
            if (allWorkers[i].getName().toLowerCase().contains(partName.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    // подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double countSalaryReserve(Worker [] allWorkers) {
        double reserve = 0;
        for (int i = 0; i < allWorkers.length; i++) {
            reserve += allWorkers[i].getSalary();
        }
        return reserve;
    }

    //поиск наименьшей зарплаты в массиве
    public static double findSmallestSalary(Worker [] allWorkers) {
        double smallestSalary = Double.MAX_VALUE;
        for (int i = 0; i < allWorkers.length; i++) {
            if (smallestSalary > allWorkers[i].getSalary()) {
                smallestSalary = allWorkers[i].getSalary();
            }

        }
        return smallestSalary;
    }

    // поиск наибольшей зарплаты в массиве
    public static double findBiggestSalary(Worker[] allWorkers) {
        double biggestSalary = Double.MIN_VALUE;
        for (int i = 0; i < allWorkers.length; i++) {
            if (biggestSalary < allWorkers[i].getSalary()) {
                biggestSalary = allWorkers[i].getSalary();
            }
        }
        return biggestSalary;
    }

    //	поиск наименьшего количества подчиненных в массиве менеджеров
    public static int findSmallestNumberOfSubordinates(Manager[] allManagers) {
        int smallestNumberOfSubordinates = Integer.MAX_VALUE;
        for (int i = 0; i < allManagers.length; i++) {
            if (smallestNumberOfSubordinates > allManagers[i].getNumberOfSubordinates()) {
                smallestNumberOfSubordinates = allManagers[i].getNumberOfSubordinates();
            }
        }
        return smallestNumberOfSubordinates;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int findBiggestNumberOfSubordinates(Manager[] allManagers) {
        int biggestNumberOfSubordinates = Integer.MIN_VALUE;
        for (int i = 0; i < allManagers.length; i++) {
            if (biggestNumberOfSubordinates < allManagers[i].getNumberOfSubordinates()) {
                biggestNumberOfSubordinates = allManagers[i].getNumberOfSubordinates();
            }
        }
        return biggestNumberOfSubordinates;
    }

    public static double findMaxBonus(Manager[] allManagers) {
        double maxBonus = 0;
        for (int i = 0; i < allManagers.length; i++) {
            double bonus = allManagers[i].getSalary() - allManagers[i].getBaseSalary();
            if (bonus > maxBonus) {
                maxBonus = bonus;
            }
        }
        return maxBonus;

    }

    //    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double findMinBonus(Manager[] allManagers) {
        double minBonus = Double.MAX_VALUE;
        for (int i = 0; i < allManagers.length; i++) {
            double bonus = allManagers[i].getSalary() - allManagers[i].getBaseSalary();
            if (minBonus > bonus) {
                minBonus = bonus;
            }

        }
        return minBonus;
    }
}
