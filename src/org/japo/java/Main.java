/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        
        //Constantes
        final int DIAS_MAX_DESCUENTO = 30;
        final int DESCUENTO_MULTA = 20;
        final double IMPORTE_MULTA = 60;
        
        //Variables
        int nDiasMulta;
        double impaPagar;
        double dTo = 0;
        boolean test;
        
        //Cabecera
        System.out.println("Alternativa de Multa");
        System.out.println("====================");
        
        //EntradaUsuario
        System.out.print("Días de demora ...........:");
        nDiasMulta = SCN.nextInt();
        
        //Operaciones
        test = nDiasMulta <= DIAS_MAX_DESCUENTO;
        
        if (test) {
            dTo = IMPORTE_MULTA * DESCUENTO_MULTA / 100;
        }
        
        impaPagar = IMPORTE_MULTA - dTo;
        
        //Mensajes
        System.out.println("---");
        System.out.printf("%s %.2f €%n", "Importe inicial multa ....:", IMPORTE_MULTA);
        
    }

}
