package persona;

public class Dipendente extends Persona{
    private int annoAssunzione;
    private double stipendio;

    //Costruttori
    public Dipendente(String nome, String indirizzo, int annoAssunzione, double stipendio) {
        super(nome, indirizzo);
        this.annoAssunzione = annoAssunzione;
        this.stipendio = stipendio;
    }
    public Dipendente() {
        this("Non inserito","Non inserito",0,0.0);
    }

    //Get e set
    public int getAnnoAssunzione() { return annoAssunzione; }
    public void setAnnoAssunzione(int annoAssunzione) { this.annoAssunzione = annoAssunzione; }

    public double getStipendio() { return stipendio; }
    public void setStipendio(double stipendio) { this.stipendio = stipendio; }

    @Override
    public void visualizza(){
        super.visualizza();
        System.out.println("Stipendio: "+this.stipendio+" Anno d'assunzione: "+this.annoAssunzione);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Dipendente){
            Dipendente r= (Dipendente) obj;
            return super.equals(r) && r.getStipendio() == this.stipendio && r.getAnnoAssunzione() == this.annoAssunzione;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" Stipendio: "+this.stipendio+" Anno d'assunzione: "+this.annoAssunzione;
    }

    public boolean guadagnaPiuDi(Dipendente dipendente){
        return this.stipendio > dipendente.getStipendio();
    }
}
