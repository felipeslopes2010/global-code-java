
import java.io.Console;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFiltros {

    public static void main(String args[]) throws IOException {
        Console console = System.console();
        System.out.println("Digite o Diretorio");
        String nomediretorio = console.readLine();
        System.out.println("Digite a extensao");
        String extensao = console.readLine();
        Path diretorio = Paths.get(nomediretorio, extensao);
        
        if (Files.isDirectory(diretorio)) {
            // Gera uma lista de arquivos com a extensão desejada
            try (DirectoryStream<Path> arquivos
                    = Files.newDirectoryStream(diretorio, "*." + extensao)) {

                System.out.println("Lista de arquivos com a extensao :"
                        + extensao);
                for (Path arquivo : arquivos) {
                    System.out.println(arquivo.getFileName());
                }
            } //try-with-resources
        } else {
            System.out.println("Nao é um diretorio");
        }
    }
}
