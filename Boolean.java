public class Boolean {

    public static void main(String[] args) {


        int[] sayilar = new int[]{0,1,2,3,4,5,6,7,8,9};

        int aranacak = 5;

        boolean varMi = false;

        for(int sayi : sayilar) {

            if(sayi==aranacak) {
                varMi = true;

            break;
        }
        }
    if(varMi) {

        System.out.println("SAYI MEVCUTTUR.");
    }
else {

    System.out.println("SAYI MEVCUT DEĞİLDİR.");
    }
    }


}
