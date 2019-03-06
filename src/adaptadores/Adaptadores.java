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
public class Adaptadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediaPlayer player = new MP3(); //Instanciamos objeto del tipo MP3 que tiene como interfaz MediaPlayer
        player.play("file.mp3");  // Como es normal puede hacer el play del propio ojbeto
        player = new FormatAdapter(new MP4()); //Ahora introducimos en player el format adapter de abajo con la clase MP4
        player.play("file.mp4");  //Al tener player el metodo play de la interfaz MediaPlayer, ejecutamos el play aunque sea MP4
        player = new FormatAdapter(new VLC());
        player.play("file.avi");  //Aquí hacemos lo mismo de arriba pero con VLC
    }

    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media;

        public FormatAdapter(MediaPackage m) {
            media = m; // creamos variable del constructor.
        }

        @Override
        public void play(String filename) {   //creanos un metodo para play
            System.out.print("Using Adapter --> ");
            media.playFile(filename); // 
        }
    }
    
}
