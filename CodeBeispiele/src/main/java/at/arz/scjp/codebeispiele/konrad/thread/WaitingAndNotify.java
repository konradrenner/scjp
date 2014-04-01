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
 * Ein Beispiel das wait und notify demonstiert. Diese Methoden machen nur in einem synchronized Block Sinn! Da es bei
 * den Methoden um die Lock-Verwaltung von Threads geht!
 * 
 * @author Konrad Renner
 */
public class WaitingAndNotify {

	static final Monitor MONITOR = new Monitor();

	public static void main(String[] args) {
		new Max().start();
		new Moritz().start();
	}
}

class Monitor {

	int zahl = 10;
	boolean wegnehmen = true;

	public synchronized void machWas() {
		System.out.println("Starte mit Thread:" + Thread.currentThread().toString() + "; zahl:" + zahl);
		for (int i = 0; i < 12; i++) {
			System.out.println("Aktueller Thread:" + Thread.currentThread().toString() + "; zahl:" + zahl + "; i:" + i);
			System.out.println("wegnehmen:" + wegnehmen);
			if (wegnehmen) {
				zahl--;
			} else {
				zahl++;
			}

			System.out.println("zahl:" + zahl);
			if (zahl == 0) {
				try {
					wegnehmen = false;
					System.out.println("" + Thread.currentThread().toString() + ": Ich muss warten");
					// Der Thread wartet jetzt, bis er von einem anderen Thread mittels notify bzw. notifyAll
					// "aufgeweckt" wird
					wait();
				} catch (InterruptedException ex) {
					System.err.println(ex.getMessage());
				}
			} else if (zahl == 10) {
				wegnehmen = true;
				System.out.println("" + Thread.currentThread().toString() + ": Jetzt darf der andere wieder");
				// Wuerde man hier das notifyAll oder notify nicht machen, wuerde der andere Thread "ewig" warten. Dh
				// der andere Thread macht nicht von selbst weiter
				// Unterschied notify und notifAll: Bei notify gibt die JVM genau 1 Thread bescheid das er weiter machen
				// kann, es ist nicht garantiert, welcher Thread das ist und kann in bestimmten Situationen zu Deadlocks
				// fuehren!
				notifyAll();
				break;
			}
		}
	}
}

class Max
		extends Thread {

	@Override
	public void run() {

		WaitingAndNotify.MONITOR.machWas();

		System.out.println(toString() + ": Habe meine Arbeit getan");
		System.out.println(toString() + ": Shutdown gestartet");
		System.out.println(toString() + ": Gute Nacht");
	}

	@Override
	public String toString() {
		return "I bin da Max";
	}
}

class Moritz
		extends Thread {

	@Override
	public void run() {
		WaitingAndNotify.MONITOR.machWas();

		System.out.println(toString() + ": Habe meine Arbeit getan");
		System.out.println(toString() + ": Shutdown gestartet");
		System.out.println(toString() + ": Gute Nacht");
	}

	@Override
	public String toString() {
		return "I bin da Moritz";
	}
}
