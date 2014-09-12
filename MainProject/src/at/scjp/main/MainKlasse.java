/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.scjp.main;

import at.scjp.library.ParameterComposite;

/**
 *
 * @author Konrad Renner
 */
public class MainKlasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------- Parameter ------------");

        System.out.println(new ParameterComposite(args).toString());

        System.out.println("----------- Parameter ------------");
        
        System.out.println(System.getProperties());
    }

}
