import org.w3c.dom.DocumentType;

import java.io.File;

public class UploadManager {

    UploadManager(){
        AuthorisationMangager authorisationMangager = new AuthorisationMangager(user);
    }
    // Factory
    public void uploadFile(String fileFormat, String s3Key, Organisation org){

        File file = null;
        switch (fileFormat){
            case ".pdf":
                file = new DocumentType();

        }

        file.uploadFile();

    }
    public static void main(String[] args) {


    }
}
