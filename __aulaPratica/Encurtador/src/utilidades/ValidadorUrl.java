package utilidades;

import java.net.URI;
import java.net.URL;

public class ValidadorUrl {

    public static boolean isLinkValido(String urlStr) {
        if (urlStr == null || urlStr.trim().isEmpty()) {
            return false;
        }

        String link = urlStr.trim();

        // Adiciona https:// caso o usuário tenha omitido o protocolo
        if (!link.startsWith("http://") && !link.startsWith("https://")) {
            link = "https://" + link;
        }

        try {
            // 1. Verifica se a estrutura geral e os caracteres da URL são válidos
            URL url = new URI(link).toURL();
            String host = url.getHost();

            // 2. Garante que existe um domínio e que ele possui pelo menos um ponto (ex: site.com)
            if (host == null || host.isEmpty() || !host.contains(".")) {
                return false;
            }

            // 3. Evita casos inválidos como "https://.com" ou "https://site."
            if (host.startsWith(".") || host.endsWith(".")) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
