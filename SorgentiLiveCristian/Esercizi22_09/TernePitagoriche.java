public class TernePitagoriche
{
public static void main(String args[])
{
    int cateto1=1;
    System.out.println("Le terne pitagoriche sono:");
    System.out.printf("%-9s   %-12s%-9s\n ","cateto1","cateto2","ipotenusa");
    for(; cateto1<=200 ;cateto1++)
    {
        for(int cateto2=1; cateto2 <= 200 ; cateto2++)
        {
            for(int ipotenusa=1; ipotenusa <= 200 ; ipotenusa++)
            {
                if (ipotenusa * ipotenusa==cateto1*cateto1 + cateto2*cateto2)
                System.out.printf("%-9d   %-12d%-9d\n ",cateto1,cateto2,ipotenusa);
            }
        }
    }
}
}