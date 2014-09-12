/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.scjp.library;

/**
 *
 * @author Konrad Renner
 */
public class LibraryKlasse {

    private final String name;

    public LibraryKlasse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LibraryKlasse{" + "name=" + name + '}';
    }

}
