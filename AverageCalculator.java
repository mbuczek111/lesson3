public class AverageCalculator {
    public static void main(String[] args) {
        double dividend =0;

        int divisor=args.length;
        for(int i=0;i<args.length;i++)
        {
            dividend+= Double.parseDouble(args[i]);
        }
        System.out.println(dividend/divisor);
    }
}
