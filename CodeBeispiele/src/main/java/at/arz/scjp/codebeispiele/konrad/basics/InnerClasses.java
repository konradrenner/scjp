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
package at.arz.scjp.codebeispiele.konrad.basics;

/**
 *
 * @author Konrad Renner
 */
public class InnerClasses {

    private int x;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker inneres = new InnerClasses().new InnerClass();
        inneres.doSomething();

        int y = 10;
        final int finalesy = y;
        Worker anonym = new Worker() {
            @Override
            public void doSomething() {
                //Geht nicht, da y final sein muesste!
                //System.out.println("Arno Nym:"+y);
                System.out.println("Arno Nym:" + finalesy);
            }
        };

        anonym.doSomething();

        new InnerClasses().anDieArbeit();
    }

    void anDieArbeit() {
        new Worker() {
            @Override
            public void doSomething() {
                System.out.println("Ich arbeite:" + x);
                System.out.println("Ich arbeite:" + ++x);
                System.out.println("Ich arbeite:" + x++);
                System.out.println("Ich arbeite:" + neuesX());
            }

            int neuesX() {
                System.out.println("Generiere neues x");
                return x + 100;
            }
        }.doSomething();
    }

    class InnerClass implements Worker {

        @Override
        public void doSomething() {
            x = 9;
            hallo();
        }

        private void hallo() {
            System.out.println("hallo:" + x);
        }
    }
}

interface Worker {

    public void doSomething();
}
