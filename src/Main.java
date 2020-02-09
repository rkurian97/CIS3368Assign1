public class Main {

    public static void main(String[] args)
    {
        Employee myEmployee = new Employee();
        myEmployee.name = "Robert";
        myEmployee.birthYear = 1955;

        System.out.println("The emploee's birth year is: " + myEmployee.birthYear);
        changeEmployee(myEmployee);
        System.out.println("The emploee's birth year is: " + myEmployee.birthYear);

        int myNumber = 10;
        System.out.println("The number is: " + myNumber);
        changeNumber(myNumber);
        System.out.println("The number is: " + myNumber);

        String myString = "Hello";
        System.out.println("The string says: " + myString);
        changeString(myString);
        System.out.println("The string says: " + myString);

    }

    public static void changeEmployee(Employee emp)
    {
        Employee emp2 = new Employee();
        emp2.name = "Jack";
        emp.birthYear = 2001;
    }
    public static void changeNumber(int x)
    {
        x += 10;
    }

    public static void changeString(String str)
    {
        str += " World";
    }


}