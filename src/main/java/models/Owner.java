package models;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "owners")
public class Owner {

     private int id;
     private String username;
     private String name;
     private List<Folder> folders;


     public Owner(){

     }

     public Owner(String username, String name){
         this.username = username;
         this.name = name;
     }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "username")
    public String getUsername(){
         return this.username;
    }


    public void setUsername(String newUsername){
         this.username = newUsername;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY )
    public List<Folder> getFolders(){
         return folders;
    }

    public void setFolders(List<Folder> folders){
         this.folders = folders;
    }






}
