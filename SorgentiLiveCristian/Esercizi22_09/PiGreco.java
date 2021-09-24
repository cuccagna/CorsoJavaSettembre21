public class PiGreco
{
    public static void main (String args[])
    {
        double pigreco = 0.0,termine;
        System.out.printf("%-8s%12s%12s%12s%12s\n", "valore i","2 termini","3 termini" , "4 termini" , "5 termini");
        for (int i=0 ; i<=7009 ; i++)
        {
            termine = 4.0/(2*i+1) *(Math.pow(-1 , i)) ;
            pigreco += termine;
            System.out.printf("%-8d%12.2f%12.3f%12.4f%12.5f\n" , i ,pigreco,pigreco,pigreco,pigreco);
        }
        System.out.println(pigreco);
    }
}