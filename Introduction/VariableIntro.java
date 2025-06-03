package Introduction;

public class VariableIntro {

    public static void main(String[] args) {

        /*
         * To Create a variable:
         * datatype name = value;
         */
        double salary = 10000.56;
        int bonus = 250;

        /*
         * Casting a variable means changing its datatype
         * to change a primitive data type, put the new type in ()
         * Example below.
         */

        bonus = (int) salary;

        System.out.println(salary);
        System.out.println(bonus);
    }


}
