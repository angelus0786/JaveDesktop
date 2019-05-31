package calculadoraastrologica;

import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelus
 */
public class CalculadoraAstrologica {

     public static String op="";
    public static Icon icon1,icon2,icon3,icon4,icon5,icon6,
                       icon7,icon8,icon9,icon10,icon11,icon12;
    public static Icon h0,h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11;
    public static void zodiaco() {
       int dia;
       String mes;
       String meses[]={"Enero","Febrero","Marzo","Abril","Mayo",
                     "Junio","Julio","Agosto","Septiembre","Octubre",
                     "Noviembre","Diciembre"};
       String titulo ="Calculadora de Zodiaco";
    try {
       op=JOptionPane.showInputDialog("Ingresar Dia de Nacimiento");
       dia = Integer.parseInt(op);
       mes=(String)JOptionPane.showInputDialog(null,
               "Ingresar mes de Nacimiento",
                titulo,JOptionPane.QUESTION_MESSAGE,
               null,meses,meses[0]);
            //creacion de iconos    
            
            icon1= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/1.gif"));
            icon2= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/2.gif"));
            icon3= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/3.gif"));
            icon4= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/4.gif"));
            icon5= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/5.gif"));
            icon6= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/6.gif"));
            icon7= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/7.gif"));
            icon8= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/8.gif"));
            icon9= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/9.gif"));
            icon10= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/10.gif"));
            icon11= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/11.gif"));
            icon12= new ImageIcon(CalculadoraAstrologica.class.getResource("/imagen/12.gif"));
            
        switch (mes) {
            case "Enero":    
                if (dia>=21) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon11);//Acuario
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon10);//capricornio
                }
                break;
            case "Febrero":
                if (dia>=19) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon12);//piscis
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon11);//Acuario
                }
                break;
            case "Marzo":
                if (dia>=21) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon1);//Aries
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon12);//piscis
                }
                break;
            case "Abril":
                if (dia>=21) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon2);//Tauro
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon1);//Aries
                }
                break;
            case "Mayo":
                if (dia>=22) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon3);//geminis
                }else{
                   JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon2);//tauro
                }
                break;
            case "Junio":
                if (dia>=22) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon4);//cancer
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon3);//geminis
                }
                break;
            case "Julio":
                if (dia>=23) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon5);//Leo
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon4);//cancer
                }
                break;
            case "Agosto":
                if (dia>=24) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon6);//virgo
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon5);//Leo
                }
                break;
            case "Septiembre":
                if (dia>=24) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon7);//Libra
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon6);//Virgo
                }
                break;
            case "Octubre":
                if (dia>=24) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon8);//Escorpion
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon7);//Libra
                }
                break;
            case "Noviembre":
                if (dia>=23) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon9);//sagitario
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon8);//Escorpion
                }
                break;
            case "Diciembre":
                if (dia>=22) {
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon10);//capricornio
                }else{
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,
                                          icon9);//sagitario
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalida");
        }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo salio Mal","Mensaje de Alerta",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void chino() {
        try {
            int year,y=0;
            String titulo="Horoscopo Chino";
            op=JOptionPane.showInputDialog(null,"Ingresar año");
            year = Integer.parseInt(op); 
            y = year%12;
           
            h0 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/mono.png"));
            h1 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/perro.png"));
            h2 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/chancho.png"));
            h3 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/rata.png"));
            h4 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/bufalo.png"));
            h5 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/tigre.png"));
            h6 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/liebre.png"));
            h7 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/dragon.png"));
            h8 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/serpiente.png"));
            h9 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/caballo.png"));
            h10 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/cabra.png"));
            h11 = new ImageIcon(CalculadoraAstrologica.class.getResource("/chino/cabra.png"));
                        
            switch (y){
                case 0:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h0);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h2);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h3);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h4);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h5);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h6);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h7);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h8);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h9);
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h10);
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null,"",titulo,
                                          JOptionPane.PLAIN_MESSAGE,h11);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Algo salio Mal"+e.getMessage().toString(),
                    "Horoscopo Chino",JOptionPane.WARNING_MESSAGE);
        }
    }
    public static void main(String[] args) {
        Object opcion1;
     do {            
         opcion1 = JOptionPane.showInputDialog(null, "Selecciona una opcion",
                "Calculadora de Horoscopos",JOptionPane.QUESTION_MESSAGE,null,
                new Object[]{"Seleccionar","Zodiaco","Chino","Salir"},"seleccione");
        switch (opcion1.toString()) {
             case "Zodiaco":
                zodiaco();
                break;
             case "Chino":
                chino();
                break;
             case "Salir":
                System.exit(0);
                break;
             case "Seleccionar":
                JOptionPane.showMessageDialog(null, "Selecciona otra opcion.");
                break;
             default:
                 JOptionPane.showMessageDialog(null, "Opcion invalida");
                break;
        }
     
    }while (opcion1!="Salir");
}
    
}
