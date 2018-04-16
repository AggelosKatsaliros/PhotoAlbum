package src.frontend;
import java.util.*;
import src.poiExtractor.*;

import CreateAlbum.*;

import java.util.ArrayList;
public class mainAlbumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String w="yes";
			Scanner keyboard=new Scanner(System.in);
			System.out.println("Wanna start this programm? if yes press 1 else press 0:");
			int w=keyboard.nextInt();
			if (w==0){
				System.out.println("Bye");
				System.exit(0);
			}
			AlbumManager manager=new AlbumManager();
 			while(w==1){
 				System.out.println("Wanna make an album?if yes press 1,if you want to make an album with keyword press 0 else press -1:");
				int v=keyboard.nextInt();
				if (v==1){
					System.out.println("How do wanna call it?");
					String z=keyboard.next();
					BasikoAlbum prwto=new BasikoAlbum(z);
					System.out.println("Put a title:");
					String q=keyboard.next();
					System.out.println("Put a date,in the form yyyymmdd for example for 2012-01-23 put 20120123:");
					String da=keyboard.next();
					ArrayList<String> pro=new ArrayList<String>();
					
					System.out.println("Put a keyword:");
					String ki=keyboard.next();
					pro.add(ki);
					int k0=1;
					while(k0==1){
						System.out.println("Wanna put another keyword?if no press 0,if yes press 1");
						int k1=keyboard.nextInt();
						if(k1==0){
							k0=0;
						}else{
							System.out.println("Put a keyword:");
							String kil=keyboard.next();
							pro.add(kil);
						}
					
					}
					AlbumExtractor neoalbum=new AlbumExtractor(prwto.getName());
					
					TitlePage titlos=new TitlePage(q,da,pro);
					//TitlePageExtractor neostitlos=new TitlePageExtractor(titlos.getTitle());
					prwto.addPage(titlos);
					//prwto.ppa().addSlideExtractor(titlos.ppt());// dhmiourgia titleextractor kai to vazw ston albumextractor
					//neoalbum.addSlideExtractor(neostitlos);
					int akeraios=5;
					while(akeraios!=-1){
						System.out.println("Now  if  you wanna make a blank page press 1 ");
						System.out.println("Now  if  you wanna make a subcategory with a title page press 2 ");
						System.out.println("Now  if  you wanna make a content page press 3 ");
						System.out.println("Now  if  you wanna make a picture page press 4");
						System.out.println("if you dont wanna put any other page press -1");
						int fh=keyboard.nextInt();
						if (fh==1){
							System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
							String daq=keyboard.next();
							ArrayList<String> pro1=new ArrayList<String>();
						
							System.out.println("Put a keyword:");
							String ki1=keyboard.next();
							pro1.add(ki1);
							int kq0=1;
							while(kq0==1){
								System.out.println("Wanna put another keyword?if no press 0,else press 1");
								int kq1=keyboard.nextInt();
								if(kq1==0){
									kq0=0;
								}else{
									System.out.println("Put a keyword:");
									String kilq=keyboard.next();
									pro1.add(kilq);
								}
						
							}
							BlankPage kenh=new BlankPage(daq,pro1);
						//	BlankPageExtractor neoskenos=new BlankPageExtractor();
							prwto.addPage(kenh);
							//neoalbum.addSlideExtractor(neoskenos);
							//prwto.ppa().addSlideExtractor(kenh.ppb());
						}else if(fh==2){
							System.out.println("Put a title:");
							String qq=keyboard.next();
							System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
							String dap=keyboard.next();
							ArrayList<String> pro2=new ArrayList<String>();
						
							System.out.println("Put a keyword:");
							String kiqa=keyboard.next();
							pro2.add(kiqa);
							int kqa0=1;
							while(kqa0==1){
								System.out.println("Wanna put another keyword?if no press 0,else press 1");
								int kwq1=keyboard.nextInt();
								if(kwq1==0){
									kqa0=0;
								}else{
									System.out.println("Put a keyword:");
									String killua=keyboard.next();
									pro2.add(killua);
								}
						
							}
						
							TitlePage allos=new TitlePage(qq,dap,pro2);
							//TitlePageExtractor selidatitlou=new TitlePageExtractor(allos.getTitle());
							prwto.addPage(allos);
							//neoalbum.addSlideExtractor(selidatitlou);
							//prwto.ppa().addSlideExtractor(allos.ppt());
						}else if(fh==3){
							System.out.println("Put a title:");
							String titlecontent=keyboard.next();
							System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
							String dater=keyboard.next();
							System.out.println("Put some contennt in this page:");
							String contentinput=keyboard.next();
							contentinput+=keyboard.nextLine();
							ArrayList<String> pro3=new ArrayList<String>();
						
							System.out.println("Put a keyword:");
							String keyourd=keyboard.next();
							pro3.add(keyourd);
							int kwqa0=1;
							while(kwqa0==1){
								System.out.println("Wanna put another keyword?if no press 0,else press 1");
								int kawq1=keyboard.nextInt();
								if(kawq1==0){
									kwqa0=0;
								}else{
									System.out.println("Put a keyword:");
									String killuar=keyboard.next();
									pro3.add(killuar);
								}
							
							}
							ContentPage selidakeimenou=new ContentPage(titlecontent,contentinput,dater,pro3);
							//ContentPageExtractor selidacontent=new ContentPageExtractor(selidakeimenou.getTitle(),selidakeimenou.getContent());
							prwto.addPage(selidakeimenou);
						//	neoalbum.addSlideExtractor(selidacontent);
							//prwto.ppa().addSlideExtractor(selidakeimenou.ppc());
						}else if(fh==4){
							System.out.println("Put a title:");
							String titlepicture=keyboard.next();
							System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
							String picturedate=keyboard.next();
							System.out.println("Put the path of a picture in this page:");
							String picturepath=keyboard.next();
							ArrayList<String> pro4=new ArrayList<String>();
							
							System.out.println("Put a keyword:");
							String keywourd=keyboard.next();
							pro4.add(keywourd);
							int arithmos=1;
							while(arithmos==1){
								System.out.println("Wanna put another keyword?if no press 0,else press 1");
								int number=keyboard.nextInt();
								if(number==0){
									arithmos=0;
								}else{
									System.out.println("Put a keyword:");
									String ke=keyboard.next();
									pro4.add(ke);
								}
							
							}
							PicturePage photopage=new PicturePage(titlepicture,picturepath,picturedate,pro4);
							//PicturePageExtractor selidaphoto=new PicturePageExtractor(photopage.getTitle(),photopage.getPicture());
							prwto.addPage(photopage);
							//neoalbum.addSlideExtractor(selidaphoto);
							//prwto.ppa().addSlideExtractor(photopage.ppp());
						}else if(fh==-1){
							manager.addAlbum(prwto);
							manager.addOnomaAlbum(prwto);
							break;
						}
						
					}	
					System.out.println("Type 1 if you want to see the albums pages as you add them,type 0 if you want to see them by date,type -1 if you dont wanna see either of them");
					int wd=keyboard.nextInt();
					if(wd==1){
						for (int o=0;o<prwto.getSinsel().size();o++){
							neoalbum.addSlideExtractor(prwto.getpage(o).ppp());
						}
						neoalbum.exportPOISlideShow();
					}else if (wd==0){
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
					}
						//prwto.ppa().exportPOISlideShow();
					
					System.out.println("Do you want to exit  making another album?if yes press 1 else press 0 ");
					int wer=keyboard.nextInt();
					if (wer==1){
						System.out.println("Exiting");
						break;
					}
					
					
					System.out.println("Do you want to make an empty album?if yes press 1");
		 			int empty=keyboard.nextInt();
		 			if(empty==1){
		 				System.out.println("Give a name:");
		 				String emptyname=keyboard.next();
		 				BasikoAlbum emptyalbum=new BasikoAlbum(emptyname);
		 				manager.addAlbum(emptyalbum);
		 				manager.addOnomaAlbum(emptyalbum);
		 			}
					while (true){
						System.out.println("Do you want to put a new page?if yes press 1 else press 0");
						int gha=keyboard.nextInt();
						String albumname;
						if (gha==1){
							int counter=0;
		 					while(true){
		 						System.out.println("Which album do you wanna put the page");
		 						String albumnamed=keyboard.next();
		 						for (int u=0;u<manager.getListaAlbum().size(); u++){
		 							if(manager.getlista(u).getName().equals(albumnamed)){
		 								counter++;
		 							}
		 						}
		 						if (counter>0){
		 							albumname=albumnamed;
		 							break;
		 						}
		 					}
							
							
							//System.out.println(manager.getListaAlbum().size());
							for(int i=0;i<manager.getListaAlbum().size(); i++){
								if(manager.getlista(i).getName().equals(albumname)){
									System.out.println("Now  if  you wanna make a blank page press 1 ");
									System.out.println("Now  if  you wanna make a subcategory with a title page press 2 ");
									System.out.println("Now  if  you wanna make a content page press 3 ");
									System.out.println("Now  if  you wanna make a picture page press 4");
									System.out.println("if you dont wanna put any other page press -1");
									int fh=keyboard.nextInt();
									if (fh==1){
										System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
										String daq=keyboard.next();
										ArrayList<String> pro1=new ArrayList<String>();
		 						
										System.out.println("Put a keyword:");
										String ki1=keyboard.next();
										pro1.add(ki1);
										int kq0=1;
										while(kq0==1){
											System.out.println("Wanna put another keyword?if no press 0,else press 1");
											int kq1=keyboard.nextInt();
											if(kq1==0){
												kq0=0;
											}else{
												System.out.println("Put a keyword:");
												String kilq=keyboard.next();
												pro1.add(kilq);
											}
		 						
										}
										BlankPage kenh=new BlankPage(daq,pro1);
										//	BlankPageExtractor neoskenos=new BlankPageExtractor();
										manager.getlista(i).addPage(kenh);
										//neoalbum.addSlideExtractor(neoskenos);
										//prwto.ppa().addSlideExtractor(kenh.ppb());
									}else if(fh==2){
										System.out.println("Put a title:");
										String qq=keyboard.next();
										System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
										String dap=keyboard.next();
										ArrayList<String> pro2=new ArrayList<String>();
		 						
										System.out.println("Put a keyword:");
										String kiqa=keyboard.next();
										pro2.add(kiqa);
										int kqa0=1;
										while(kqa0==1){
											System.out.println("Wanna put another keyword?if no press 0,else press 1");
											int kwq1=keyboard.nextInt();
											if(kwq1==0){
												kqa0=0;
											}else{
												System.out.println("Put a keyword:");
												String killua=keyboard.next();
												pro2.add(killua);
											}
		 						
										}
		 						
										TitlePage allos=new TitlePage(qq,dap,pro2);
											//TitlePageExtractor selidatitlou=new TitlePageExtractor(allos.getTitle());
										manager.getlista(i).addPage(allos);
										//neoalbum.addSlideExtractor(selidatitlou);
										//prwto.ppa().addSlideExtractor(allos.ppt());
									}else if(fh==3){
										System.out.println("Put a title:");
										String titlecontent=keyboard.next();
										System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
										String dater=keyboard.next();
										System.out.println("Put some contennt in this page:");
										String contentinput=keyboard.next();
										contentinput+=keyboard.nextLine();
										ArrayList<String> pro3=new ArrayList<String>();
		 						
										System.out.println("Put a keyword:");
										String keyourd=keyboard.next();
										pro3.add(keyourd);
										int kwqa0=1;
										while(kwqa0==1){
											System.out.println("Wanna put another keyword?if no press 0,else press 1");
											int kawq1=keyboard.nextInt();
											if(kawq1==0){
												kwqa0=0;
											}else{
												System.out.println("Put a keyword:");
												String killuar=keyboard.next();
												pro3.add(killuar);
											}
		 							
										}
										ContentPage selidakeimenou=new ContentPage(titlecontent,contentinput,dater,pro3);
										//ContentPageExtractor selidacontent=new ContentPageExtractor(selidakeimenou.getTitle(),selidakeimenou.getContent());
										manager.getlista(i).addPage(selidakeimenou);
										//	neoalbum.addSlideExtractor(selidacontent);
										//prwto.ppa().addSlideExtractor(selidakeimenou.ppc());
									}else if(fh==4){
										System.out.println("Put a title:");
										String titlepicture=keyboard.next();
										System.out.println("Put a date,for example for 2012-01-23 put 20120123:");
										String picturedate=keyboard.next();
										System.out.println("Put the path of a picture in this page:");
										String picturepath=keyboard.next();
										ArrayList<String> pro4=new ArrayList<String>();
		 							
										System.out.println("Put a keyword:");
										String keywourd=keyboard.next();
										pro4.add(keywourd);
										int arithmos=1;
										while(arithmos==1){
											System.out.println("Wanna put another keyword?if no press 0,else press 1");
											int number=keyboard.nextInt();
											if(number==0){
												arithmos=0;
											}else{
												System.out.println("Put a keyword:");
												String ke=keyboard.next();
												pro4.add(ke);
											}
		 							
										}
										PicturePage photopage=new PicturePage(titlepicture,picturepath,picturedate,pro4);
										//PicturePageExtractor selidaphoto=new PicturePageExtractor(photopage.getTitle(),photopage.getPicture());
										manager.getlista(i).addPage(photopage);
										//neoalbum.addSlideExtractor(selidaphoto);
										//prwto.ppa().addSlideExtractor(photopage.ppp());
		 						
									}else if(fh==-1){
										manager.addAlbum(manager.getlista(i));
										manager.addOnomaAlbum(manager.getlista(i));
										break;
									}
									System.out.println("Type 1 if you want to see the albums pages as you add them,type -1 if you dont wanna see ");
									int wda=keyboard.nextInt();
									if(wda==1){
										AlbumExtractor fair=new AlbumExtractor(manager.getlista(i).getName());
										for (int o=0;o<manager.getlista(i).getSinsel().size();o++){
											fair.addSlideExtractor(manager.getlista(i).getpage(o).ppp());
										}
										fair.exportPOISlideShow();
									}
								}
							}
		 			
						
		 				}else {
		 					break;
		 				}
		 			}
		 			while (true){
		 				System.out.println("Do you want to change a page of an album?type 1 for yes ,0 for no : ");
		 				int free=keyboard.nextInt();
		 				String albumname;
		 				if(free==1){
		 					int counter=0;
		 					while(true){
		 						System.out.println("Which album do you wanna put the page");
		 						String albumnamed=keyboard.next();
		 						for (int u=0;u<manager.getListaAlbum().size(); u++){
		 							if(manager.getlista(u).getName().equals(albumnamed)){
		 								counter++;
		 							}
		 						}
		 						if (counter>0){
		 							albumname=albumnamed;
		 							break;
		 						}
		 					}
		 					for(int i=0;i<manager.getListaAlbum().size(); i++){
		 						if(manager.getlista(i).getName().equals(albumname)){
		 							System.out.println(" Tell me the number of the page in the album(p.x. 0 for 1st page ,1 for 2nd");
		 							int epikairo=keyboard.nextInt();
		 							if(manager.getlista(i).getpage(epikairo).getPage().equals("BlankPage")){
		 								while(true){
		 							
		 									System.out.println("If you wanna change date press 1");
		 									System.out.println("If you wanna add keywords press 2 ");
		 									System.out.println("If you wanna leave press -1");
		 									int kappa=keyboard.nextInt();
		 									if(kappa==1){
		 										System.out.println("Give me a new date in the form yyyymmdd");
		 										String keepo=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setDate(keepo);
		 									}else if(kappa==2){
		 										System.out.println("Give me a keyword");
		 										String pasteli=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setLekseis(pasteli);
		 									}else if(kappa==-1){
		 										break;
		 									}
		 								}
		 							}else if(manager.getlista(i).getpage(epikairo).getPage().equals("TitlePage")){
		 								while(true){
			 							
		 									System.out.println("If you wanna change date press 1");
		 									System.out.println("If you wanna add keywords press 2 ");
		 									System.out.println("if you wanna change title press 3");
		 									System.out.println("If you wanna leave press -1");
		 									int kappa=keyboard.nextInt();
		 									if(kappa==1){
		 										System.out.println("Give me a new date in the form yyyymmdd");
		 										String keepo=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setDate(keepo);
		 									}else if(kappa==2){
		 										System.out.println("Give me a keyword");
		 										String pasteli=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setLekseis(pasteli);
		 									}else if(kappa==3){
		 										System.out.println("Give me a title:");
		 										String netitle=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setTitle(netitle);
		 									}else if(kappa==-1){
		 										break;
		 									}
		 								}
		 							}else if(manager.getlista(i).getpage(epikairo).getPage().equals("ContentPage")){
		 								while(true){
			 							
		 									System.out.println("If you wanna change date press 1");
		 									System.out.println("If you wanna add keywords press 2 ");
		 									System.out.println("if you wanna change title press 3");
		 									System.out.println("If you wanna change content press 4");
		 									System.out.println("If you wanna leave press -1");
		 									int kappa=keyboard.nextInt();
		 									if(kappa==1){
		 										System.out.println("Give me a new date in the form yyyymmdd");
		 										String keepo=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setDate(keepo);
		 									}else if(kappa==2){
		 										System.out.println("Give me a keyword");
		 										String pasteli=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setLekseis(pasteli);
		 									}else if(kappa==3){
		 										System.out.println("Give me a title:");
		 										String netitle=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setTitle(netitle);
		 									}else if(kappa==4){
		 										System.out.println("Give me new content");
		 										String contentinput1=keyboard.next();
		 										contentinput1+=keyboard.nextLine();
		 										manager.getlista(i).getpage(epikairo).setContent(contentinput1);
		 							
		 									}else if(kappa==-1){
		 										break;
		 									}
		 								}
		 							}else if(manager.getlista(i).getpage(epikairo).getPage().equals("PicturePage")){
		 								while(true){
			 							
		 									System.out.println("If you wanna change date press 1");
		 									System.out.println("If you wanna add keywords press 2 ");
		 									System.out.println("if you wanna change title press 3");
		 									System.out.println("If you wanna change picture press 4");
		 									System.out.println("If you wanna leave press -1");
		 									int kappa=keyboard.nextInt();
		 									if(kappa==1){
		 										System.out.println("Give me a new date in the form yyyymmdd");
		 										String keepo=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setDate(keepo);
		 									}else if(kappa==2){
		 										System.out.println("Give me a keyword");
		 										String pasteli=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setLekseis(pasteli);
		 									}else if(kappa==3){
		 										System.out.println("Give me a title:");
		 										String netitle=keyboard.next();
		 										manager.getlista(i).getpage(epikairo).setTitle(netitle);
		 									}else if(kappa==4){
		 										System.out.println("Give me new path of the picture");
		 										String contentinput1=keyboard.next();
		 										contentinput1+=keyboard.nextLine();
		 										manager.getlista(i).getpage(epikairo).setContent(contentinput1);
		 							
		 									}else if(kappa==-1){
		 										break;
		 									}
		 								}
		 							}
		 							System.out.println("Type 1 if you want to see the albums pages as you add them,type 0 if you want to see them by date,type -1 if you dont wanna see either of them");
		 							int wda=keyboard.nextInt();
		 							if(wda==1){
		 								AlbumExtractor fair=new AlbumExtractor(manager.getlista(i).getName());
		 								for (int o=0;o<manager.getlista(i).getSinsel().size();o++){
		 									fair.addSlideExtractor(manager.getlista(i).getpage(o).ppp());
		 								}
		 								fair.exportPOISlideShow();
		 							}
		 						}
		 					}
		 				}else {
		 					break;
		 				}
		 			}
		 			System.out.println("press 1 if you want to exit making an album else press 0");
		 			int tremp=keyboard.nextInt();
		 			if (tremp==1){
		 				break;
		 			}
		 			
		 			
					
					
				}else if(v==0){
					System.out.println("How do wanna call it?");             //paragwgo
					String po=keyboard.next();
					ParagwgoAlbum parag=new ParagwgoAlbum(po);
					System.out.println("Give me a keyword :");
					String kleidaki=keyboard.next();
					for (int i=0; i<manager.getListaAlbum().size(); i++){
						for(int j=0;j<manager.getlista(i).getSinsel().size();j++){
							for(int k=0;k<manager.getlista(i).getpage(j).getkleidiasize();k++){
								if(manager.getlista(i).getpage(j).getlekseiskleidia(k).equals(kleidaki)){
									parag.addPage((manager.getlista(i).getpage(j)));
								}
							}
						}
					}
					manager.addAlbum(parag);
					manager.addOnomaAlbum(parag);
					AlbumExtractor neoparagwgo=new AlbumExtractor(parag.getName());
					for (int o=0;o<parag.getSinsel().size();o++){
						neoparagwgo.addSlideExtractor(parag.getpage(o).ppp());
					}
					neoparagwgo.exportPOISlideShow();
				}else if(v==-1){
					break;
				}
			}
 			
 			
 			System.out.println("Do you wanna see the names of your album you have made so far?if yes press 1 else press 0 ");
 			int kati=keyboard.nextInt();
 			if (kati==1){
 				
 				for(int i=0; i<manager.getOnomarray().size(); i++){
 					System.out.println(manager.getOnoma(i));
 				}
 			}
 			System.out.println("Thank you for using this program");
 			System.exit(0);
	}

}
