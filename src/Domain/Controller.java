package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
	
    private static ArrayList<Object> objects = new ArrayList<Object>();

    public Controller() {
    }

    public String execute(String s) {
        return ("command = " + s);
    }


    public static String login(String u, String p) {
        objects.add(Utente(u, p));
        //TODO commentare questa parte di codice prima della consegna, anche se e' molto figa
        List<String> user =
        objects.stream()
                .map(Object::toString)
                .filter(s-> s.contains("Utente"))
                .collect(Collectors.toList());
        System.out.println(user);
 return "utente" + user
         + "creato";


    }
    
    public Domanda creaDomanda(Sezione s, String testo) {
    	Domanda d = new Domanda(s,testo);
    	return d;
    }

    public String creaTest(String nome) {
        objects.add(new TestPilota(nome));
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


    public void creaSlide(Domanda d){

        //Non capisco perchè la slide necessiti di Int ordine. Inserito dal'utente oppure random se utente spara a caso
        Slide slide = new Slide(d);
        objects.add(slide);
    }
    public static void CreaDomanda(String testo, String risposta){

        Slide slide = (Slide) getObject("Slide");
        Sezione sezione = (Sezione) getObject("Sezione");
        Domanda domanda = new Domanda(sezione,testo);

        objects.add(domanda);
        Test t = (Test) getObject("Test");
        t.getSezioni().get(0).getDomande().add(domanda);

    }

    public Sezione creaSezione(String nomeSezione) {
     //Uso il primo test disponibile
        Test test = (Test) getObject("Test");
        Sezione sezione= new Sezione(nomeSezione, test);
        objects.add(sezione);
        return sezione;
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
