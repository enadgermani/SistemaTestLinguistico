package com.aps.UI;

import Domain.Controller;
import Domain.Utente;

import java.util.Scanner;

public class Main {
    private static Controller controller = new Controller();
    public static String NomeSezione;

    // static  String method;
    public static void main(String[] args)  {
        login();

//        System.out.println((controller.getObject("Test")).toString());
        //termina procedura di login obbligatoria

        System.out.println("Scegliere operazione succesiva:");

        //Creo nuovo test o ne seleziono uno esistente. Chiede ancora in caso di scelta non prevista
        test();

        //   System.out.println((controller.getObject("Test")).toString());
        //Aggiungo sezione, o chiedo lista sezioni.
        //todo: SCELTA DELLA SEZIONE SU CUI LAVORARE
        sezioni();
        //Visualizzo le domande, o ne creo una

        slide();
        domande();
    }


    //FATTO
    public static void login() {
        String user;
        String password;

        Scanner t = new Scanner(System.in);
        System.out.println("Benvenuto nel sistema test linguistico");
        System.out.println("Inserire username");
        user = t.nextLine();
        System.out.println("Inserire Password");
        password = t.nextLine();
        controller.login(user, password);
    }


    //Fatto
    public static void test() {
        Scanner t = new Scanner(System.in);
        while (true) {
            String method;
            System.out.println("1) Crea test ");
            System.out.println("2) Seleziona test esistente");
            System.out.println("0) Vai al menu");

            method = t.nextLine();
            if (method.equals("1")) {
                creaTest();
                break;
            } else if (method.equals("2")) {
                SelezionaTest();
                break;
            } else if (method.equals("0")) {
                menu();
                break;
            }
        }


    }


    //Fatto
    public static void sezioni() {
        Scanner t1 = new Scanner(System.in);
        String method;
        while (true) {

            System.out.println("1) Crea nuova sezione ");
            System.out.println("2) Visualizza lista sezioni");
            System.out.println("0) Vai al menu");

            method = t1.nextLine();
            if (method.equals("2")) {
                getSezioni();
                break;

            } else if (method.equals("1")) {
                System.out.println("Inserire nome sezione");
                NomeSezione = t1.nextLine();
                controller.creaSezione(NomeSezione);
                //  controller.execute("Creata  nuova sezione: " + NomeSezione );

                break;
            } else if (method.equals("0")) {
                menu();
            }
        }
    }
   //Fatto
    public static void domande() {
        Scanner t1 = new Scanner(System.in);
        String method;
        while (true) {
            System.out.println("1) Visualizza lista domande ");
            System.out.println("2) Crea nuova domanda");
            System.out.println("0) Vai al menu");
            method = t1.nextLine();
            if (method.equals("1")) {
                controller.execute("getArrayDomande().");
                break;

            } else if (method.equals("2")) {
                CreaDomanda();
                break;
            } else if (method.equals("0")) {
                menu();
                break;
            }
        }
    }


    private static void slide() {
        Scanner t1 = new Scanner(System.in);
        String method;
        while (true) {
            System.out.println("1) Crea nuova Slide ");
            System.out.println("2) Visualizza lista Slides");
            System.out.println("0) Vai al menu");

            method = t1.nextLine();
            if (method.equals("1")) {
                CreaSlide();
                break;

            } else if (method.equals("2")) {
                getSlides();
            } else if (method.equals("0")) {
                menu();
                break;
            }
        }
    }

    private static void menu() {
        Scanner m = new Scanner(System.in);
        String method;
        while (true) {
            System.out.println("1) Test ");
            System.out.println("2) Sezioni");
            System.out.println("3) Slides ");
            System.out.println("4) Domande");
            System.out.println("0) Menu");
            method = m.nextLine();
            if (method.equals("1")) {
                test();
            break;
            } else if (method.equals("2")) {
                sezioni();
                break;
            } else if (method.equals("3")) {
                slide();
                break;
            } else if (method.equals("4")) {
                domande();
                break;
            }
        }
    }





    ///metodi funzionali

    public static void getSlides() {

        try {
            Controller.getObject("Slide");
        } catch (NullPointerException e) {
            System.out.println("Nessuna slide ancora creata");
            slide();
        }
    }

    public static void CreaSlide() {
        Scanner t3 = new Scanner(System.in);
        System.out.println("ordine");
        String ordine = t3.nextLine();
        System.out.println("Inserire nome");
        String nome = t3.nextLine();

        controller.creaSlide(ordine, nome);
    }



    public static void getSezioni() {
        try {

            System.out.println((Controller.getObject("Sezione")).toString());
        } catch (NullPointerException e) {
            System.out.println("Nessuna sezione esistente");
            sezioni();

        }
    }
    public static void creaTest() {
        String keyword;
        String nome;

        Scanner t2 = new Scanner(System.in);
        System.out.println("Inserire  Keyword");
        keyword = t2.nextLine();
        System.out.println("Inserire  Nome test");
        nome = t2.nextLine();
        controller.creaTest(nome, keyword);

    }

    public static void SelezionaTest() {

        //   controller.execute("Ecco il test: " + t2.nextLine() );
        try {
            System.out.println((Controller.getObject("Test")).toString());
        } catch (NullPointerException e) {
            System.out.println("Nessun test esistente");
            test();
        }
        Scanner t2= new Scanner(System.in);
        System.out.println("Marcare come definitivo[Y/N]");
        if(t2.nextLine().contains("Y")){
            controller.mark();
        }
    }

    public static void CreaDomanda() {
        Scanner t3 = new Scanner(System.in);
        System.out.println("Inserire testo");
        String testo = t3.nextLine();
        System.out.println("Inserire risposta");
        String risposta = t3.nextLine();

        controller.CreaDomanda(testo, risposta);
        //    controller.execute("Ecco la domanda: " +testo + "%" + risposta );
    }

}


