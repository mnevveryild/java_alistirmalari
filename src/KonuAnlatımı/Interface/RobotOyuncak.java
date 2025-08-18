package Interface;

class RobotOyuncak implements Oyuncak{


    @Override
    public void sesCikar() {

        System.out.println("Bip bip");
    }

    @Override
    public void hareketEt() {
        System.out.println("Tekerleklerle ilerliyor");
    }

    @Override
    public void isikVer() {
        System.out.println("Led ışıkları yanıyor.");

    }
}
