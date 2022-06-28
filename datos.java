import java.io.*;
public class datos {
    public String leertxt(String direccion){
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfread;
            while ((bfread = bf.readLine())!= null){
                temp = temp + bfread;
            }
            texto = temp;

        }catch (Exception e){
            System.err.println();

        }
        return texto;
    }
}
