package CreateAlbum;
import src.poiExtractor.*;
import java.util.ArrayList;

import src.poiExtractor.TitlePageExtractor;

public class TitlePage extends Page{
	private String title;
	public TitlePage(){
		
	}
	public TitlePage(String title,String date,ArrayList<String> kleidia){
		super(date,kleidia);
		this.title=title;
	}
	public void updatePage(String date){
		setDate(date);
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setkleidia(String kleidia){
		setLekseis(kleidia);
	}
	//public String toString(){
		
	//}
	public IPageExtractorToPoi ppp(){
		TitlePageExtractor tp = new TitlePageExtractor(title);
		return tp;
	}
	public String getTitle(){
		return title;
	}
	public String getPage(){
		String s="TitlePage";
		return s;
	}
}
