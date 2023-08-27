package WORK;

//ArithmeticException

public class TryCatch {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());
        } catch (Exception e) {
            System.out.println("exception");
        } catch (ArithmeticException e) {
            System.out.println("operation divide by zero not supported");
        } catch (NullPointerException e){
            System.out.println("nullpointer exception");
        }
        System.out.println(number);
    }
}
