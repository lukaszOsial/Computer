package computer;

import computer.drive.Drive;
import computer.drive.HDDDrive;
import file.File;
import file.imagefile.GIFImageFile;
import file.imagefile.JPGImageFile;
import file.musicfile.MP3MusicFile;


public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("gif1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("jpg1.jpg", 200, 80);
        
        MP3MusicFile mp3File = new MP3MusicFile("plik.mp3", 10, "zespol", "tytul", 100);
        
        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3File);
        
        drive.listFiles();
        
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());
    }
    
}
