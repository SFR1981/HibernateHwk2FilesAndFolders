package models;


import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    private int id;
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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "name")
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    @Column(name = "extension")
    public String getExtension(){
        return this.extension;
    }

    public void setExtension(String extension){
        this.extension = extension;
    }

    @Column(name = "file_size")
    public int getFileSize(){
        return this.fileSize;
    }

    public void setFileSize(int size){
        this.fileSize = size;
    }


    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    public Folder getFolder(){
        return this.folder;
    }

    public void setFolder(Folder newFolder){
        this.folder = newFolder;
    }




}
