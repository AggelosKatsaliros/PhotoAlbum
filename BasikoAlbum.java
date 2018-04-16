package CreateAlbum;

import java.util.ArrayList;

import src.poiExtractor.AlbumExtractor;

public class BasikoAlbum extends Album {
	//private ArrayList<Page> sinsel;
	//private String name;
	public BasikoAlbum(){
		
	}
	//public BasikoAlbum(String name,ArrayList<Page> sinsel){
	//	super(name,sinsel);
	//}
	public BasikoAlbum(String name){
		super(name);
		//this.name=name;
		//sinsel=new ArrayList<Page>();
	}
	public void addPage(Page page){
		sinsel.add(page);
	}
	//public Page getpage(int i){
	//	return sinsel.get(i);
	//}
	//public ArrayList<Page> getSinsel(){
	//	return sinsel;
	//}
	//public void setOrderPage(int i,Page h){
	//	sinsel.set(i,h);
	//}
	//public String getName(){
	//	return name;
	//}
	//public void changePage(Page page){
		//page.updatePage();
	//}
		
	//}
	//public AlbumExtractor ppa(){
	//	AlbumExtractor albumExtractor = new AlbumExtractor(getName());
		//return albumExtractor;
	//}
}
