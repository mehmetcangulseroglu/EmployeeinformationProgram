public class Empdriver {
    public static void main(String[] args) {
        //1.çalışan için hesap
        Employee emp1=new Employee(1985,45,2000,"Mehmet Can Gülseroğlu");
        System.out.println("MÜDÜR=MEHMET CAN GÜLSEROĞLU");
        System.out.println("Maaş : "+emp1.maas);
        System.out.println("Bonus : "+emp1.bonus());
        System.out.println("Maaş artışı : "+emp1.maasArtisi());

        double toplamArtis=emp1.maas-emp1.vergi()+ emp1.bonus();

        System.out.println("vergi ve bonuslarla birlikte toplam maaş : "+toplamArtis);
        System.out.println("maaş artışı ile birlikte maaş : "+(emp1.maas+emp1.maasArtisi()));

        System.out.println();

        //2.çalışan için hesap........
        Employee emp2=new Employee(1990,39,4000,"Ayşe Parlak");
        System.out.println("YÖNETİCİ=AYŞE PARLAK");
        System.out.println("Maaş : "+emp2.maas);
        System.out.println("Bonus : "+emp2.bonus());
        System.out.println("Maaş artışı : "+emp2.maasArtisi());

        double toplamArtis2=emp2.maas-emp2.vergi()+ emp2.bonus();

        System.out.println("vergi ve bonuslarla birlikte toplam maaş : "+toplamArtis2);
        System.out.println("maaş artışı ile birlikte maaş : "+(emp2.maas+emp2.maasArtisi()));
    }
}