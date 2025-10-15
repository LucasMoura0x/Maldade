package OutlookService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OutlookService {

    public static List<String> getMailItems(LocalDateTime start, LocalDateTime end, String[] included, String[] excluded) {
        System.out.println("Simulando busca de e-mails de " + start + " até " + end);
        // Simulação: retorna uma lista com e-mails falsos
        List<String> mails = new ArrayList<>();
        mails.add("Email 1 - Projeto A3 Una");
        mails.add("Email 2 - Relatório");
        return mails;
    }

    public static void deleteMails(LocalDateTime start, LocalDateTime end, String[] included, String[] excluded) {
        System.out.println("Simulando exclusão de e-mails de " + start + " até " + end);
        // Simulação: apenas imprime ação
    }
}
