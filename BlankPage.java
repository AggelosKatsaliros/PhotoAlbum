package CreateAlbum;
import src.poiExtractor.*;
import java.util.ArrayList;

import src.poiExtractor.BlankPageExtractor;

public class BlankPage extends Page {
	public BlankPage(){
		
	}
	public BlankPage(String date,ArrayList<String> kleidia){
		super(date,kleidia);
	}
	public void updatePage(String date){ //allagi date
		setDate(date);
	}
	public IPageExtractorToPoi ppp(){
		 BlankPageExtractor bl=new BlankPageExtractor();
		 return bl;
	}
	public String getPage(){
		String s="BlankPage";
		return s;
	}
}
