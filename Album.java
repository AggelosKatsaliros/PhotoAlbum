package CreateAlbum;
import  java.util.ArrayList;

import src.poiExtractor.AlbumExtractor;

public abstract class Album {
	private String name;
	protected  ArrayList<Page> sinsel;
	public Album(){
	
	}
	//public Album(String name,ArrayList<Page> sinsel){
	//	this.name=name;
	//	sinsel=new ArrayList<Page>();
		//this.sinsel=sinsel;
		
	//}
	public Album(String name){
		this.name=name;
		sinsel=new ArrayList<Page>();
	}
	public String getName(){
		return name;
	}
	public abstract void addPage(Page page);
	public Page getpage(int i){
		return sinsel.get(i);
	}
	public ArrayList<Page> getSinsel(){
		return sinsel;
	}
	public void setOrderPage(int i,Page h){
		sinsel.set(i,h);
	}
	//public abstract AlbumExtractor ppa();
	
	
}
