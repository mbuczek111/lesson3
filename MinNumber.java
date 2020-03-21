public class MinNumber {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for(int i=0;i<args.length;i++)
        {
            numbers[i]=Integer.parseInt(args[i]);
        }
        int minNumber = numbers[0];
        for (int currentNumber : numbers) {
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println(minNumber);
    }
}
