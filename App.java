import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        File inputTekst = new File("tekst.txt"); // Tildeler teksten som tekst.txt
        ArrayList<String> tekstArray = new ArrayList<>(); // Laver arrayliste for teksten
        TranslateArray TranslateArray = new TranslateArray(); // Initialiserer array for oversættelse
        TranslateArray.assignTranslations(); // Fylder arrayen'

        Scanner sc = new Scanner(inputTekst, "UTF-8");// UTF-8 så æ, ø & å kan bruges

        while (sc.hasNext()) { // Fylder arraylisten med individuelle strings fra teksten


         //GUI Handler
         JFrame window = new JFrame("GUI"); 
         GUI thisGUI = new GUI();
         thisGUI.paintComponent(); //adding the components to the Jframe before pack(), for pack() to work
         window.add(thisGUI);
         window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //standard close function
         window.setVisible(true); 
         window.pack();

        thisGUI.setInput(inputTekst);


        while(sc.hasNext()){ //Fylder arraylisten med individuelle strings fra teksten
            String string = sc.next();

            tekstArray.add(string);
        }

        for (int i = 0; i < tekstArray.size(); i++) { // Kører igennem hele teksten

            for (int l = 0; l < TranslateArray.TranslateArray.get(0).size(); l++) { // Kører igennem oversættelserne

                String ord = TranslateArray.TranslateArray.get(0).get(l); // Ord er hver oversættelse

                if (tekstArray.get(i) == ord) { // Hvis et string for teksten er det samme som ord
                    tekstArray.set(i, TranslateArray.TranslateArray.get(1).get(l)); // er tekstens string det samme som det ord.
                }

            }

        }

        String output = ""; //tekstarrayet bliver udskrevet som string

        for(int i = 0; i < tekstArray.size(); i++){
            output = output + tekstArray.get(i) + " ";
        }

        System.out.println(output);


    }

}
}