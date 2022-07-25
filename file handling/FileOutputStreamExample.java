    import java.io.FileOutputStream;  
    public class FileOutputStreamExample {  
        public static void main(String args[]){    
               try{    
                 FileOutputStream fout=new FileOutputStream("testout.txt");   
                 String s="welcome to vs code" ;
                 byte b[]=s.getBytes();
                 fout.write(b);    
                 fout.close();    
                 System.out.println("success...");    
                }catch(Exception e){System.out.println(e);}    
          }    
    }  


   