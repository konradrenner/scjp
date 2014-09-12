/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.scjp.library;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Konrad Renner
 */
public class ParameterComposite {
    
    private Collection<LibraryKlasse> klassen;
    
    public ParameterComposite(String... params) {
        klassen = new ArrayList<>(params.length);
        
        for (String param : params) {
            klassen.add(new LibraryKlasse(param));
        }
    }

    @Override
    public String toString() {
        return "ParameterComposite{" + "parameter=" + klassen + '}';
    }

}
