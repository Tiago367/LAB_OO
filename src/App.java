import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Musica> lista = new ArrayList<>(); 
        CD baby = new CD("Tourne_Justin","Baby","JustinBieber", "Justin",2002);
        LP theNights = new LP("Avici_Tourne","TheNights","Imagine_Dragons","Imagine_Dragons",2005,60);
        MP3 TheDays = new MP3("Avici_Tourne","TheDays","Imagine_Dragons","Imagine_Dragons",2005,300000000);
        lista.add(TheDays);
        lista.add(theNights);
        lista.add(baby);


        Musica.BuscaPeriodo(lista,2000,2005);
        Musica.buscaInterprete(lista,"Justin");
        MP3.MaioresMusicas(lista);


    }

    
}

