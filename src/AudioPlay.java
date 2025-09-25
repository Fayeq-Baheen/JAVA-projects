import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlay {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        Scanner in = new Scanner(System.in);

        File file = new File("Audio.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(ais);
        clip.start();

        String response = "";
        while(response != "Q"){
            System.out.println("Enter S: Start\tP: Pause\tR: Restart\tQ: Quit");
            response = in.next();
            switch (response.toUpperCase()){
                case "S": clip.start();
                    break;
                case "P": clip.stop();
                    break;
                case "R": clip.setMicrosecondPosition(0);
                    break;
                case "Q": clip.close();
                    break;
                default: System.out.println("Invalid Choice!");
            }
        }
        System.out.println("The file has closed.");

    }
}
