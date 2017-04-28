package lab2_ricardosanchez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Lab2_RicardoSanchez {
    static int ID, NumCuenta, ResistenciaR, ResistenciaA, ResistenciaAl, EdadR, EdadA, EdadAl;
    static String Casta, Alias, Apodo, Nombre, TipoDArmaA, TipoDArmaR, TipoDArmaAl,RangoR, RangoA, GradoAcademico;
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
            System.out.println("4) Modificar Soldados");
            System.out.println("5) Simular Guerra");
            System.out.println("6) Salir");
            int opcionDE = sc.nextInt();
            while (opcionDE > 6 && opcionDE < 0) {
                System.out.println("Numero invalido. Ingrese otro:");
                opcionDE = sc.nextInt();
            }
            //Creacion de los ArrayList de los ejercitos

            switch (opcionDE) {
                case 1: //EJERCITO ALEMAN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
                    char seguir = 's';
                    System.out.println("-----Ejercito Aleman-----");
                    int contA = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contA);
                        System.out.println("Ingrese el Alias del soldado");
                        Alias = sc.next();
                        System.out.println("Ingrese la edad:");
                        EdadA = sc.nextInt();
                        System.out.println("Ingrese casta:");
                        Casta = sc.next();
                        System.out.println("Ingrese rango");
                        RangoA = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Subfusiles MP40"
                                + "\nb) Ametralladora MG42"
                                + "\nc) Pistora Walther p38");
                        TipoDArmaA = sc.next();
                        while (!TipoDArmaA.equals("a") && !TipoDArmaA.equals("b") && !TipoDArmaA.equals("c")) {
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArmaA = sc.next();
                        }
                        if (TipoDArmaA.equals("a")) {
                            TipoDArmaA = "Subfusiles MP40";
                        } else if (TipoDArmaA.equals("b")) {
                            TipoDArmaA = "Ametralladora MG42";
                        } else if (TipoDArmaA.equals("c")) {
                            TipoDArmaA = "Pistora Walther p38";
                        }
                        ResistenciaA = EdadA * 8;
                        Aleman.add(new Alemanes(Alias, EdadA, Casta, RangoA, ResistenciaA, TipoDArmaA));
                        contA++;
                        System.out.println("Desea reclutar otro soldado [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;
                case 2: // EJERCITO PARA LOS RUSOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                    seguir = 's';
                    System.out.println("-----Ejercito Ruso-----");
                    int contR = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contR);
                        System.out.println("Ingrese el nombre del soldado");
                        Alias = sc.next();
                        System.out.println("Ingrese la edad:");
                        EdadR = sc.nextInt();
                        System.out.println("Ingrese ID:");
                        ID = sc.nextInt();
                        System.out.println("Ingrese rango");
                        RangoR = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Ak-47"
                                + "\nb) Revolver"
                                + "\nc) RPG7");
                        TipoDArmaR = sc.next();
                        while (EdadR < 25 && TipoDArmar.equals("c")) {
                            System.out.println("Arma INvalida para su edad. Ingrese otra");
                            TipoDArmaR = sc.next();
                        }
                        while (!TipoDArmaR.equals("a") && !TipoDArmaR.equals("b") && !TipoDArmaR.equals("c")) {
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArmaR = sc.next();
                        }

                        if (TipoDArmaR.equals("a")) {
                            TipoDArmaR = "Ak-47";
                        } else if (TipoDArmaR.equals("b")) {
                            TipoDArmaR = "Revolver";
                        } else if (TipoDArmaR.equals("c")) {
                            TipoDArmaR = "RPG7";
                        }
                        ResistenciaR = EdadR * 8;
                        if (EdadR > 18) {
                            Ruso.add(new Rusos(Alias, ID, EdadR, RangoR, ResistenciaR, TipoDArmaR));
                            contR++;
                        } else {
                            System.out.println("No tiene la edad suficiente para ingresar");
                        }
                        System.out.println("Desea reclutar otro soldado [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;

                case 3://EJERCITO PARA LOS ALUMNOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                    seguir = 's';
                    System.out.println("-----Ejercito Alumnos-----");
                    int contAl = 0;
                    do {
                        System.out.println("Reclutamiento del soldado #" + contAl);
                        System.out.println("Ingrese el Apodo del soldado");
                        Apodo = sc.next();
                        System.out.println("Ingrese la edad:");
                        EdadAl = sc.nextInt();
                        System.out.println("Ingrese numero de cuenta:");
                        NumCuenta = sc.nextInt();
                        System.out.println("Ingrese grado academico");
                        GradoAcademico = sc.next();
                        System.out.println("Elija un arma entre la lista: (Ingrese la letra)"
                                + "\na) Disco duro"
                                + "\nb) Controles de wii"
                                + "\nc) Laptop");
                        TipoDArmaAl = sc.next();
                        while (!TipoDArmaAl.equals("a") && !TipoDArmaAl.equals("b") && !TipoDArmaAl.equals("c")) {
                            System.out.println("Input invalido. Ingrese otro:");
                            TipoDArmaAl = sc.next();
                        }

                        if (TipoDArmaAl.equals("a")) {
                            TipoDArmaAl = "Disco duro";
                        } else if (TipoDArmaAl.equals("b")) {
                            TipoDArmaAl = "Control de wii";
                        } else if (TipoDArmaAl.equals("c")) {
                            TipoDArmaAl = "Laptop";
                        }
                        ResistenciaAl = EdadAl * 8;
                        if (EdadAl > 16) {
                            Alumnos.add(new AlumnosD_Progra2(Apodo, NumCuenta, EdadAl, ResistenciaAl, TipoDArmaAl, GradoAcademico));
                            contAl++;
                        } else {
                            System.out.println("No tiene la edad suficiente para ingresar");
                        }
                        System.out.println("Desea reclutar otro soldado [s/n]");
                        seguir = sc.next().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;
                case 4: // MODIFICACION DE LOS EJERCITOS -------------------------------------------------------------------------------
                    System.out.println("MODIFICACION DE LOS EJERCITOS");
                    System.out.println("Elija el ejercito a modificar:"
                            + "\na) Alemanes"
                            + "\nb) Rusos"
                            + "\nd) Alumnos");
                    String OpcionModi = sc.next();
                    while (!OpcionModi.equals("a") && !OpcionModi.equals("b") && !OpcionModi.equals("c")) {
                        System.out.println("Letra invalida. Ingrese otra:");
                        OpcionModi = sc.next();
                    }
                    if (OpcionModi.equals("a")) { //PARA EL EJERCITO ALEMAN ============================================================> (ABAJO DEL ANUNCIO)
                        System.out.println("Desea:"
                                + "\na) Dar de Alta a un soldado"
                                + "\nb) Modificar un soldado");
                        String ElimOMod = sc.next();
                        while (!ElimOMod.equals("a") && !ElimOMod.equals("b")) {
                            System.out.println("Input invalido. Ponga otra");
                            ElimOMod = sc.next();
                        }
                        if (ElimOMod.equals("a")) {
                            char respN = 'n';
                            do {
                                System.out.println("---Modificar un soldado---");
                                System.out.println("Lista de soldados:");
                                for (int i = 0; i < Aleman.size(); i++) {
                                    System.out.println("Soldado #" + i + "   " + Aleman.get(i));
                                }
                                System.out.println("Ingrese el numero del soldado que quiere modificar");
                                int Soldado = sc.nextInt();
                                while (Soldado < 0 && Soldado > Aleman.size()) {
                                    System.out.println("Posicion invalida. Ingrese otro");
                                    Soldado = sc.nextInt();
                                }
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
                                while (!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")) {
                                    System.out.println("Input invalido. Ingrese otro:");
                                    TipoDArma = sc.next();
                                }
                                if (TipoDArma.equals("a")) {
                                    TipoDArma = "Subfusiles MP40";
                                } else if (TipoDArma.equals("b")) {
                                    TipoDArma = "Ametralladora MG42";
                                } else if (TipoDArma.equals("c")) {
                                    TipoDArma = "Pistora Walther p38";
                                }
                                int Resistencia = Edad * 8;
                                Aleman.set(Soldado, (new Alemanes(Alias, Edad, Casta, Rango, Resistencia, TipoDArma)));
                                System.out.println("Desea Modificar otro [s/n]");
                            } while (respN == 's' || respN == 's');
                        } else {
                            char respN = 'n';
                            do {
                                System.out.println("---Dar de Alta---");
                                System.out.println("Lista de soldados:");
                                for (int i = 0; i < Aleman.size(); i++) {
                                    System.out.println("Soldado #" + i + "   " + Aleman.get(i));
                                }
                                System.out.println("Ingrese el numero del soldado que quiere dar de alta");
                                int Soldado = sc.nextInt();
                                while (Soldado < 0 && Soldado > Aleman.size()) {
                                    System.out.println("Posicion invalida. Ingrese otro");
                                    Soldado = sc.nextInt();
                                }
                                Aleman.remove(Soldado);
                                System.out.println("Desea remover otro [s/n]");
                                respN = sc.next().charAt(0);
                            } while (respN == 's' || respN == 's');
                        }
                    } else if (OpcionModi.equals("b")) { //PARA EL EJERCITO RUSO ====================================> (ABAJO DEL ANUNCIO)
                        System.out.println("Desea:"
                                + "\na) Dar de Alta a un soldado"
                                + "\nb) Modificar un soldado");
                        String ElimOMod = sc.next();
                        while (!ElimOMod.equals("a") && !ElimOMod.equals("b")) {
                            System.out.println("Input invalido. Ponga otra");
                            ElimOMod = sc.next();
                        }
                        if (ElimOMod.equals("a")) {
                            char respN = 'n';
                            do {
                                System.out.println("---Modificar un soldado---");
                                System.out.println("Lista de soldados:");
                                for (int i = 0; i < Ruso.size(); i++) {
                                    System.out.println("Soldado #" + i + "   " + Ruso.get(i));
                                }
                                System.out.println("Ingrese el numero del soldado que quiere modificar");
                                int Soldado = sc.nextInt();
                                while (Soldado < 0 && Soldado > Ruso.size()) {
                                    System.out.println("Posicion invalida. Ingrese otro");
                                    Soldado = sc.nextInt();
                                }

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
                                while (Edad < 25 && TipoDArma.equals("c")) {
                                    System.out.println("Arma Invalida para su edad. Ingrese otra");
                                    TipoDArma = sc.next();
                                }
                                while (!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")) {
                                    System.out.println("Input invalido. Ingrese otro:");
                                    TipoDArma = sc.next();
                                }

                                if (TipoDArma.equals("a")) {
                                    TipoDArma = "Ak-47";
                                } else if (TipoDArma.equals("b")) {
                                    TipoDArma = "Revolver";
                                } else if (TipoDArma.equals("c")) {
                                    TipoDArma = "RPG7";
                                }
                                int Resistencia = Edad * 8;
                                if (Edad > 18) {
                                    Ruso.set(Soldado, (new Rusos(Alias, ID, Edad, Rango, Resistencia, TipoDArma)));
                                } else {
                                    System.out.println("No tiene la edad suficiente para ingresar");
                                }
                                System.out.println("Desea modificar otro soldado");
                                respN = sc.next().charAt(0);
                            } while (respN == 's' || resp == 'S');
                        } else {
                            char respN = 'n';
                            do {
                                System.out.println("---Dar de Alta---");
                                System.out.println("Lista de soldados:");
                                for (int i = 0; i < Ruso.size(); i++) {
                                    System.out.println("Soldado #" + i + "   " + Ruso.get(i));
                                }
                                System.out.println("Ingrese el numero del soldado que quiere dar de alta");
                                int Soldado = sc.nextInt();
                                while (Soldado < 0 && Soldado > Ruso.size()) {
                                    System.out.println("Posicion invalida. Ingrese otro");
                                    Soldado = sc.nextInt();
                                }
                                Ruso.remove(Soldado);
                                System.out.println("Desea remover otro [s/n]");
                                respN = sc.next().charAt(0);
                            } while (respN == 's' || respN == 's');
                        }

                    } else { // PARA LOS ALUMNOS ================================================================================> (ABAJO DEL ANUNCIO)
                        char respN = 'n';
                        do {
                            System.out.println("Desea:"
                                    + "\na) Dar de Alta a un soldado"
                                    + "\nb) Modificar un soldado");
                            String ElimOMod = sc.next();
                            while (!ElimOMod.equals("a") && !ElimOMod.equals("b")) {
                                System.out.println("Input invalido. Ponga otra");
                                ElimOMod = sc.next();
                            }
                            if (ElimOMod.equals("a")) {
                                respN = 'n';
                                do {
                                    System.out.println("---Modificar un soldado---");
                                    System.out.println("Lista de soldados:");
                                    for (int i = 0; i < Alumnos.size(); i++) {
                                        System.out.println("Soldado #" + i + "   " + Alumnos.get(i));
                                    }
                                    System.out.println("Ingrese el numero del soldado que quiere modificar");
                                    int Soldado = sc.nextInt();
                                    while (Soldado < 0 && Soldado > Alumnos.size()) {
                                        System.out.println("Posicion invalida. Ingrese otro");
                                        Soldado = sc.nextInt();
                                    }
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
                                    while (!TipoDArma.equals("a") && !TipoDArma.equals("b") && !TipoDArma.equals("c")) {
                                        System.out.println("Input invalido. Ingrese otro:");
                                        TipoDArma = sc.next();
                                    }

                                    if (TipoDArma.equals("a")) {
                                        TipoDArma = "Disco duro";
                                    } else if (TipoDArma.equals("b")) {
                                        TipoDArma = "Control de wii";
                                    } else if (TipoDArma.equals("c")) {
                                        TipoDArma = "Laptop";
                                    }
                                    int Resistencia = Edad * 8;
                                    if (Edad > 16) {
                                        Alumnos.set(Soldado, (new AlumnosD_Progra2(Apodo, NumCuenta, Edad, Resistencia, TipoDArma, GradoAcademico)));

                                    } else {
                                        System.out.println("No tiene la edad suficiente para ingresar");
                                    }
                                    System.out.println("Desea volver a modificar un soldado");
                                    respN = sc.next().charAt(0);
                                } while (respN == 's' || respN == 'N');

                            } else {
                                do {
                                    System.out.println("---Dar de Alta---");
                                    System.out.println("Lista de soldados:");
                                    for (int i = 0; i < Alumnos.size(); i++) {
                                        System.out.println("Soldado #" + i + "   " + Alumnos.get(i));
                                    }
                                    System.out.println("Ingrese el numero del soldado que quiere dar de alta");
                                    int Soldado = sc.nextInt();
                                    while (Soldado < 0 && Soldado > Ruso.size()) {
                                        System.out.println("Posicion invalida. Ingrese otro");
                                        Soldado = sc.nextInt();
                                    }
                                    Alumnos.remove(Soldado);
                                    System.out.println("Desea remover otro [s/n]");
                                    respN = sc.next().charAt(0);
                                } while (respN == 's' || respN == 's');
                            }
                            System.out.println("Desea volver a Dar de alta a un soldado");
                        } while (respN == 's' || respN == 's');
                    }
                    break;

                case 5:// SIMULACION PARA LA GUERRA ----------------------------------------------------------------------------------
                    System.out.println("La Guerra");
                    
                    
                    
                case 6:
                    break;

                default:
                    break;
            }
            System.out.println("Desea volver al menu y elejir otra opcion [s/n]");
            resp = sc.next().charAt(0);
        } while (resp == 'S' || resp == 's');
    }

}
