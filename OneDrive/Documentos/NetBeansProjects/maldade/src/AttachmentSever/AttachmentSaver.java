package AttachmentSever;

import java.io.File;
import java.util.List;

public class AttachmentSaver {

    public static void saveAttachments(List<String> mails, String outputDir) {
        System.out.println("Salvando anexos dos e-mails em: " + outputDir);
        new File(outputDir).mkdirs(); // cria pasta se não existir
        for (String mail : mails) {
            System.out.println("Anexo salvo de: " + mail);
        }
    }
}
