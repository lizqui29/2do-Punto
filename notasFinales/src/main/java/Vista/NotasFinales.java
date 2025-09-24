/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import Modelo.Aprobadas;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */

public class NotasFinales {

    public static Aprobadas[] aprobadas = new Aprobadas[5];

    public static void main(String[] args) {

        for (int i = 0; i < aprobadas.length; i++) {
            double notas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la definitiva: "));
            aprobadas[i] = new Aprobadas(notas);
        }
        
        int contadorAprobadas = 0;
        for (int i = 0; i < aprobadas.length; i++) {
            if (aprobadas[i].getNotas() >= 3.0) {
                contadorAprobadas++;
            }
    }

JOptionPane.showMessageDialog(null, " Cantidad de notas mayores o iguales a 3.0: " + contadorAprobadas);
    }
}
