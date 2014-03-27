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
package at.arz.scjp.codebeispiele.konrad.thread;

/**
 *
 * @author Konrad Renner
 */
public class WaitingAndNotify {

    static final Monitor MONITOR = new Monitor();

    public static void main(String[] args) {
        new Thread(new Max()).start();
        new Thread(new Moritz()).start();
    }
}

class Monitor {

    int zahl = 10;
    boolean wegnehmen = true;

    public synchronized void machWas() {
            if (wegnehmen) {
                zahl--;
            } else {
                zahl++;
            }

            if (zahl == 0) {
                try {
                    wegnehmen = false;
                    wait();
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (zahl == 11) {
                wegnehmen = true;
                notify();
            }

    }
}

class Max implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            WaitingAndNotify.MONITOR.machWas();

            System.out.println("Aktueller Thread:" + toString() + "; zahl:" + WaitingAndNotify.MONITOR.zahl);
        }
    }

    @Override
    public String toString() {
        return "I bin da Max";
    }
}

class Moritz implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            WaitingAndNotify.MONITOR.machWas();

            System.out.println("Aktueller Thread:" + toString() + "; zahl:" + WaitingAndNotify.MONITOR.zahl);
        }
    }

    @Override
    public String toString() {
        return "I bin da Moritz";
    }
}
