//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//    Write a method named hasTeen with 3 parameters of type int.
//
//    The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//
//    * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//
//    * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
//
//
//    Write another method named isTeen with 1 parameter of type int.
//
//    The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    * isTeen(9);  should return false since 9 is in not range 13 - 19
//
//    * isTeen(13);  should return true since 13 is in range 13 - 19
//
//    NOTE: All methods need to be defined as public static like we have been doing so far in the course.
//    NOTE: Do not add a  main method to solution code.

public class TeenNumberChecker {

    public static void main(String[] args) {

        if (hasTeen(12, 14, 11) == true) {
            System.out.println("A teen is present within the group");
        } else {
            System.out.println("There is no teen within the group");
        }

        if (isTeen(12) == true) {
            System.out.println("It is a teen");
        } else {
            System.out.println("It is not a teen");
        }
    }

    public static boolean hasTeen(int firstPerson, int secondPerson, int thirdPerson) {

        if ((firstPerson >= 13 && firstPerson <= 19) || (secondPerson >= 13 && secondPerson <= 19) || (thirdPerson >= 13 && thirdPerson <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int person) {

        if (person >= 13 && person <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
