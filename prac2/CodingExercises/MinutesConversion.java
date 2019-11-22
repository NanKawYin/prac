import java.text.DecimalFormat;

public class MinutesConversion
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[]arg)
    {
        double inputValue = 6000;
        double hours, days;
        hours= inputValue / 60;
        days = hours / 24;
        System.out.println(inputValue + " minutes equals "  + hours + " hours and equals " + df2.format(days) + " day" );



    }
}
