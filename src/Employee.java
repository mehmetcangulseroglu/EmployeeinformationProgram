public class Employee {
    public String isim;
    public double maas;
    public int calismaSaati,baslamaYili;

    Employee(int baslamaYili,int calismaSaati,double maas,String isim){
        this.isim=isim;
        this.maas=maas;
        this.calismaSaati=calismaSaati;
        this.baslamaYili=baslamaYili;
    }

    public double vergi(){
        if(this.maas>=1000){
            return (maas*0.3)/100;
        }else{
            return 0.0;
        }
    }

    public double bonus(){
        int ekstraCalisma=this.calismaSaati-40;
        if(ekstraCalisma>0){
            return 30*ekstraCalisma;
        }else{
            return 0.0;
        }
    }

    public double maasArtisi(){
        int year =2024-baslamaYili;
        if(year<10){
            return maas*0.5;
        }
        else if(year>=10 && year<20){
            return maas*0.10;
        }else{
            return maas*0.15;
        }
    }
}
