package lab2_ricardosanchez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Lab2_RicardoSanchez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp = 's';
        ArrayList<Alemanes> Aleman = new ArrayList();
        ArrayList<Rusos> Ruso = new ArrayList();
        ArrayList<AlumnosD_Progra2> Alumnos = new ArrayList();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("ARMY SIMULATOR");
            System.out.println("-----MENU-----");
            System.out.println("Elija el ejecito que desa modificar:");
            System.out.println("1) Ejercito Aleman (Reclutar)");
            System.out.println("2) Ejercito Ruso (Reclutar)");
            System.out.println("3) Ejercito Progra (Reclutar)");
            System.out.println("4)Comenzar Guerra");
            System.out.println("5) Modificar Soldado");
            System.out.println("6) Salir");
            int opcionDE = sc.nextInt();
            while (opcionDE > 5 && opcionDE < 0) {
                System.out.println("Numero invalido. Ingrese otro:");
                opcionDE = sc.nextInt();
            }
            //Creacion de los ArrayList de los ejercitos

            switch (opcionDE) {
                case 1:
                    char seguir = 's';
                    System.out.println("-----Ejercito Aleman-----");
                    int contA = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contA);
                        System.out.println("Ingrese el Alias del soldado");
                        String Alias = sc.next();
                        System.out.println("Ingrese la edad:");
                        int Edad = sc.nextInt();
                        System.out.println("Ingrese casta:");
                        String Casta = sc.next();
                        System.out.println("Ingrese rango");
                        String Rango = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Subfusiles MP40"
                                + "\nb) Ametralladora MG42"
                                + "\nc) Pistora Walther p38");
                        String TipoDArma = sc.next();
                        while(!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")){
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArma = sc.next();
                        }
                        if(TipoDArma.equals("a")){
                            TipoDArma = "Subfusiles MP40";
                        }else if(TipoDArma.equals("b")){
                            TipoDArma = "Ametralladora MG42";
                        }else if (TipoDArma.equals("c")){
                            TipoDArma = "Pistora Walther p38";
                        }
                        int Resistencia = Edad * 8;
                        Aleman.add(new Alemanes(Alias,Edad,Casta,Rango,Resistencia,TipoDArma));
                        contA++;
                        System.out.println("Desea reclutar otro soldado [S/N]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                case 2:
                    seguir = 's';
                    System.out.println("-----Ejercito Ruso-----");
                    int contR = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contR);
                        System.out.println("Ingrese el nombre del soldado");
                        String Alias = sc.next();
                        System.out.println("Ingrese la edad:");
                        int Edad = sc.nextInt();
                        System.out.println("Ingrese ID:");
                        int ID = sc.nextInt();
                        System.out.println("Ingrese rango");
                        String Rango = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Ak-47"
                                + "\nb) Revolver"
                                + "\nc) RPG7");
                        String TipoDArma = sc.next();
                        while(Edad < 25 && TipoDArma.equals("c")){
                            System.out.println("Arma Invalida para su edad. Ingrese otra");
                            TipoDArma = sc.next();
                        }
                        while(!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")){
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArma = sc.next();
                        }
                        
                        if(TipoDArma.equals("a")){
                            TipoDArma = "Ak-47";
                        }else if(TipoDArma.equals("b")){
                            TipoDArma = "Revolver";
                        }else if (TipoDArma.equals("c")){
                            TipoDArma = "RPG7";
                        }
                        int Resistencia = Edad * 8;
                        if(Edad > 18){
                        Ruso.add(new Rusos(Alias,ID,Edad,Rango,Resistencia,TipoDArma));
                        contR++;
                        }else{
                            System.out.println("No tiene la edad suficiente para ingresar");
                        }
                        System.out.println("Desea reclutar otro soldado [S/N]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');

                case 3:
                    seguir = 's';
                    System.out.println("-----Ejercito Alumnos-----");
                    int contAl = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contAl);
                        System.out.println("Ingrese el Apodo del soldado");
                        String Apodo = sc.next();
                        System.out.println("Ingrese la edad:");
                        int Edad = sc.nextInt();
                        System.out.println("Ingrese numero de cuenta:");
                        int NumCuenta = sc.nextInt();
                        System.out.println("Ingrese grado academico");
                        String GradoAcademico = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Disco duro"
                                + "\nb) Controles de wii"
                                + "\nc) Laptop");
                        String TipoDArma = sc.next();
                        while(!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")){
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArma = sc.next();
                        }
                        
                        if(TipoDArma.equals("a")){
                            TipoDArma = "Disco duro";
                        }else if(TipoDArma.equals("b")){
                            TipoDArma = "Control de wii";
                        }else if (TipoDArma.equals("c")){
                            TipoDArma = "Laptop";
                        }
                        int Resistencia = Edad * 8;
                        if(Edad > 16){
                        Alumnos.add(new AlumnosD_Progra2(Apodo,NumCuenta,Edad,Resistencia,TipoDArma,GradoAcademico));
                        contAl++;
                        }else{
                            System.out.println("No tiene la edad suficiente para ingresar");
                        }
                        System.out.println("Desea reclutar otro soldado [S/N]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');

                case 4:
                    System.out.println("MODIFICACION DE LOS EJERCITOS");
                    System.out.println("Elija el ejercito a modificar:"
                            + "\na) Alemanes"
                            + "\nb) Rusos"
                            + "\nd) Alumnos");

                case 5:

                default:
            }
            System.out.println("Desea volver a empezar el programa");
            resp = sc.next().charAt(0);
        } while (resp == 'S' || resp == 's');
    }

}
