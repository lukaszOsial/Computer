package file.imagefile;

public class JPGImageFile extends AbstractImageFile{
    private int compression;
    
    public int getCompression() {
        return compression;
    }
    
    public JPGImageFile(String name, int size, int compression) {
        super(name,size);
        this.compression = compression;
    }
    
    public void displayImage() {
        System.out.println("Displaying JPG");
    }
    
}
