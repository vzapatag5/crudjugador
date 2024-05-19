/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projugador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class Projugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciar objeto del formulario formJugador
        formJugador player = new formJugador();
        player.setVisible(true);
        Jugador jugador = new Jugador();
        
        // TODO code application logic here
    }
    
}
