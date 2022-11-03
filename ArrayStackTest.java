import java.io.*;
import java.util.Stack;
import java.util.*;
class ArrayStackTest  {
   public static void main (String[] args) throws IOException , Overflow, Underflow{
     String line;
     System.out.print("Dwste 'E' gia Eksodo h opoiodhpote allo pliktro gia Eisagwgi Alusidas  "); 
     int cntn =Continue();
     // Kentriki anakuklwsi.O xristis eisagei epanaliptika alusides  
     // kai termatizei to programma otan to thelisei
     while (cntn!='E'){
        System.out.print("Eisagwgi Alusidas gia Elegxo (xwris kena anamesa stis parentheseis)  ");
        line = getString(); // H alusida
        int len = line.length(); // Mikos alusidas
        ArrayStack S = new ArrayStack(80);  // H stoiva  
        try
          {
           // Anakuklwsi Elegxou alusidas
           for(  int i = 0; i < len; i++ ) {  // An to mikos tis alusida einai >80 prokalei Overflow
               char ch = line.charAt(i);
               // Elegxei an i eisagwgi einai aristeri wste na tn eigagei stn stoiva
               // enw (else) an dn einai elgxei an isorropei me tn proigoumeni eisagwgi
               if ( isLeft(ch)){S.push(ch); 
                   // ELegxei an einai i teleutaia eisagwgi kai emfanizei ena minima sfalmatos
                   if (i==(len-1)){
                         System.out.println("O xaraktiras st thesi "+len+" parousiase provlima");
                         S.push('w');} // O 'w' eisagetai st stoiva ws xaraktiras endeiksis sfalmatos
               }else{
                   // Elegxei an i stoiva einai keni, kathws tote i deksia eisagwgi prokalei sfalma
                   if (S.isEmpty()){
                         System.out.println("O xaraktiras st thesi "+(i+1)+" parousiase provlima");
                         S.push('w');
                         i=len;} // termatizei tn anakuklwsi
                   else{char value;
                        // An to korufaio stoixeio tis stoivas isorropei m tn eisagwgi, diagrafetai.
                        // Alliws efmanizoume minima sfalamtos 
                        if (arBal(S.peek(),ch))  value = S.pop(); 
                        else {System.out.println("O xaraktiras st thesi "+(i+1)+" parousiase provlima");
                              S.push('w');i=len;
                        }
                   }
               } 
           }
           if (S.isEmpty()){
               System.out.println("*******************");
               System.out.println("isorropimeni alisida");
               System.out.println("*******************");}
           else 
              {System.out.println("**********************");
               System.out.println("mi isorropimeni alusida");
               System.out.println("**********************");
               if(isLeft(S.peek())) System.out.println("O xaraktiras st thesi "+(S.top()+1)+" parousiase provlima  ");}
        }catch( Exception e ) { System.out.println("Unexpected " + e);}
        System.out.print("Dwste 'E' gia Eksodo h opoiodhpote allo pliktro gia Eisagwgi neas Alusidas  ");
        cntn = Continue();    
     }  
  } 
  // methodos gia Elegxo isorropias eisagwgwn
  public static boolean arBal (char i,char j){
       return ((i=='(' && j==')') || (i=='[' && j==']') || (i=='{' && j=='}'));
  }
  // methodos gia Elegxo aristeris eisagwgis
  public static boolean isLeft(char ch){
       return (ch=='(') || (ch=='[') || (ch=='{');
  }
  // For input
  public static String getString() throws IOException
      {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      String s = br.readLine();
      return s;
  }
  // Diavazei tn xaraktira pou xrisimopoieitai gia sunexeia h eksodo
  public static int Continue() throws IOException
      {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int s = br.read();
      return s;
  }
}  