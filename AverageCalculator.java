public class AverageCalculator {
    public static void main(String[] args) {
        double dividend =0;
        double [] myDoubles = new double[args.length];

        int divisor=args.length;
        for(int i=0;i<args.length;i++)
        {
            myDoubles[i] = Double.parseDouble(args[i]);
            dividend+=myDoubles[i];
        }

        System.out.println(dividend/divisor);
    }
}
