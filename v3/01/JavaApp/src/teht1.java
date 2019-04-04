public class teht1 {

    public static void main(String args[]) {
        MyOperation toCelsius = fahrenheit -> (fahrenheit - 32) * 5 / 9;
        MyOperation area = radius -> Math.PI * radius * radius;

        System.out.println(toCelsius.operation(100));
        System.out.println(area.operation(10));


    }

    public interface MyOperation {
        public double operation(double x);
    }

}

