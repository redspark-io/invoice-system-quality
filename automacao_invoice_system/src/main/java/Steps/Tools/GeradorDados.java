package Steps.Tools;

import java.util.Random;
public class GeradorDados {
    //Gerador de Nome aleatório
    public static String gerarNomeAleatorio() {
        String[] letras = {"a", "b", "c", "d", "1", "2", "3", "4", "R", "r", "x"};
        String nomeFinal = "Automação ";

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int pos = random.nextInt(letras.length);
            nomeFinal = nomeFinal.concat(letras[pos]);
        }
        return nomeFinal;
    }

    public static String gerarIdAleatorio() {
        Random random = new Random();
        int id = random.nextInt(10000);
       return String.valueOf(id);
    }
}
