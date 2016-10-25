
package i.o;


import java.io.*;


public class IO {

   
    public static void main(String[] args) {
        
        File monir = new File ("E:songs/محمد منير/01 الألبومات/2012 يا اهل العرب و الطرب/Nogomi.com_Mohamed_Mounir-04.Albi_Maishbhnesh.mp3");
        System.out.println(monir.exists());
        float  c = (monir.length())/(1024*1024);
      System.out.println(c);
     System.out.println((monir.getFreeSpace())/(1024*1024));
     System.out.println(monir.toURI());
     try
     {
         FileInputStream monirsong = new FileInputStream (monir);
         int reden;
//         monirsong.read();
//         FileOutputStream maked = new FileOutputStream (new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed2/monir.mp3"));
//         while((reden=monirsong.read())!=-1)
//         maked.write(reden);
//         maked.flush();
//         maked.close();
//         monirsong.close();
         byte [] bufer = new byte [1024*1024];
          FileOutputStream maked = new FileOutputStream (new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed2/monir2.mp3"));
         while((reden=monirsong.read(bufer))>0)
         {
             maked.write(bufer, 0, reden);
         }
         maked.flush();
         maked.close();
         monirsong.close();
         File pdf = new File ("C:/Documents and Settings/ahmed samir/Desktop/java1.txt");
         FileInputStream pdfs = new FileInputStream (pdf);
         DataInputStream pdfd= new DataInputStream(pdfs);
         while(pdfd.readLine()!=null)
         System.out.println(pdfd.readLine());
         File txt = new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (8).txt");
         FileOutputStream txto = new FileOutputStream(txt);
         DataOutputStream txtd = new DataOutputStream(txto);
         txtd.writeUTF("public class Java102 {\n" +
"    \n" +
"        a h= new a ();\n" +
"        B z =new B();\n" +
"       \n" +
"        \n" +
"        System.out.println(z.val);\n" +
"       simplecalc q = new simplecalc(3,7);\n" +
"       \n" +
"       q.sety(2);\n" +
"       anotherecalc t = new  anotherecalc (6,7);\n" +
"   d f =new d();\n" +
"   f.x=5;\n" +
"  \n" +
"     System.out.println(d.addd(4, 5));\n" +
"      thecount p= new thecount ();\n" +
"       System.out.println(thecount.get());\n" +
"       thecount.set(14);\n" +
"          System.out.println(thecount.get());\n" +
"     r c =new r();\n" +
"     mo.beans();\n" +
"     System.out.println(s.add(3.5f, 3.5f));\n" +
"    s.print();\n" +
"    System.out.println(obj.y);\n" +
"    System.out.println(xxx.result);\n" +
"    \n" +
"  \n" +
"      System.out.println(n);");
         
        FileReader txtread= new FileReader (new File ("C:/Documents and Settings/ahmed samir/Desktop/strop.txt")) ;
//         char [] arr= new char[50];
//         int charr;
//         while ((charr=txtread.read(arr))>0)
//         System.out.print(charr);
         BufferedReader bufeer = new BufferedReader (txtread);
         while(bufeer.ready())
         System.out.println(bufeer.readLine());
         FileWriter w = new FileWriter (new File("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (7).txt"));
         PrintWriter print = new PrintWriter (w,true);
         print.println(" one day i will fuck amal hard ");
         
         
     }
     
     catch (IOException e)
     {
         e.printStackTrace();
     }
     
     
     
     
     
     
     
     
     
      
    }
    
}
