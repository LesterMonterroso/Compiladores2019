/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador_.lester_monterroso;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author Lester Monterroso
 */

class funciones{
 int t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0,t13=0,t14=0,t15=0,t16=0,t17=0,t18=0,t19=0;
 int t100=0,t101=0,t102=0,t103=0,t104=0,t105=0,t106=0,t107=0,t108=0,t109=0,t110=0,t111=0;
 int controllinea=1;
 char este;
 String Reservada1 = "Proc";
 String Reservada2 = "Impresion";
 String Reservada3 = "Lectura";
 String Reservada4 = "cadena";
 String Reservada5 = "entero";
 String Reservada6 = "real";
 String Reservada7 = "si";
 String Reservada8 = "sino";
 String Reservada9 = "finsi";
 String Reservada10 = "Principal";
 String Reservada11 = "entonces";
 String Reservada12 = "metodo";
 String lexema2="";
    int t=0;
    int v=0;
    int linea=0;
 int siguiente =0;
   char b;
   boolean ultimo=false;
   char vacio;
   boolean temporal=true;
   int Estado;
   int valor=0;
   String cadena;
   boolean termino = true;
   int Token;
   int error;
   String cadena1;
   String lexema;
    String lexema1="";
   public int salto =0;
   public int sangrado=0;
   String cadena2;
   int actual=0;
    int j=0;
   char[][] c = new char [100][100000];
    public static final char NULO= '\0';
    public static final char EOF = '\n';
    public static char car = NULO ;
   int i =0;
  public void leerCar(){
     String lugar="";
       FileReader fr = null;
        BufferedReader bf = null;
        File archivo = null;
        FileReader leer = null;
        BufferedReader leerd = null;
        File midireccion = null;
        try{
        midireccion= new File("ruta.txt");
        leer = new FileReader(midireccion);
            leerd = new BufferedReader(leer);
            lugar =leerd.readLine();
        
        }catch (Exception ex){} 
        
        
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(lugar);
            fr = new FileReader(archivo);
            bf = new BufferedReader(fr);
                    
           cadena=bf.readLine();
          
           
           while (cadena!=null){
             
              for (int x=0;x<cadena.length();x++){
              vacio=((char)cadena.charAt(x));  
        if (cadena.charAt(x)=='%'){
           break;
           
           }else{
             
              c[v][i]=((char)cadena.charAt(x));  i++;   
        }
           } 
            t++;
              v++;
              i=0;
          
              linea++;
          cadena =bf.readLine();
             
       
           }
           
     fr.close();
          bf.close();
     
     } catch (Exception e) {
          System.out.println("El archivo no se pudo abrir");
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
   
   
    if (valor ==-1){
                
               termino=false;
               
               } 
   
   
   
   
   
   }/////////////////////////////////////fin abrir

int obtener_token (){
    
     
     lexema2="";
    
     
     int eliminar=1;
 
   int pos=0;
  error=0;
   lexema="";
        Estado=0;
     Token=0;
   
     
  
     
    funciones caracter = new funciones();
      caracter.leerCar();
        
        
        
   while (Token == 0 && error==0){
      
      
       b=caracter.c[linea][actual];
       este=b;
        lexema1=lexema1+b;
       lexema=lexema+b;
  
       switch (Estado){
           case 0:  if(b=='\"'){
                Estado=4;
                actual++;
           }
           else if(Character.isAlphabetic(b)){
                Estado=1;   
                actual++;
           }else if (Character.isDigit(b)){
                Estado=2;
                actual++;
           }  
           else if (b=='+'){
              Estado =5;
              actual++;
           }else if (b=='-'){
              Estado = 6;
              actual++;
           }else if (b=='*'){
              Estado=7;
              actual++;
           }else if (b=='/'){
              Estado =8;
              actual++;
           }else if (b=='('){
              Estado =10;
              actual++;
           }else if (b==')'){
              Estado =11;
              actual++;
           }else if (b=='{'){
              Estado =12;
              actual++;
           }else if (b=='}'){
              Estado =13;
              actual++;
           }else if (b=='='){
              Estado =14;
              actual++;
           }else if (b=='>'){
              Estado =15;
              actual++;
           }else if (b=='<'){
              Estado =16;
              actual++;
           }else if (b=='$'){
              Estado =17;
              actual++;
           }else if (b==':'){
              Estado =18;
              actual++;
           }else if (b==','){
              Estado =19;
              actual++;
           }else if (Character.isWhitespace(b)){
           
            actual++;
            int m = Math.max(0, lexema.length() - 1); 
            lexema=lexema.subSequence(0, m).toString();
           }
           else {
           if (b=='\u0000'){
               error=2; 
               }else{
              error=1; ///////////////////////////////////////////////////////////////escritura archivo xml
          System.out.print("No Valido;  ");  
            String minombre="";
        FileReader rutanombre=null;
   BufferedReader rutanombre1 = null;
    File rutanombre2 = null;
 int cantidadmenos=4;
 String errornom="";
      String nombrenn="";
       String nombrearchivo="";
         try{
        rutanombre2= new File("nombre.txt");
        rutanombre = new FileReader(rutanombre2);
            rutanombre1 = new BufferedReader(rutanombre);
          nombrearchivo=rutanombre1.readLine();
           nombrenn=nombrearchivo.substring(0,nombrearchivo.lastIndexOf('.'));
          rutanombre.close();
        errornom=nombrenn;
        errornom=errornom+"_Err.xml";
        }catch (Exception ex){} 
   
      
       
          
          
          
          
          
          
          
               try(FileWriter xml = new FileWriter(errornom, true);
               BufferedWriter bw = new BufferedWriter(xml);
               PrintWriter oute = new PrintWriter(bw))
                   
    { 
        
        oute.println(errornom);
         oute.println("hola");
          
        
       
        //
} catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Error en obtencion de ruta para compilación","Error de Lectura", JOptionPane.ERROR_MESSAGE);
    //exception handling left as an exercise for the reader
}
          
        
          
          
          
          
            actual++;
          }     
          }
           break;
           case 1 : if (Character.isAlphabetic(b)|| Character.isDigit(b)||(b=='_')){
              Estado =1;
              actual++;
           }else{
              Token=1;
           }
           break;
           case 2: 
                  if (Character.isDigit(b)){
           Estado =2;
           actual++;
           }else if (b=='.'){
           Estado=3;
           actual++;
           }else{
                   Token=2;
                   t2++;
                   System.out.print(Token+ ";  ");
    
           }
           break;
           case 3: 
                if (Character.isDigit(b)){
           Estado =3;
        
           actual++;
         
           }else{
                   Token=3;
                   t3++;
                   System.out.print(Token+ ";  ");
    
           }
               
           break;
          case 4:    
             if (Character.isAlphabetic(b)|| Character.isDigit(b)|| Character.isWhitespace(b)|| (b=='\"')){
              Estado =4;
              actual++;
     
           }else {
                Token=4;
                t4++;
                System.out.print(Token+ ";  ");
           
           }
           
           break;
           case 5: 
             Token=5;
             t5++;
            System.out.print(Token+ ";  ");
           break;
       case 6:  
            Token=6;
            t6++;
            System.out.print(Token+ ";  ");
           break;
       case 7 : if(b=='*'){
       Estado=9;
       actual++;
       }
        
            Token=7;
            t7++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 8 : 
         
            Token=8;
            t8++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 9 : 
       
            Token=9;
            t9++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 10 : 
         
            Token=10;
            t10++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 11 : 
        
            Token=11;
             t11++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 12 : 
     
            Token=12;
            t12++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 13 : 
     
            Token=13;
            t13++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 14 : 
     
            Token=14;
            t14++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 15 : 
     
            Token=15;
            t15++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 16 : 
     
            Token=16;
            t16++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 17 : 
     
            Token=17;t17++;
            System.out.print(Token+ ";  ");
              
      
       break;
            case 18 : 
     
            Token=18;
            t18++;
            System.out.print(Token+ ";  ");
              
      
       break;
        case 19 : 
     
            Token=19;
            t19++;
            System.out.print(Token+ ";  ");
              
      
       break;
       }//Fin switch
       
       
       pos=pos+1;
       
       
   }//Fin while

   
     if (error!=0){
  // error
    
  
  
             return(-1);
     }else {
    int m = Math.max(0, lexema.length() - 1); 
lexema=lexema.subSequence(0, m).toString();
   
        
      lexema1=lexema1.substring(0,lexema1.length()-1);
   
    if (Token==1){
      if (lexema.equals(Reservada1)){
      Token=100;
      t100++;
      } else if (lexema.equals(Reservada2)){
      Token=101;
      t101++;
      }else if(lexema.equals(Reservada3)){
      Token=102;
      t102++;
      }else if(lexema.equals(Reservada4)){
      Token=103;
      t103++;
      }else if(lexema.equals(Reservada5)){
      Token=104;
      t104++;
      }else if(lexema.equals(Reservada6)){
      Token=105;
      t105++;
      }else if(lexema.equals(Reservada7)){
      Token=106;
      t106++;
      }else if(lexema.equals(Reservada8)){
      Token=107;
      t107++;
      }else if(lexema.equals(Reservada9)){
      Token=108;
      t108++;
      }else if(lexema.equals(Reservada10)){
      Token=109;
      t109++;
      }else if(lexema.equals(Reservada11)){
      Token=110;
      t110++;
      }else if(lexema.equals(Reservada12)){
      Token=111;
      t111++;
      }
      else{Token=1;t1++;}
       System.out.print(Token+ ";  ");
    }
  
     return Token;
     }
    
     
     
     }//////////////////////////////////fin obtener token




}

