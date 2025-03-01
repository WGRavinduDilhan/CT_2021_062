package Q5;

import javax.swing.*;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5CT62 {
    public static void main(String[] args) {

        Date day = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(day));
    }
}
