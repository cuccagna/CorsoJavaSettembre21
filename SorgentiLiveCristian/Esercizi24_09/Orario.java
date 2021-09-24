public class Orario {
    private int ora;
    private int minuti;
    private int secondi;

    public void setOrario(int h , int m , int s)
    {
         ora = ((h >= 0 && h<24) ? h : 0);
         minuti = ((m>=0 && m<60) ? m : 0);
         secondi = ((s>=0 && s<60) ? s : 0);
    }

    public String formatoUniversale()
    {
        return String.format("%02d:%02d:%02d",ora,minuti,secondi);
    }

    public String toString()
    {
        /* String amOrPm;
        if(ora<12)
            amOrPm = "AM";
        else
            amOrPm = "PM"; */
        return String.format("%d:%02d:%02d %s",
                 ((ora == 0 || ora == 12) ? 12 : ora % 12),
                 minuti,secondi, ((ora<12) ? "AM" : "PM")  
        );
    }
}
