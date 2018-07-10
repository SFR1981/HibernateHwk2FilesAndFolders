import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

import static db.DBFolder.getFilesForFolder;

public class Runner {


    public static void main(String[] args) {

        Owner owner1 = new Owner("Bazza", "Barry");
        Owner owner2 = new Owner("Gazza", "Garry");
        DBHelper.save(owner1);
        DBHelper.save(owner2);

        Folder folder1 = new Folder ("Documents",owner1);
        DBHelper.save(folder1);
        Folder folder2 = new Folder ("Downloads", owner2);
        DBHelper.save(folder2);
        File file1 = new File("word", "doc", 123, folder1);
        File file2 = new File("book", "pdf", 1223, folder1);
        File file3 = new File("presentation", "ppt", 15923, folder2);
        File file4 = new File("StarKTrek", "mp4", 12553, folder2);
        DBHelper.save(file1);
        DBHelper.save(file2);
        DBHelper.save(file3);
        DBHelper.save(file4);

        List<File> allFiles = DBHelper.getAll(File.class);



        List<Folder> allFolders = DBHelper.getAll(Folder.class);

        file1.setExtension("pages");
        DBHelper.update(file1);

        folder1.setTitle("Fiction");
        DBHelper.update(folder1);

        List<File> filesInFolder2 = DBFolder.getFilesForFolder(folder2);



        List<Folder> folderForOwner1 = DBOwner.getFoldersForOwner(owner1);

        List<Folder> folderForOwner2 = DBOwner.getFoldersForOwner(owner2);



    }
}
