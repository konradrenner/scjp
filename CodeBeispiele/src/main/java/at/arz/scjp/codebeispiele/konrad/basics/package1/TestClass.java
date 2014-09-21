/*
 * Copyright (C) 2014 Konrad Renner
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.arz.scjp.codebeispiele.konrad.basics.package1;

/**
 *
 * @author Konrad Renner
 */
public class TestClass {

    void doSomething() {
        System.out.println("TestClass");
    }

    private void irgendwas() {
        System.out.println("irgendwas");
    }

    public static final void main(String[] args) {
        TestClass tc = new Testing();
        tc.doSomething();

        TestClass tc2 = new at.arz.scjp.codebeispiele.konrad.basics.package2.Testing2();
        tc2.doSomething();

        TestClass tc3 = new TestClass().new Irgendwo();
        tc3.irgendwas();
    }

    class Irgendwo extends TestClass {

        private void irgendwas() {
            System.out.println("irgendwo");
        }
    }
}

class Testing extends TestClass {

    @Override
    void doSomething() {
        super.doSomething(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Testing");
    }

}
