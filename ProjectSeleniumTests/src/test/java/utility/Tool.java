package utility;

import org.openqa.selenium.support.Color;

public class Tool
{
    public static String convertRGBAColorToHex(String color)
    {
        return Color.fromString(color).asHex();
    }
}
