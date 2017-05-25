
package corsa;

/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    public boolean via = false;
    private Pista pista;
    private String vincitore = "";
    
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        Atleta a1 = new Atleta("Mario",this.pista.icoAtleta1,this);                                       
        Atleta a2 = new Atleta("Broswer",this.pista.icoAtleta2,this);
        Atleta a3 = new Atleta("Karim",this.pista.icoAtleta3,this);
        Atleta a4 = new Atleta("Usain",this.pista.icoAtleta4,this);
        Atleta a5 = new Atleta("Michael",this.pista.icoAtleta5,this);
        Atleta a6 = new Atleta("Dimitrof",this.pista.icoAtleta6,this);
        Atleta a7 = new Atleta("Raily",this.pista.icoAtleta7,this);
        Atleta a8 = new Atleta("Giasuun",this.pista.icoAtleta8,this);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
        a7.start();
        a8.start();
        this.via=true;
        //notifyAll();
        this.pista.statoGara.setText("Gara iniziata");
        try{
            a1.join();
            a2.join();
            a3.join();
            a4.join();
            a5.join();
            a6.join();
            a7.join(); 
            a8.join();
        }
        catch(Exception e){
            
        }
        this.pista.statoGara.setText("Gara conclusa, ha vinto "+this.getVincitore());
    }
    
    synchronized public void hoFinito(String nomeAtleta){
        if(this.vincitore==""){
            this.vincitore = nomeAtleta;
        }
    }
    
    public String getVincitore(){
        return this.vincitore;
    }
}
