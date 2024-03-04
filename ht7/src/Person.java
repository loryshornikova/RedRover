public class Person {
    String name;
    int age;
    String sex;
     String getName() {
         String prefix = "";
        if (sex.toLowerCase().equals("male")) {
        prefix = "Mr. ";
        }
            else if (sex.toLowerCase().equals("female")){
                prefix = "Mrs. ";
            }
            return prefix + name;
        }
     }

