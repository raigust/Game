package game;


public class Superman {
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String superman;

    void terbang(){
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Superman terbang...");
        } else {
            System.out.println("Superman gembol: Superman nggak bisa terbang");
        }
    }

    void SupermanBerhenti(){
        if(ketinggian > 0){
            System.out.println("Superman tidak bisa berhenti mendadak saaat terbang");
        } else {
            System.out.println("Superman turun...");
        }
    }

    void SupermanTurun(){ 
        ketinggian--;
        energi--;
        System.out.println("Superman terbang turun");
    }

    void TerbangKanan(){
        energi--;
        System.out.println("Superman terbang belok");
    }
    void TerbangKiri(){
        energi--;
        System.out.println("Superman terbang belok");
    }

    void TerbangMaju(){
        energi--;
        System.out.println("Superman maju ke depan");
        kecepatan++;
    }

    void Moonwalk(){
        energi--;
        System.out.println("Superman terbang mundur");
        kecepatan++;
    }
}
