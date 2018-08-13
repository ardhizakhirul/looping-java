package jobsheet11;

import java.util.Locale;

public class tugas {
    public static void main (String[] args)
    {
        String identitas = "Ardhi Zakhirul Qolby / X-RPL3 / 6";
        System.out.println("identitas :" + identitas);
    String x = "Operasi";
        
        System.out.println("isi variable x : " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
    System.out.println("isi x sama dengan y : "+ x.equals(y));
        
        String z = "operasi";
        System.out.println("isi variable z : " + z);
        System.out.println("isi x sama dengan z (case Sensitive)");
        
        String r = "operasi";
        System.out.println("isi variable r"+ r);
        System.out.println("isi x sama dengan z (Case Sensitive)" + x.equals(r));
                  
        System.out.println("isi x sama dengan r (Not Case Sensitive)" + x.equalsIgnoreCase(r));
     
        System.out.println("Perbandingan isi x dengan y :"+ x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive) :"+ x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive) :"+ x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r ( Not Case Sensitive) :"+ x.compareToIgnoreCase(r));
    
        String s = "operasi";
        System.out.println("isi variabelc s :"+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive) :"+ r.compareTo(s));
       
        
    }
    
}
    
