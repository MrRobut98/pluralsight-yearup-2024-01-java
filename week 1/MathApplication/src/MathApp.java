public class MathApp {
    public static void main (String[] args) {

        //Question 1 : create 2 vars for bob and gary salary, create new var for highest salary,
        // greatest salary print "the highest is"

        int bobSalary = 10000;
        int garySalary = 20000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
        System.out.println("------------------------");

        //Question 2 : find + display smallest value

        int carPrice = 30000;
        int truckPrice = 80000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);
        System.out.println("------------------------");

        //Question 3

        double radius = 7.25;
        double CircleArea = Math.PI*Math.pow(radius, 2);
        System.out.println("The area of the circle is " + CircleArea);

        //Question 4 : Find the square root of a variable after it is set to 5.0

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

    }
}