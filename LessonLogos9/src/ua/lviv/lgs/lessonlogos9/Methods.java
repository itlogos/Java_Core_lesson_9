package ua.lviv.lgs.lessonlogos9;


public class Methods {
    private double a;
    private double b;

    
    public Methods(double a, double b) throws MyException, IllegalAccessException {
        this.a = a;
        this.b = b;
        if ((a < 0) && (b < 0)) {
            throw new IllegalArgumentException("arguments of methods() are: a = " + a + " and b = " + b);
        } else if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))){
            throw new ArithmeticException("arguments of methods() are (a = 0 and b != 0) or (a != 0 and b = 0)");
        } else if ((a == 0) && (b == 0)) {
        throw new IllegalAccessException("arguments of methods() are = 0");
    } else if ((a > 0) && (b > 0)) {
        String message = "Invalid value, a > 0 and b > 0";
        throw new MyException(message);
}
    } 
 
    public double plus() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double multiply(){
        return a * b;
    }

    public double devide() {
        return a / b;
    }

}
