package com.gerbshert.projectglass.util;

/**
 * Created by Gabriel on 9/3/2015.
 */
public class PGUtilities {
    public static int rgb2Decimal(int red, int green, int blue){
        if(red > 255 || green > 255 || blue > 255){
            System.err.println("RGB colour values must be less than 255");
            System.err.println("The values received where Red:"+red+" | Green:"+green+" | Blue:"+blue);
            return 0;
        }
        else if(red < 0 || green < 0 || blue < 0){
            System.err.println("RGB colour values must be more than 0");
            System.err.println("The values received where Red:"+red+" | Green:"+green+" | Blue:"+blue);
            return 0;
        }
        else {
            int decimalColour = (red * 65536) + (green * 256) + blue;
            return decimalColour;
        }
    }
}
