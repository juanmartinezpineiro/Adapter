/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadores;

/**
 *
 * @author Juan Martínez
 */
public class MP3 implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing MP4 File " + filename);

    }
    
}
