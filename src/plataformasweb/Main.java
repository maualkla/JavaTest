/*
Clase de prueba
Materia: Plataformas WEB
 */
package plataformasweb;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //reader.nextInt();
        //reader.nextLine().charAt(0);
        //reader.nextLine();
        System.out.println(" Ingresa tu nombre... ");
        String name = reader.nextLine();
        if( "Mauricio Alcala".equals(name))
        {
            System.out.println( "Hola tu nombre es correcto. ::" + name );
            forImproved();
            
        }
        else
        {
            System.out.println(" Error vav ");
        }
        
       
    }
    
    public static void forImproved()
    {
        Scanner reader = new Scanner(System.in);
        String val = " ";
        List<String> listFor = new ArrayList<>();
        for(int a = 0; a<10; a++)
        {
            System.out.println(" Ingresa un valor a la lista: "  + (10 - a) + " restantes. ");
            val = reader.nextLine();
            listFor.add(val);
        }
        for (String element : listFor)
        {
            System.out.println(element + " ::::: ");
        }
    }
    
    
}
