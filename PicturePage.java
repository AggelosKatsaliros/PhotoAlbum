package CreateAlbum;
import src.poiExtractor.*;
import java.util.ArrayList;

import src.poiExtractor.PicturePageExtractor;


public class PicturePage extends Page{
	private String title;
	private String picture;
	
	public PicturePage(){
		
	}
	public PicturePage(String title,String picture,String date,ArrayList<String> kleidia){
		super(date,kleidia);
		this.title=title;
		this.picture=picture;
	}
	public void updatePage(String date){
		setDate(date);
	}
	public void setContent(String picture){
		this.picture=picture;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setkleidia(String kleidia){
		setLekseis(kleidia);
	}
	//public String toString(){
		
	//}
	public String getTitle(){
		return title;
	}
	public String getPicture(){
		return picture;
	}
	public IPageExtractorToPoi ppp(){
		PicturePageExtractor pp = new PicturePageExtractor(title, picture);
		return pp;
	}
	public String getPage(){
		String s="PicturePage";
		return s;
	}

}
