public class InchesToFeet {
    public static void main(String[]arg)
    {
        int inputValue=86;
        int inches,feet;
        feet = inputValue / 12;
        inches = inputValue % 12;
        System.out.print(feet + " feet and " + inches + " inches");

    }
}
