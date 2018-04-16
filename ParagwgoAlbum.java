package CreateAlbum;

import java.util.ArrayList;

import src.poiExtractor.AlbumExtractor;

public class ParagwgoAlbum extends Album {
	//private ArrayList<Page> sinsel;
	private String name;
	public ParagwgoAlbum(){
		
	}
	//public ParagwgoAlbum(String name,ArrayList<Page> sinsel){
		//super(name,sinsel);
	//}
	public ParagwgoAlbum(String name){
		super(name);
		//sinsel=new ArrayList<Page>();
		//this.name=name;
	}
	public void addPage(Page page){
		sinsel.add(page);
	}
	/*public void createalbumwithkey(String kleidi){
		AlbumManager c=new AlbumManager();
		for (int i=0; i<sinsel.size(); i++){
			for (int j=0; j<sinsel.size(); j++){
				for(int k=0; k<c.getlista(i).getpage(j).getkleidiasize(); k++){
					if(c.getlista(i).getpage(j).getlekseiskleidia(k)==kleidi){
						addPage(c.getlista(i).getpage(j));
					}
					
				}
				
			}
			
		}
	}*/
	//public String getName(){
		//return name;
//	}
//	public ArrayList<Page> getSinsel(){
	//	return sinsel;
	//}
	//public AlbumExtractor ppa(){
		//AlbumExtractor albumExtractor = new AlbumExtractor(getName());
	//return albumExtractor;
	//}
	//public void addAlbum(String name,ArrayList<Page> sinesel) {
		
	//}
}












/*System.out.println("Type 1 if you want to see the albums pages as you add them,type 0 if you want to see them by date,type -1 if you dont wanna see either of them");
int wda=keyboard.nextInt();
if(wda==1){
	for (int o=0;o<prwto.getSinsel().size();o++){
		neoalbum.addSlideExtractor(prwto.getpage(o).ppp());
		System.out.println("geia");
	}
	neoalbum.exportPOISlideShow();
}else if (wda==0){
	int [] prosw=new int[prwto.getSinsel().size()]	;
	for (int k=0; k<prwto.getSinsel().size(); k++){
		prosw[k]=Integer.parseInt(prwto.getpage(k).getDate());
			
	}
	for (int i=0; i<prwto.getSinsel().size(); i++){
		for(int j=0; j<prwto.getSinsel().size(); j++){
			if(prosw[i]<prosw[j]){
				int temp=prosw[i];
				prosw[i]=prosw[j];
				prosw[j]=temp;
					
			}
		}
	}
	for(int g=0;g<prwto.getSinsel().size();g++){
		for(int h=0; h<prwto.getSinsel().size(); h++){
			if(Integer.parseInt(prwto.getpage(h).getDate())==prosw[g]){
			Page temporary=prwto.getpage(g);
				prwto.setOrderPage(g,prwto.getpage(h));
				prwto.setOrderPage(h, temporary);
			}
		}
			
	}
	for (int o=0;o<prwto.getSinsel().size();o++){
		neoalbum.addSlideExtractor(prwto.getpage(o).ppp());
	}
	neoalbum.exportPOISlideShow();
}*/
