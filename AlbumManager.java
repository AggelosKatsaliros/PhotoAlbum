package CreateAlbum;
import java.util.ArrayList;


public class AlbumManager {
	private ArrayList<Album> lista=new ArrayList<Album>();
	private ArrayList<String> onomatalbum=new ArrayList<String>();
	public AlbumManager(){
		
	}
	public void addAlbum(Album a){
		lista.add(a);
	}
	//public String toString(){
		
	//}
	public void addOnomaAlbum(Album a){    //basiko
		onomatalbum.add(a.getName());
	}
	public Album getlista(int i){
		return lista.get(i);
	}
	public String getOnoma(int i){
		return onomatalbum.get(i);
	}
	public ArrayList<String> getOnomarray(){
		return onomatalbum;
	}
	public ArrayList<Album> getListaAlbum(){
		return lista;
	}
	//public void findalbumOrder(){  tha ginei sthn main me 2 periptwseis an theloume me th seira h me to xrono
		
	//}
	//public void findalbumTime(String name){
		
	//}
}
