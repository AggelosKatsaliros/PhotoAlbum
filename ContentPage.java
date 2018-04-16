package CreateAlbum;
import src.poiExtractor.*;
import java.util.ArrayList;

import src.poiExtractor.ContentPageExtractor;

public class ContentPage extends Page{
	String title;
	String content;
	
	public ContentPage(){
		
	}
	public ContentPage(String title,String content,String date,ArrayList<String> kleidia){
		super(date,kleidia);
		this.title=title;
		this.content=content;
	}
	public void updatePage(String date){
		setDate(date);
		
	}
	public String getTitle(){
		return title;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content=content;
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
		ContentPageExtractor cp = new ContentPageExtractor(title, content);
		return cp;
	}
	public String getPage(){
		String s="ContentPage";
		return s;
	}
}
