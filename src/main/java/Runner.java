import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {


    public static void main(String[] args) {
        Folder folder1 = new Folder ("Documents");
        DBHelper.save(folder1);
        Folder folder2 = new Folder ("Downloads");
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





    }
}
