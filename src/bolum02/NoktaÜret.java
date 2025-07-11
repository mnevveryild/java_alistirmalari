package bolum02;
import java.util.Random;

public class NoktaÜret {
    public static void main(String[] args) {
        // Dikdörtgenin özellikleri
        double width = 100.0;
        double height = 200.0;

        // Dikdörtgenin yarı genişliği ve yarı yüksekliği
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;

        // Rastgele sayı üretici
        Random rand = new Random();

        // -halfWidth ile +halfWidth arasında rastgele x
        double x = -halfWidth + rand.nextDouble() * width;

        // -halfHeight ile +halfHeight arasında rastgele y
        double y = -halfHeight + rand.nextDouble() * height;

        // Sonuçları yazdır
        System.out.printf("Rastgele Nokta: (%.2f, %.2f)%n", x, y);
    }
}
