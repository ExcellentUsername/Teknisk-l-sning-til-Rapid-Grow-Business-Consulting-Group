import java.util.ArrayList;

public class TranslateArray {

    //Initialisering af 2d string array

    ArrayList<ArrayList<String>> TranslateArray = new ArrayList<ArrayList<String>>();  
    ArrayList<String> input = new ArrayList<String>();

    ArrayList<String> Translation = new ArrayList<String>();

    //tildeler oversættelser

    void assignTranslations(){

        TranslateArray.add(input);

        TranslateArray.add(Translation);


        input.add("målet");

        Translation.add("target");


        input.add("mål");

        Translation.add("target");
        

        input.add("nyt");

        Translation.add("bleeding edge");


        input.add("ny");

        Translation.add("bleeding edge");


        input.add("god");

        Translation.add("excellent");


        input.add("godt");

        Translation.add("excellent");


        input.add("penge");

        Translation.add("profit");


        input.add("skov");

        Translation.add("økosystem");


        input.add("mark");

        Translation.add("økosystem");


        input.add("hav");

        Translation.add("økosystem");


        input.add("sø");

        Translation.add("økosystem");


        input.add("bankerot");

        Translation.add("midlertidig nedtur");


        input.add("mulighed");

        Translation.add("once in a lifetime opportunity");


        input.add("lobbysime");

        Translation.add("donationer til udvalgte politikere");


        input.add("strejke");

        Translation.add("nedlægning af nødvendig arbejdskraft");


        input.add("fagforening");

        Translation.add("marxistisk bogklub");


        input.add("skattesvindel");

        Translation.add("danske bank inspireret forhold til skat");


        input.add("stjæle fra medarbejdere");

        Translation.add("crowdfunding");


        input.add("nedlukke");

        Translation.add("udføre exit strategi");


    }

}

