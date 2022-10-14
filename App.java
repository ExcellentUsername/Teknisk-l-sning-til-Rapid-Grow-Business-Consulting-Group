import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*; 
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception{

         //GUI Handler
         JFrame window = new JFrame("GUI"); 
         GUI thisGUI = new GUI();
         thisGUI.paintComponent(); //adding the components to the Jframe before pack(), for pack() to work
         window.add(thisGUI);
         window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //standard close function
         window.setVisible(true); 
         window.pack();


 
        File inputTekst = new File("tekst.txt"); //assigner filen tekst.txt
        Scanner sc = new Scanner(inputTekst, "UTF-8"); 
        ArrayList<String> arr = new ArrayList<>();

        thisGUI.setInput(inputTekst);


        while(sc.hasNext()){ //Fylder arraylisten med individuelle strings fra teksten
            String string = sc.next();

            arr.add(string);
         }

            String[] stringArray = new String[arr.size()]; //Laver nyt stringarray

            for(int i = 0; i < arr.size(); i++){

                stringArray[i] = arr.get(i);
    
            }

            System.out.println(Arrays.toString(stringArray));


    }
}