package models;

public class File {

    private String name;
    private String extension;
    private int fileSize;
    private Folder folder;

    public File(){

    }

    public File(String name, String extension, int fileSize, Folder folder){
        this.name = name;
        this.extension = extension;
        this.fileSize = fileSize;
        this.folder = folder;
    }

}
