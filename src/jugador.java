import java.util.Random;

import javax.swing.JPanel;
import java.util.Arrays;

public class jugador {
    private final int TOTAL_CARTAS=10;
    private final int margen=10;
    private final int distancia=50;

    private carta[] carta=new carta[TOTAL_CARTAS];
    private Random r=new Random();

    public void repartir(){
        int i=0;
        for(carta c:carta){
            carta[i++]=new carta(r);
        }
    }

    public void mostrar(JPanel pnl){

        pnl.removeAll();
        int i=0;
        for(carta c:carta){
            c.mostrar(pnl,margen+i*distancia ,margen);
            i++;

    }
    pnl.repaint();
}

public String getgrupos(){
    String mensaje="no se econtraron grupos";
    

    int[] contadores=new int[nombrecarta.values().length];

    for(carta c:carta){
        contadores[c.getnombre().ordinal()]++;
    }

    boolean haygrupos=false;
    for(int i=0; i<contadores.length; i++){
        if(contadores[i]>=2){
            if(!haygrupos){
                haygrupos=true;
                mensaje="los grupos que se encontraron fueron: \n";
            }
            mensaje+=grupo.values()[contadores[i]]+" DE "+nombrecarta.values()[i]+"\n";
        }
    }
    return mensaje;
}
public String getgrupopintaa(){
    String mensaje="no se econtraron grupos";
    

    int[] contadores=new int[pinta.values().length];

    for(carta c:carta){
        contadores[c.getpinta().ordinal()]++;
    }

    boolean haygrupos=false;
    for(int i=0; i<contadores.length; i++){
        if(contadores[i]>=2){
            if(!haygrupos){
                haygrupos=true;
                mensaje="los grupos por igual pinta que se encontraron fueron: \n";
            }
            mensaje+=grupo.values()[contadores[i]]+" DE "+pinta.values()[i]+"\n";
        }
    }
    return mensaje;
}
public String getgrupopinta2(){
    String mensaje="no se econtraron ESCALERAS de TREBOL";
    int aux=0;

    int contrebol[]=new int[nombrecarta.values().length];

    int[] contadores=new int[pinta.values().length];
    
    

    for (int i = 0; i < carta.length; i++) {
        carta c = carta[i];
        contadores[c.getpinta().ordinal()]++;

        if(c.getpinta()==c.getpinta().TREBOL ){
            contrebol[i]=c.getnombre().ordinal();
            

        }
        
        
        
    }
    int cont = 0; 
    

    

    boolean haygrupos=false;
    
        if(contadores[0]>=2){
            Arrays.sort(contrebol);
            


            for(int y=1; y<contrebol.length;y++){
                if(contrebol[y]==contrebol[y-1]+1 ){
                    
                    cont++;
                    haygrupos=true;
                }else {
                   
                    
                
            }

            

            

            

            
            
        }
        if(cont>=2){
                mensaje="HAY ESCALERA DE TREBOL FORMADA POR "+cont+" cartas";

            }
    
}
    return mensaje;
   
}

public String getgrupoDIAMANTE(){
    String mensaje="no se econtraron ESCALERAS de diamante";
    int aux=0;

    int contrebol[]=new int[nombrecarta.values().length];

    int[] contadores=new int[pinta.values().length];
    
    

    for (int i = 0; i < carta.length; i++) {
        carta c = carta[i];
        contadores[c.getpinta().ordinal()]++;

        if(c.getpinta()==c.getpinta().DIAMANTE ){
            contrebol[i]=c.getnombre().ordinal();
            

        }
        
        
        
    }
    int cont = 0; 
    

    

    boolean haygrupos=false;
    
        if(contadores[0]>=2){
            Arrays.sort(contrebol);
            


            for(int y=1; y<contrebol.length;y++){
                if(contrebol[y]==contrebol[y-1]+1 ){
                    
                    cont++;
                    haygrupos=true;
                }else {
                   
                    
                
            }
        }
        if(cont>=2){
                mensaje="HAY ESCALERA DE DIAMANTE FORMADA POR "+cont+" cartas";

            }
    
}
    return mensaje;
   
}
public String getgrupoPICA(){
    String mensaje="no se econtraron ESCALERAS de PICA";
    int aux=0;

    int contrebol[]=new int[nombrecarta.values().length];

    int[] contadores=new int[pinta.values().length];
    
    

    for (int i = 0; i < carta.length; i++) {
        carta c = carta[i];
        contadores[c.getpinta().ordinal()]++;

        if(c.getpinta()==c.getpinta().PICA ){
            contrebol[i]=c.getnombre().ordinal();
            

        }
        
        
        
    }
    int cont = 0; 
    

    

    boolean haygrupos=false;
    
        if(contadores[0]>=2){
            Arrays.sort(contrebol);
            


            for(int y=1; y<contrebol.length;y++){
                if(contrebol[y]==contrebol[y-1]+1 ){
                    
                    cont++;
                    haygrupos=true;
                }else {
                   
                    
                
            }

        }
        if(cont>=2){
                mensaje="HAY ESCALERA DE DIAMANTE FORMADA POR "+cont+" cartas";

            }
    
}
    return mensaje;
   
}
public String getgrupoCORAZON(){
    String mensaje="no se econtraron ESCALERAS de CORAZON";
    int aux=0;

    int contrebol[]=new int[nombrecarta.values().length];

    int[] contadores=new int[pinta.values().length];
    
    

    for (int i = 0; i < carta.length; i++) {
        carta c = carta[i];
        contadores[c.getpinta().ordinal()]++;

        if(c.getpinta()==c.getpinta().CORAZON ){
            contrebol[i]=c.getnombre().ordinal();
            

        }
        
        
        
    }
    int cont = 0; 
    

    

    boolean haygrupos=false;
    
        if(contadores[0]>=2){
            Arrays.sort(contrebol);
            


            for(int y=1; y<contrebol.length;y++){
                if(contrebol[y]==contrebol[y-1]+1 ){
                    
                    cont++;
                    haygrupos=true;
                }else {
                   
                    
                
            }

            
        }
        if(cont>=2){
                mensaje="HAY ESCALERA DE CORAZON FORMADA POR "+cont+" cartas";

            }
    
}
    return mensaje;
   
}



public String puntaje(){
    String mensaje="no se econtraron grupos";

    int[] contadores=new int[nombrecarta.values().length];
    

    for(carta c:carta){
        contadores[c.getnombre().ordinal()]++;
        
    }

    boolean haygrupos=false;
    
    int valorCarta=0;
    int puntajeTotal=0;
    for(int i=0; i<contadores.length; i++){
        if(contadores[i]==1){
            if(!haygrupos){
                haygrupos=true;
                mensaje="las cartas sin grupo son: ";
    


                
            }
            
            switch (nombrecarta.values()[i]) {
                case TRES:


                    valorCarta = 3;
                    break;
                case AS:
                case DIEZ:
                case JACK:
                case QUEEN:
                case KING:
                    valorCarta = 10;
                    break;
                case CUATRO:
                    valorCarta = 4;
                    break;
                case CINCO:
                    valorCarta = 5;
                    break;
                case SEIS:
                    valorCarta = 6;
                    break;
                case SIETE:
                    valorCarta = 7;
                    break;
                case OCHO:
                    valorCarta = 8;
                    break;
                case NUEVE:
                    valorCarta = 9;
                    break;
            
            }
            
            puntajeTotal += valorCarta;

            valorCarta=0;
            
            
             
             mensaje = "el puntaje de las cartas que no estan en grupo por nombre es: " + puntajeTotal;
             

        
        }
        
        
        
        
    }
    return mensaje;
    



}


        
        
    
        
        
        
    
    

    
   
    
    



}

