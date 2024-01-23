public class Math {
    public void addition(int x, int y){
        System.out.println("Addition: " + (x+y));
    }

    public void subtraction(int x, int y){
        System.out.println("Subtraction: " + (x-y));
    }

    public void multiplication(int x, int y){
        System.out.println("Multiplication: " + (x*y));
    }

    public void division(int x, int y){
        float answer = (float)x/y;
        System.out.println("Division: " + answer);
    }
}
