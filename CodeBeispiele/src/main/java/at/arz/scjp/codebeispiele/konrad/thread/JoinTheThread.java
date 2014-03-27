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
public class JoinTheThread {

    static class JoinerThread extends Thread {

        public int result;

        @Override
        public void run() {
            result = 1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinerThread t = new JoinerThread();
        t.start();
        //Das bedeuted das der akutelle Thread auf das Ausfuehrungsende des "JoinerThread" warten muss
        t.join();
        System.out.println(t.result);
    }
}
