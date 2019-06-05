package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
    //TUTTO FINISCE QUI, TEST, Sezioni, Domande... TUTTO.
    private static ArrayList<Object> objects = new ArrayList<Object>();

    public Controller() {
    }

    public String execute(String s) {
        //DEPRECATO
        return ("command = " + s);


    }


    public static String login(String u, String p) {
        //Funziona.
        objects.add(Utente.create(u, p));



        //TODO commentare questa parte di codice prima della consegna, anche se e' molto figa
        List<String> user =
        objects.stream()
                .map(Object::toString)
                .filter(s-> s.contains("Utente"))
                .collect(Collectors.toList());


        //      .filter(s -> s.getClass().getName().contains("Utente"))
          //      .distinct()
         // .forEach(System.out::println);


 /*       for(Object pp: objects){
            if(pp.getClass().getName().contains("Utente")){
                System.out.println(pp.toString());
            }
        }

*/
        System.out.println(user);
 return "utente" + user
         + "creato";


    }

    public String creaTest(String nome, String key) {
        objects.add(new Test(nome, key, null));
        return "Test " + nome + " creato";
    }

    public static void PrintTest() {

        //Stampa un test. Puo'  ritornare un test su necessita
        for(Object pp: objects){
            if(pp.getClass().getName().contains("Test")){
                System.out.println(pp.toString());
            }
        }

    }


    public void creaSlide(String ordine, String nome){

        //Non capisco perchè la slide necessiti di Int ordine. Inserito dal'utente oppure random se utente spara a caso
        Slide slide;
        int i;
        try {
            i= Integer.parseInt(ordine);
            slide =new Slide(i, nome);
        } catch (NumberFormatException e) {
         slide = new Slide(nome);

        }
        objects.add(slide);
    }
    public static void CreaDomanda(String testo, String risposta){

        Slide slide = (Slide) getObject("Slide");
        Sezione sezione = (Sezione) getObject("Sezione");
        Domanda domanda = new Domanda(slide, sezione,testo );

        objects.add(domanda);
        Test t = (Test) getObject("Test");
        t.addDomanda(domanda);

    }

    public void creaSezione(String nomeSezione) {
     //Uso il primo test disponibile
        Test test = (Test) getObject("Test");
        Sezione sezione= new Sezione(nomeSezione, test);
        objects.add(sezione);
    }





    public static Object getObject(String s){
//Il primo oggetto della determinata classe
        for(Object i : objects){
            if (i.toString().contains(s.substring(1))){
                return i;
            }
        }
        return null;
    }



    public void mark() {
        Test t = (Test) getObject("Test");

    }
}
