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
public class VLC implements MediaPackage{

    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);

    }
    
}
