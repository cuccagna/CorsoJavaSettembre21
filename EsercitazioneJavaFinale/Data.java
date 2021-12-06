import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Data {
	
	private GregorianCalendar c;
	
	public Data(){
		c = new GregorianCalendar();
	}
	
	public Data(int g, int m, int a){
		c = new GregorianCalendar(a,m-1,g);
	}

	//Stringa in formato g/m/a
	public Data(String d){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(d, formatter);
		//Se sei qui nessuna eccezione è stata lanciata, e la data è ok
		c = new GregorianCalendar(date.getYear(),date.getMonthValue()-1,date.getDayOfMonth());
		

		/* if(!d.matches("\\d{1,2}/\\d{1,2}/\\d{4}"))
			throw new RuntimeErrorException("Data in un formato errato") */
	}
	
	
	//this - d
	public int getDifference(Data d){
		int diff=0;
		GregorianCalendar c1 = (GregorianCalendar)c.clone();
		GregorianCalendar d2 = (GregorianCalendar)d.c.clone();
		azzeraOrario(c1);
		azzeraOrario(d2);
		long cm = c1.getTimeInMillis();
		long dm = d2.getTimeInMillis();
		long diffm = cm - dm;
		diff = (int) (diffm / (24 * 60 * 60 * 1000));
		/*if(diff == 0){
			return c.get(Calendar.DATE) - d.c.get(Calendar.DATE);

		}*/
		return diff;
	}

	private void azzeraOrario(GregorianCalendar cal){
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);

	}
	
	public boolean equals(Object obj){
		if(obj == null) return false;
		
		if(!(obj instanceof Data)) return false;
		
		//return c.equals((GregorianCalendar)obj);
		Data dataDaConfrontare = (Data)obj;
		return c.equals(dataDaConfrontare.c);
		
	}
	
	public String toString(){
		int anno = c.get(Calendar.YEAR);
		int mese = c.get(Calendar.MONTH) + 1;
		int giorno = c.get(Calendar.DATE);
		return giorno+"/"+mese+"/"+anno;
	}

}
