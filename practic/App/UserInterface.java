package App;

import javax.swing.JOptionPane;

import Modules.Pyramid;

import java.util.Scanner;

//      *     
//     ***
//    *****
//   *******
//  *********
// ***********

public class UserInterface {

    public void question() {
        Scanner scanner = new Scanner(System.in);
        Pyramid pyramid = new Pyramid();

        System.out.println("Choose Pyramid Settings!");

        System.out.println("Please enter rows count");
        int rows = scanner.nextInt();

        System.out.println("Please enter columns count");
        int columns = scanner.nextInt();

        System.out.println("Please enter the display name default is (pyramid)");
        String title = scanner.next();

        pyramid.pyramid(rows, columns, title);
    }

    public void alert(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