public class Lexico {
    public static void inicio(){
      
     File borrar = new File("total.txt");
     if (borrar.exists()){
     try{
     borrar.delete();
     }catch(Exception e){
     
     }
     }
      char[][] var = new char [100][100];
         char indice;
         String direccion="";
        int f=0;
        String a;
        int ff=0;
        int jj=0;
        FileReader ruta=null;
        FileReader fr1 = null;
        BufferedReader bf1 = null;
         BufferedReader ruta1 = null;
        File archivos = null;
         File ruta2 = null;
        funciones clase = new funciones();
        try{
        ruta2= new File("ruta.txt");
        ruta = new FileReader(ruta2);
            ruta1 = new BufferedReader(ruta);
            direccion =ruta1.readLine();
        
        }catch (Exception ex){} 
        
        
        
        try{
        archivos = new File(direccion);
            fr1 = new FileReader(archivos);
            bf1 = new BufferedReader(fr1);
            a =bf1.readLine();
         while (a !=null){
                 for (int x=0;x<a.length();x++){
                 if (Character.isWhitespace(a.charAt(x))){  
           }else if (a.charAt(x)=='%'){
           break;
           
           }
           else{     var[ff][jj]=((char)a.charAt(x));  jj++;  
               clase.obtener_token();}
           } 
                clase.error=0;
                clase.Token=0;
               clase.actual=0;   
                  clase.linea++;
            ff++;
              jj=0;
         
           
          
              System.out.println(" ");
              clase.controllinea++;
          a =bf1.readLine();
        clase.lexema1="";
           }
             /////Escritura de total de tokens obtenidos
             
      try(FileWriter fw = new FileWriter("total.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
    {
        out.println(Integer.toString(clase.t1));
        out.println(Integer.toString(clase.t2));
        out.println(Integer.toString(clase.t3));
         out.println(Integer.toString(clase.t4));
          out.println(Integer.toString(clase.t5));
           out.println(Integer.toString(clase.t6));
            out.println(Integer.toString(clase.t7));
             out.println(Integer.toString(clase.t8));
              out.println(Integer.toString(clase.t9));
               out.println(Integer.toString(clase.t10));
                out.println(Integer.toString(clase.t11));
                 out.println(Integer.toString(clase.t12));
                  out.println(Integer.toString(clase.t13));
                   out.println(Integer.toString(clase.t14));
                    out.println(Integer.toString(clase.t15));
                     out.println(Integer.toString(clase.t16));
                      out.println(Integer.toString(clase.t17));
                       out.println(Integer.toString(clase.t18));
                        out.println(Integer.toString(clase.t19));
                         out.println(Integer.toString(clase.t100));
                          out.println(Integer.toString(clase.t101));
                           out.println(Integer.toString(clase.t102));
                            out.println(Integer.toString(clase.t103));
                             out.println(Integer.toString(clase.t104));
                              out.println(Integer.toString(clase.t105));
                               out.println(Integer.toString(clase.t106));
                                out.println(Integer.toString(clase.t107));
                                 out.println(Integer.toString(clase.t108));
                                  out.println(Integer.toString(clase.t109));
                                   out.println(Integer.toString(clase.t110));
                                    out.println(Integer.toString(clase.t111));
          JOptionPane.showMessageDialog(null, "Compilado con Exito","Compilado", JOptionPane.INFORMATION_MESSAGE);
       
        //
} catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Error en obtencion de ruta para compilación","Error de Lectura", JOptionPane.ERROR_MESSAGE);
    //exception handling left as an exercise for the reader
}
        
                   
                 fr1.close(); 
                 bf1.close();
               
        }catch (Exception ex){}   
             
           
     
   
                 
        
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
 
    
}
