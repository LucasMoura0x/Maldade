package maldade;

import java.io.File;
import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;
import java.util.List;

// Classes fictícias para representar o OutlookService e o AttachmentSaver
import AttachmentSever.AttachmentSaver;
import OutlookService.OutlookService;
import PopUps.PopUps;
import javax.swing.SwingUtilities;

public class Program {

    public static void main(String[] args) {
        saveAttachments();
        deleteMails();
    }

    public static void saveAttachments() {
        long startTime = System.currentTimeMillis(); // Inicia cronômetro

        String[] excluded = null; // Lista de e-mails a excluir (ainda não usada)
        String[] included = null; // Lista de e-mails a incluir (ainda não usada)

        LocalDateTime startDate = LocalDateTime.now().minusDays(3);
        LocalDateTime endDate = LocalDateTime.now();

        // Busca e-mails entre as datas informadas
        List<String> mails = OutlookService.getMailItems(startDate, endDate, included, excluded);

        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println(mails.size() + " e-mails filtrados em " + elapsed + " ms");

        // Define diretório de saída
        String outputDir = new File(".").getAbsolutePath() + File.separator + "Attachments";

        // Salva os anexos
        AttachmentSaver.saveAttachments(mails, outputDir);

        long totalElapsed = System.currentTimeMillis() - startTime;
        System.out.println("Anexos salvos em " + totalElapsed + " ms");
        System.out.println("Anexos salvos em: " + outputDir);
    }

    public static void deleteMails() {
        long startTime = System.currentTimeMillis();

        String[] excluded = null;
        String[] included = {"Projeto A3 Una"};

        LocalDateTime startDate = LocalDateTime.now().minusYears(-2);
        LocalDateTime endDate = LocalDateTime.now();

        OutlookService.deleteMails(startDate, endDate, included, excluded);

        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("E-mails excluídos em " + elapsed + " ms");
    }

    public static void PopUps() {
        SwingUtilities.invokeLater(() -> new PopUps("ricardo_milos.png"));

    }
}
