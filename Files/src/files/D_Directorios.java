package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D_Directorios {

    public static void main(String[] args) throws IOException {

        /*
        Acordarse de borrar el directorio creado.
         */

        Files.createDirectory(Paths.get("ficheros", "subdir2"));

        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("ficheros"));

        for(Path p : directoryStream)
            System.out.println(p.getFileName());

    }
}
