import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class carta {

    private int indice;

    public carta(Random r){

        indice=r.nextInt(52)+1;

    }


    public void mostrar(JPanel pnl, int x,int  y){
        String nombreimagen="/imagenes/CARTA"+String.valueOf(indice+".jpg");
        ImageIcon imagen=new ImageIcon(getClass().getResource(nombreimagen));

        JLabel lbl=new JLabel(imagen);
        lbl.setBounds(x,y,imagen.getIconWidth(), imagen.getIconHeight());
        pnl.add(lbl);


    }

    public pinta getpinta(){

        if(indice<=12)
        return pinta.TREBOL;
        else if(indice<=26)
        return pinta.PICA;
        else if(indice<=39)
        return pinta.CORAZON;
        else
        return pinta.DIAMANTE;


    }

    public nombrecarta getnombre(){
        int residuo=indice % 13;
        if(residuo==0)
        residuo=13;
        return nombrecarta.values()[residuo-1];


    }

}
