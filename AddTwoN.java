
/**
 * Write a description of class AddTwoN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddTwoN
{
    static int Adicion(int a,int b)
    {
        int resultado= 0;
        
        resultado=a+b;
        
        return resultado;
    }

    public static void main(String args[]){
        
        int A= 10;
        int B= 20;
        int C= 5;
        
        System.out.println(+A +" " +B );
        System.out.println(Adicion(A,B));        
    }
}
