import java.util.*;



class SolutionInheritance {
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    static class Student extends Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here
        public Student(String firstName, String lastName, Integer id, int[] scores){
            super(firstName, lastName, id);
            this.testScores = scores;
        }


        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        public String calculate(){
            int sum = 0;
            for(int i = 0; i < testScores.length; i++){
                sum += testScores[i];
            }

            double r = sum * 1.0 / testScores.length;

            switch(range(r))
            {
                case 1:
                    return "O";
                case 2:
                    return "E";
                case 3:
                    return "A";
                case 4:
                    return "P";
                case 5:
                    return "D";
                case 6:
                    return "T";
                default:
                    return "";
            }
        }
        private static int range(double num){
            if ( 90 <= num && num <= 100)
                return 1;
            if ( 80 <= num && num < 90)
                return 2;
            if ( 70 <= num && num < 80)
                return 3;
            if ( 55 <= num && num < 70)
                return 4;
            if ( 40 <= num && num < 55)
                return 5;
            if ( num < 40)
                return 6;
            return 0;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
