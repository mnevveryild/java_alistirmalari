package ENUM;

//“belli sayıda, sabit seçenek” varsa, enum kullanılır.

enum TrafikLambası{
    KIRMIZI,
    SARI,
    YESIL
}

// Metot olarakta kullanılabilir.
enum Seviye{

    KOLAY(1),
    ORTA(2),
    ZOR(3);

    private int seviyeKodu;

    Seviye(int kod){
        this.seviyeKodu = kod;
    }
    public int getKod(){
        return seviyeKodu;
    }
}

enum Gun{
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
}

public class Main {

    public static void main(String[] args) {
        TrafikLambası lamba = TrafikLambası.KIRMIZI;

        if (lamba == TrafikLambası.KIRMIZI) {

            System.out.println("Dur!");
        } else if (lamba == TrafikLambası.SARI) {
            System.out.println("Hazır ol!");
        } else if (lamba == TrafikLambası.YESIL) {
            System.out.println("Geç!");
        }

        Gun bugun = Gun.SALI;
        switch (bugun){
            case CUMA:
                System.out.println("Haftasonu geldi");
                break;
            case PAZAR:
                System.out.println("Hafta bitti tatildeyiz :)");
                break;
            default:
                System.out.println("Çalışma günü :(");
        }

        Seviye secilen = Seviye.ZOR;
        System.out.println("Zorluk kodu: " + secilen.getKod());
    }
}
