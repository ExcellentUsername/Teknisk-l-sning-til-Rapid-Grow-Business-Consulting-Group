import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*; 
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception{
 
        File inputTekst = new File("tekst.txt"); //assigner filen tekst.txt
        Scanner sc = new Scanner(inputTekst, "UTF-8"); 
        ArrayList<String> arr = new ArrayList<>();

        while(sc.hasNext()){ //Fylder arraylisten med individuelle strings fra teksten
            String string = sc.next();

            arr.add(string);
         }

            String[] stringArray = new String[arr.size()]; //Laver nyt stringarray

            for(int i = 0; i < arr.size(); i++){

                stringArray[i] = arr.get(i);
    
            }

            System.out.println(Arrays.toString(stringArray));

            //GUI Handler
            JFrame window = new JFrame("GUI"); 
            window.add( new GUI());
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            window.setSize(500, 250);;
            window.setVisible(true); 
            window.repaint(); 
    }
}