import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

      
        File inputTekst = new File("tekst.txt"); // Tildeler teksten som tekst.txt

        


         //GUI Handler
         JFrame window = new JFrame("GUI"); 
         GUI thisGUI = new GUI();
         thisGUI.paintComponent(); //adding the components to the Jframe before pack(), for pack() to work
         window.add(thisGUI);
         window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //standard close function
         window.setVisible(true); 
         window.pack();

        thisGUI.setInput(inputTekst);
             

    



thisGUI.Convert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent event){
    ArrayList<String> tekstArray = new ArrayList<>(); // Laver arrayliste for teksten

    TranslateArray thisTranslateArray = new TranslateArray(); // Initialiserer array for oversættelse
    thisTranslateArray.assignTranslations(); // Fylder arrayen'

    try (Scanner sc = new Scanner(inputTekst, "UTF-8")) {
        while(sc.hasNext()){ //Fylder arraylisten med individuelle strings fra teksten
            String string = sc.next();

            tekstArray.add(string);
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    for (int i = 0; i < tekstArray.size(); i++) { // Kører igennem hele teksten

        for (int l = 0; l < thisTranslateArray.TranslateArray.get(0).size(); l++) { // Kører igennem oversættelserne

            String ord = thisTranslateArray.TranslateArray.get(0).get(l); // Ord er hver oversættelse

            if (tekstArray.get(i).equals(ord)) { // Hvis et string for teksten er det samme som ord
                tekstArray.set(i, thisTranslateArray.TranslateArray.get(1).get(0)); // er tekstens string det samme som det ord.
            }

        }

    }

    String output = ""; //tekstarrayet bliver udskrevet som string

    for(int i = 0; i < tekstArray.size(); i++){
        output = output + tekstArray.get(i) + " ";
    }

    thisGUI.setOutput(output);
}


});
}}