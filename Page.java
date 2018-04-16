package CreateAlbum;
import java.util.*;
import src.poiExtractor.*;
public abstract class Page {
	private String date;
	private ArrayList<String> lekseis;
	public Page(){
		
	}
	public Page(String Date,ArrayList<String> kleidia){
		date=Date ;
		lekseis=kleidia;
	}
	public abstract void updatePage(String date);
	public String getDate(){
		return date;
	}
	
	public void setDate(String hmeromhnia){
	date=hmeromhnia;
	}
	public void setLekseis(String kleidia){
		lekseis.add(kleidia);
	}
	public String getlekseiskleidia(int i){
		return lekseis.get(i);
	}
	public int getkleidiasize(){
		return lekseis.size();
	}
	public abstract  IPageExtractorToPoi ppp();
	//public String toString(){
		
	//}
	public abstract String getPage();
	public void setTitle(String title){
		
	}
	public void setContent(String content){
		
	}
}
