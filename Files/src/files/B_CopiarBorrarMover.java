package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class B_CopiarBorrarMover {

    public static void main(String[] args) throws IOException {

        /*
        Para probar el funcionamiento de esta clase borra del directorio "ficheros"
        el archivo fichero.txt y comentar las lineas de codigo porque si no se hace el copiado y borrado
        instantaneo.
         */


        //Creamos una ruta para crear un fichero
        Path p = Paths.get("ficheros", "fichero.txt");

        //Creamos un fichero, y abrimos el flujo de texto para escribir
        BufferedWriter bw = Files.newBufferedWriter(p);
        bw.write("Curso de Java 8 para programadores Java en www.openwebinars.net");
        bw.close();

        //Copiamos el fichero
        Path copia = Paths.get("ficheros", "fichero_copiado.txt");
        Files.copy(p, copia, StandardCopyOption.REPLACE_EXISTING);

        //Lo movemos fuera del directorio
        Files.move(copia, Paths.get("copiado", "copiado.txt"), StandardCopyOption.REPLACE_EXISTING);

        //Lo eliminamos
        Files.deleteIfExists(Paths.get("copiado", "copiado.txt"));




    }
}
