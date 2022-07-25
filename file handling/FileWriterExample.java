import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("testout.txt");    
           fw.write("Welcome To Uttrakhand");    
           fw.close();    
          }
          catch(Exception e)
          {
            System.out.println(e);
        }    
          System.out.println("successful...");    
     }    
}