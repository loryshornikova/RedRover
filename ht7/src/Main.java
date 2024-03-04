public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.name = "Anna Smith";
        pers1.age = 35;
        pers1.sex = "female";
        System.out.println(pers1.getName());

        Employee emp1 = new Employee();
        emp1.name = "Anna Smith";
        emp1.age = 35;
        emp1.sex = "female";
        emp1.salary = 5000;

        Employee emp2 = new Employee();
        emp2.name = "George Khann";
        emp2.age = 55;
        emp2.sex = "male";
        emp2.salary = 3000;

        Employee emp3 = new Employee();
        emp3.name = "Kelly Jordan";
        emp3.age = 20;
        emp3.sex = "female";
        emp3.salary = 31000;

        Employee emp4 = new Employee();
        emp4.name = "Nick Jonson";
        emp4.age = 40;
        emp4.sex = "male";
        emp4.salary = 13000;

        System.out.println(emp2.isSameName(emp3));


        int sum = Salary.getSum(new Employee[]{emp1, emp2, emp3, emp4});
        System.out.println(sum);

    }
}