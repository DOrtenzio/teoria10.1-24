package persona;

public class UsaDipendente {
    public static void main(String [] args){
        Dipendente d1=new Dipendente("Giovanni","VCO, via hhjgj 89",2010,1500.0);
        Dipendente d2=new Dipendente("Marcolino","VCO, via cfgcfgc 99",2020,1780.0);
        Dipendente d3=new Dipendente("Tiziano","VCO, via vvhgh 88",1999,1780.50);

        if (d1.guadagnaPiuDi(d2) && d1.guadagnaPiuDi(d3)){
            System.out.println("1- "+d1);
            if (d2.guadagnaPiuDi(d3)) {
                System.out.println("2- " + d2);
                System.out.println("3- " + d3);
            }else{
                System.out.println("2- " + d3);
                System.out.println("3- " + d2);
            }
        } else if (d2.guadagnaPiuDi(d1) && d2.guadagnaPiuDi(d3)){
            System.out.println("1- "+d2);
            if (d1.guadagnaPiuDi(d3)) {
                System.out.println("2- " + d1);
                System.out.println("3- " + d3);
            }else{
                System.out.println("2- " + d3);
                System.out.println("3- " + d1);
            }
        } else {
            System.out.println("1- "+d3);
            if (d1.guadagnaPiuDi(d2)) {
                System.out.println("2- " + d1);
                System.out.println("3- " + d2);
            }else{
                System.out.println("2- " + d2);
                System.out.println("3- " + d1);
            }
        }
    }
}
