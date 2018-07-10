package models;

import java.util.List;

public class Folder {

    private String title;
    private List<File> files;

    public Folder(){

    }

    public Folder(String title){
        this.title = title;

    }
}
