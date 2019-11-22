import kotlin.collections.IntIterator;

import javax.swing.*;
public class InchesToFeetInteractive {
    public static void main(String[] arg)
    {
        int inputValue = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Value", "Value", JOptionPane.INFORMATION_MESSAGE));
        int inches, feet;
        feet = inputValue / 12;
        inches = inputValue % 12;
        JOptionPane.showMessageDialog(null, feet + " feet and " + inches + " inches");
    }
}
