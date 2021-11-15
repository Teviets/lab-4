
/******************************************************************
* 
* Author: Gonzalo Santizo. 
* Carnet 21504
* Fecha de edicion 11-9-21
* 
* This is the main part of the program and will control the user inputs
* 
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Ctrl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Crear perro y pe
        int opcion = 0;

        Vista UserView = new Vista();

        /******************************************************************
         * 
         * We create the 3 different types of radios we will be using during the
         * simulation
         * 
         ******************************************************************/

        RadioA RadioTipoA = new RadioA();
        RadioC RadioTipoC = new RadioC();
        RadioS RadioTipoS = new RadioS();

        /******************************************************************
         * 
         * These are some general purpose lists that will help the user test the program
         * 
         ******************************************************************/

        ArrayList<String> EmisoraList = new ArrayList<String>();
        ArrayList<String> Playlist = new ArrayList<String>();
        ArrayList<String> Contacts = new ArrayList<String>();

        Playlist.add("Over and Over");
        Playlist.add("Walk!!");
        Playlist.add("Burn it down");
        Playlist.add("Jingle Bells");
        Playlist.add("Cold outside");

        EmisoraList.add("Yosi sideral");
        EmisoraList.add("Mente fresca");
        EmisoraList.add("Radio ranchera");
        EmisoraList.add("Honestamente no conozco otra estacion de radio");

        Contacts.add("Mama");
        Contacts.add("Papa");
        Contacts.add("Tu crush");
        Contacts.add("That old highschool friend you keep meaning to call");

        while (opcion != 4) {

            UserView.PrintMenuStart();

            opcion = scan.nextInt();

            if (opcion == 1) {
                /******************************************************************
                 * 
                 * These options will be all centered around Radio type A Here they will choose
                 * what type of mode they want their radio to be on
                 * 
                 ******************************************************************/

                int OpcionRadioA = 0;

                while (OpcionRadioA != 5) {

                    UserView.SetRadioMode();
                    OpcionRadioA = scan.nextInt();

                    if (OpcionRadioA == 1) {

                        int OpcionModoRadioA = 0;

                        while (OpcionModoRadioA != 6) {
                            scan = new Scanner(System.in);

                            UserView.ModoRadio();
                            OpcionModoRadioA = scan.nextInt();

                            if (OpcionModoRadioA == 1) {

                                /******************************************************************
                                 * 
                                 * Raise volume
                                 * 
                                 ******************************************************************/

                                RadioTipoA.RaiseVolume(RadioTipoA);

                            } else if (OpcionModoRadioA == 2) {

                                RadioTipoA.LowerVolume(RadioTipoA);

                            } else if (OpcionModoRadioA == 3) {

                                RadioTipoA.ChangeStationUp(RadioTipoA);

                            } else if (OpcionModoRadioA == 4) {
                                RadioTipoA.ChangeStationDown(RadioTipoA);

                            } else if (OpcionModoRadioA == 5) {
                                RadioTipoA.SaveStation(EmisoraList);
                            }

                        }

                    } else if (OpcionRadioA == 2) {

                        int OpcionModoReproduccionA = 0;

                        while (OpcionModoReproduccionA != 5) {
                            scan = new Scanner(System.in);

                            UserView.ModoReproduccion();
                            OpcionModoReproduccionA = scan.nextInt();

                            /******************************************************************
                             * 
                             * Modo reproduccion
                             * 
                             ******************************************************************/

                            if (OpcionModoReproduccionA == 1) {

                                RadioTipoA.PlayPlaylist(Playlist);

                            } else if (OpcionModoReproduccionA == 2) {

                                RadioTipoA.ChangeSongForward(Playlist);

                            } else if (OpcionModoReproduccionA == 3) {

                                RadioTipoA.ChangeSongBackwards(Playlist);

                            } else if (OpcionModoReproduccionA == 4) {

                            }

                        }

                    } else if (OpcionRadioA == 3) {

                        int OpcionModoTelefonoA = 0;

                        while (OpcionModoTelefonoA != 5) {

                            UserView.ModoTelefono();
                            OpcionModoTelefonoA = scan.nextInt();

                            if (OpcionModoTelefonoA == 1) {
                                RadioTipoA.ConnectPhone();

                            } else if (OpcionModoTelefonoA == 2) {

                                RadioTipoA.DisconnectPhone();

                            } else if (OpcionModoTelefonoA == 3) {

                                RadioTipoA.ShowContacts(Contacts);

                            } else if (OpcionModoTelefonoA == 4) {

                                RadioTipoA.MakeACall();
                            }

                        }

                    } else if (OpcionRadioA == 4) {

                        int OpcionModoSpecialA = 0;

                        while (OpcionModoSpecialA != 3) {

                            System.out.println("Opciones especiales para carro A");
                            System.out.println("1. Llamar a un contacto especifico");
                            System.out.println("2. Mostrar Business Card");
                            OpcionModoSpecialA = scan.nextInt();

                            if (OpcionModoSpecialA == 1) {

                                RadioTipoA.CallLastContact();

                            } else if (OpcionModoSpecialA == 2) {
                                RadioTipoA.ShowBusinessCard();
                            }

                        }

                    }

                }

            } else if (opcion == 2) {
                /******************************************************************
                 * 
                 * These options will be all centered around Radio type C
                 * 
                 ******************************************************************/

                int OpcionRadioC = 0;

                while (OpcionRadioC != 5) {

                    UserView.SetRadioMode();
                    OpcionRadioC = scan.nextInt();

                    if (OpcionRadioC == 1) {

                        int OpcionModoRadioC = 0;

                        while (OpcionModoRadioC != 6) {
                            scan = new Scanner(System.in);

                            UserView.ModoRadio();
                            OpcionModoRadioC = scan.nextInt();

                            if (OpcionModoRadioC == 1) {

                                /******************************************************************
                                 * 
                                 * Raise volume
                                 * 
                                 ******************************************************************/

                                RadioTipoC.RaiseVolume(RadioTipoC);

                            } else if (OpcionModoRadioC == 2) {

                                RadioTipoC.LowerVolume(RadioTipoC);

                            } else if (OpcionModoRadioC == 3) {

                                RadioTipoC.ChangeStationUp(RadioTipoC);

                            } else if (OpcionModoRadioC == 4) {
                                RadioTipoC.ChangeStationDown(RadioTipoC);

                            } else if (OpcionModoRadioC == 5) {
                                RadioTipoC.SaveStation(EmisoraList);
                            }

                        }

                    } else if (OpcionRadioC == 2) {

                        int OpcionModoReproduccionC = 0;

                        while (OpcionModoReproduccionC != 5) {
                            scan = new Scanner(System.in);

                            UserView.ModoReproduccion();
                            OpcionModoReproduccionC = scan.nextInt();

                            /******************************************************************
                             * 
                             * Modo reproduccion
                             * 
                             ******************************************************************/

                            if (OpcionModoReproduccionC == 1) {

                                RadioTipoC.PlayPlaylist(Playlist);

                            } else if (OpcionModoReproduccionC == 2) {

                                RadioTipoC.ChangeSongForward(Playlist);

                            } else if (OpcionModoReproduccionC == 3) {

                                RadioTipoC.ChangeSongBackwards(Playlist);

                            } else if (OpcionModoReproduccionC == 4) {

                            }

                        }

                    } else if (OpcionRadioC == 3) {

                        int OpcionModoTelefonoC = 0;

                        while (OpcionModoTelefonoC != 5) {

                            UserView.ModoTelefono();
                            OpcionModoTelefonoC = scan.nextInt();

                            if (OpcionModoTelefonoC == 1) {
                                RadioTipoC.ConnectPhone();

                            } else if (OpcionModoTelefonoC == 2) {

                                RadioTipoC.DisconnectPhone();

                            } else if (OpcionModoTelefonoC == 3) {

                                RadioTipoC.ShowContacts(Contacts);

                            } else if (OpcionModoTelefonoC == 4) {

                                RadioTipoC.MakeACall();
                            }

                        }

                    } else if (OpcionRadioC == 4) {

                        int OpcionModoSpecialC = 0;

                        while (OpcionModoSpecialC != 3) {

                            System.out.println("Opciones especiales para carro A");
                            System.out.println("1. Poner llamada en hold");
                            System.out.println("2. Mostrar Pronostico del clima");
                            OpcionModoSpecialC = scan.nextInt();

                            if (OpcionModoSpecialC == 1) {

                                RadioTipoC.Hold();

                            } else if (OpcionModoSpecialC == 2) {
                                RadioTipoC.Weather();
                            }

                        }

                    }

                }

            } else if (opcion == 3) {
                /******************************************************************
                 * 
                 * These options will be all centered around Radio type S
                 * 
                 ******************************************************************/

                // aqui empieza

                int OpcionRadioS = 0;

                while (OpcionRadioS != 5) {

                    UserView.SetRadioMode();
                    OpcionRadioS = scan.nextInt();

                    if (OpcionRadioS == 1) {

                        int OpcionModoRadioS = 0;

                        while (OpcionModoRadioS != 6) {
                            scan = new Scanner(System.in);

                            UserView.ModoRadio();
                            OpcionModoRadioS = scan.nextInt();

                            if (OpcionModoRadioS == 1) {

                                /******************************************************************
                                 * 
                                 * Raise volume
                                 * 
                                 ******************************************************************/

                                RadioTipoS.RaiseVolume(RadioTipoS);

                            } else if (OpcionModoRadioS == 2) {

                                RadioTipoS.LowerVolume(RadioTipoS);

                            } else if (OpcionModoRadioS == 3) {

                                RadioTipoS.ChangeStationUp(RadioTipoS);

                            } else if (OpcionModoRadioS == 4) {
                                RadioTipoS.ChangeStationDown(RadioTipoS);

                            } else if (OpcionModoRadioS == 5) {
                                RadioTipoS.SaveStation(EmisoraList);
                            }

                        }

                    } else if (OpcionRadioS == 2) {

                        int OpcionModoReproduccionS = 0;

                        while (OpcionModoReproduccionS != 5) {
                            scan = new Scanner(System.in);

                            UserView.ModoReproduccion();
                            OpcionModoReproduccionS = scan.nextInt();

                            /******************************************************************
                             * 
                             * Modo reproduccion
                             * 
                             ******************************************************************/

                            if (OpcionModoReproduccionS == 1) {

                                RadioTipoS.PlayPlaylist(Playlist);

                            } else if (OpcionModoReproduccionS == 2) {

                                RadioTipoS.ChangeSongForward(Playlist);

                            } else if (OpcionModoReproduccionS == 3) {

                                RadioTipoS.ChangeSongBackwards(Playlist);

                            } else if (OpcionModoReproduccionS == 4) {

                            }

                        }

                    } else if (OpcionRadioS == 3) {

                        int OpcionModoTelefonoS = 0;

                        while (OpcionModoTelefonoS != 5) {

                            UserView.ModoTelefono();
                            OpcionModoTelefonoS = scan.nextInt();

                            if (OpcionModoTelefonoS == 1) {
                                RadioTipoS.ConnectPhone();

                            } else if (OpcionModoTelefonoS == 2) {

                                RadioTipoS.DisconnectPhone();

                            } else if (OpcionModoTelefonoS == 3) {

                                RadioTipoS.ShowContacts(Contacts);

                            } else if (OpcionModoTelefonoS == 4) {

                                RadioTipoS.MakeACall();
                            }

                        }

                    } else if (OpcionRadioS == 4) {

                        int OpcionModoSpecialS = 0;

                        while (OpcionModoSpecialS != 3) {

                            System.out.println("Opciones especiales para carro A");
                            System.out.println("1. Cambiar a modo audifonos");
                            System.out.println("2. Programar un viaje");
                            OpcionModoSpecialS = scan.nextInt();

                            if (OpcionModoSpecialS == 1) {

                                RadioTipoS.ChangeAuxSource();

                            } else if (OpcionModoSpecialS == 2) {
                                RadioTipoS.PlanTrip();
                            }

                        }

                    }

                }

                // aqui termina

            } else if (opcion == 4) {
                // Exit
            }
        }
    }
}
