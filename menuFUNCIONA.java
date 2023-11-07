//package E1T1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class menuFUNCIONA {

 	 public static void main(String[] args) {
	        panela();
	    }
 	 
 	 public static void fitxMenua() {
	   Scanner fp = new Scanner(System.in);

 		System.out.println("--------------------AIA--------------------");
		System.out.println("");
		System.out.println("Bezeroak irakurri [1]:");
		System.out.println("Bezeroaren telefonoak [2]");
		System.out.println("Eskari irakurtzeko [3]");
		System.out.println("Eskari lerroa irakurri [4]:");
		System.out.println("Langileen datuak irakurri [5]:");
		System.out.println("");
		
		System.out.println("Idatzi zer fitxategi irakurri nahi duzu");
		//String fitxategiPanela = fp.nextLine();
		
		String auk = fp.nextLine();
		int auk1 = Integer.parseInt(auk);

		switch (auk1) {
			case 1:
			 String bzFitxategi = "bezero.txt";
		     File archivo = new File(bzFitxategi);

		        if (archivo.exists()) {
		            try {
		                FileInputStream fileInputStream = new FileInputStream(archivo);
		                int byteLeido;
		                while ((byteLeido = fileInputStream.read()) != -1) {
		                    System.out.print((char) byteLeido);
		                }

		                fileInputStream.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		        }		
				break;

				case 2:
 				String bezero_tlf = "bezero_tlf.txt";
		     	File fitx = new File(bezero_tlf);

		        if (fitx.exists()) {
		            try {
		                FileInputStream fileInputStream = new FileInputStream(fitx);
		                int byteLeido;
		                while ((byteLeido = fileInputStream.read()) != -1) {
		                    System.out.print((char) byteLeido);
		                }

		                fileInputStream.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		        }	
				break;

			case 3:
				String esk = "eskari.txt";
		     	File esk_fitx = new File(esk);

		        if (esk_fitx.exists()) {
		            try {
		                FileInputStream fileInputStream = new FileInputStream(esk_fitx);
		                int byteLeido;
		                while ((byteLeido = fileInputStream.read()) != -1) {
		                    System.out.print((char) byteLeido);
		                }
		                fileInputStream.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		        }		
				
				break;

					case 4:
					String esk_lerro = "eskari_lerro.txt";
		     		File esk_lrr = new File(esk_lerro);

		        	if (esk_lrr.exists()) {
		           	 try {
		                FileInputStream fileInputStream = new FileInputStream(esk_lrr);
		                int byteLeido;
		                while ((byteLeido = fileInputStream.read()) != -1) {
		                    System.out.print((char) byteLeido);
		                }

		                fileInputStream.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		        }						
				break;

					case 5:
					String langile = "langile.txt";
		     		File lgl = new File(langile);

		        	if (lgl.exists()) {
		           	 try {
		                FileInputStream fileInputStream = new FileInputStream(lgl);
		                int byteLeido;
		                while ((byteLeido = fileInputStream.read()) != -1) {
		                    System.out.print((char) byteLeido);
		                }

		                fileInputStream.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        } else {
		            System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		        }					break;
				
			default:
		        System.out.println("Ooops!! Fitaxtegi ez da aurkitu!!");
		}

		
			
			
		
		
		  
		
 	 }

	    public static void panela() {
	        Scanner sc = new Scanner(System.in);

	        boolean saioa = false;
	        while (!saioa) {
	            System.out.println("--------------------AIA--------------------");
	            System.out.print("Erabiltzaile: ");
	            String erabiltzailea = sc.nextLine();
	            System.out.print("Pasahitza: ");
	            String klabea = sc.nextLine();

	            if (erabiltzailea.equals("user") && klabea.equals("1234")) {
	                saioa = true;
	                System.out.println("Kaixo. Ongi etorri!");
	                logo();
	                menua();
	            } else {
	                System.out.println("Zerbait txarto egin duzu... saiatu berriro :O");
	            }
	        }
	    }
	
	
	 public static void clearConsole() {
		        // Imprimir varias líneas en blanco para limpiar la consola
		        for (int i = 0; i < 5; i++) {
		            System.out.println();
		        }
		    }
	
	   public static void logo () {
		   //trianguloInvertido (4)
	       for (int i = 4; i >= 1; i--){//altura
	           for (int j = 4 - i; j > 0; j--){//espacios en blanco
	               System.out.print(" ");
	           }
	           for(int k = 1; k <= i*2-1; k++){//asteriskoak
	               System.out.print("*");
	           }
	           System.out.println();
	        }            

	       //triangulo (3)
	       for (int i = 1; i <= 3; i++){//altura
	           for (int j = 0; j < 3-i; j++){//espacios en blanco
	               System.out.print(" ");
	           }
	           for(int k = 1; k <= i*2+1; k++){//asteriskoak 
	               System.out.print("*");
	           }
	           System.out.println();
	        }   
	       
	       unaEstrella();
	       patitas(3);
	       lineaEstrellas ();
	       
	       //tres estrellas hacia abajo
	       for (int i = 1; i <= 3; i++){
	         for (int j = 1; j <= 3; j++){
	            System.out.print(" ");
	         }
	         for(int k = 1; k <= 1; k++){
	            System.out.print("*");
	         }
	         System.out.println();
	       }
	       
	       lineaEstrellas ();
	       unaEstrella();  
	       patitas(3);
	       
	   }//esta llave cierra el main 
	   
	   public static void patitas(int altura){
	      for (int i = 1; i <= altura; i++){//altura
	           for (int j = 0; j < altura-i; j++){//espacios en blanco
	               System.out.print(" ");
	           }
	           for(int k = 0; k <= 0; k++){//asteriskoak 
	               System.out.print("*");
	               
	               //triangeluaren barruko espazioa
	                  for (int n = 0; n < i*2-1; n++){
	                     System.out.print(" ");
	                  }
	                  System.out.print("*");
	            }
	            System.out.println();
	      }   
	   }
	     
	   public static void unaEstrella (){
	      for (int j = 1; j < 4; j++){//espacios en blanco
	          System.out.print(" ");
	       }
	       for(int k = 1; k <= 1; k++){//asteriskoa 
	          System.out.print("*");  
	       }
	       System.out.println(); 
	   }              
	   
	   public static void lineaEstrellas(){
	      for (int i = 1; i <= 7; i++){
	         System.out.print("*");
	      }
	      System.out.println();
	   }         
	   
	   public static void menua() {
		   
		System.out.println("--------------------AIA--------------------");
		System.out.println("1. A&A-ko langileak erakutzi");
		System.out.println("2. Bezeroaren informazioa erakutzi");
		System.out.println("3. Fitxategi kontsultatu");
		System.out.println("4. Saioa itxi [X]");

		int aukera = 0;
			Scanner sc = new Scanner(System.in);
		while (aukera != 4) {
			System.out.print("Aukeratu aukera: ");

			if (sc.hasNextInt()) {
				aukera = sc.nextInt();
				sc.nextLine(); //

				switch (aukera) {

				case 1:
					System.out.println("--------------------AIA--------------------");
					
					System.out.print("Zer nahi duzu ikustea? [Nagusi | Langile]: ");
					String kontsulta = sc.nextLine();
					

					if (kontsulta.equalsIgnoreCase("Nagusi")) {
					    System.out.println("Idatzi nagusiaren izena.");
					    String nagusiIzena = sc.nextLine();

					if (nagusiIzena.equalsIgnoreCase("Asier")) {
					    	
					        int tlf = 640301246;
					        String alta = "3/5/1999";
					        
					        System.out.println("Izena: " + nagusiIzena);
					        System.out.println("Telefonoa: " + "(+34)" + tlf);
					        System.out.println("Alta eguna: " + alta);

					        System.out.println("Pultsatu 'A' tekla atzera joateko");
					        String a = sc.nextLine();

					        if (a.equalsIgnoreCase("A")) {
					            menua();
					        } else {
					            System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
					            menua();
					        }
					    	} else {
					    		System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
					        menua();
					    }
							} else if (kontsulta.equalsIgnoreCase("Langile")) {
								System.out.println("Idatzi langilearen izena.");
								String lgIzena = sc.nextLine();

					if (lgIzena.equalsIgnoreCase("Alba")) {
					    	
					        String email = "alba@alba.com";		        
					        int lgTlf = 640367204;
					        
					        System.out.println("Izena: " + lgIzena);
					        System.out.println("Telefonoa: " + "(+34)" + lgTlf);
					        System.out.println("Alta eguna: " + email);

					        System.out.println("Pultsatu 'A' tekla atzera joateko");
					        String a = sc.nextLine();

					        if (a.equalsIgnoreCase("A")) {
					            menua();
					        } else {
					            System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
					            menua();
					        }
					    	} else {
					    		System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
					    		menua();
					    }
							} else {
								System.out.println("Zerbait okerra dago :( .");
								System.out.println("");
								menua();
					}
		break;

		case 2:
						System.out.println("--------------------AIA--------------------");
						System.out.println("Idatzi bezeroaren izena");
						String bezero = sc.nextLine();

						String bzMail = "pepe@pepemail.com";
						int bzTlf = 640506921;

						if (bezero.equalsIgnoreCase("Pepe")) {
							System.out.println("Izena: " + bezero);
							System.out.println("Telefonoa: " + "(+34)" + bzTlf);
							System.out.println("Email: " + bzMail);
							System.out.println(""); 
						}
							else {
							    System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
							    menua();
							}
						
						System.out.println("------------FAKTURA EGITEKO IDATZI DATUAK-----------");
						System.out.println("");

						// BEZEROAREN DATUAK IDATZI FAKTURA EGITEKO

					
						System.out.println("Eskaera zenbakia sartu");
							
						int eZbk = sc.nextInt();
						sc.nextLine();
			         			         
						System.out.println("Idatzi produktuaren izena");
						String produktu = sc.nextLine();

						System.out.println("Idatzi produktuaren prezioa");
						double prezio = sc.nextDouble();
						sc.nextLine(); // Consumir el salto de línea pendiente

						System.out.println("Idatzi produktuaren kopurua");
						int kopurua = sc.nextInt();

						System.out.println("Eskaera zenbaki: " + eZbk);
						System.out.println("Produktuaren izena: " + produktu);
						System.out.println("Produktuaren prezioa: " + prezio + " €");
						System.out.println("Produktuaren kopurua: " + kopurua);

						double totala = prezio * kopurua;
						System.out.println("Totala: " + (double)Math.round(totala * 100d) / 100d + "€");
						System.out.println("");
			    	
			    	
			    	/* FAKTURA */
			    	
			    	
			    	   try {
						      FileWriter fak = new FileWriter("faktura.txt");
						      fak.write("Eskaera:" + eZbk + "\n" + "Produktua:" + produktu + 
						    		  "\n" + "Prezio:" + prezio + "\n" + "Totala:" +totala + "€" );
						      fak.close();
						      System.out.println("Faktura eginda.");
						    } catch (IOException e) {
						      System.out.println("Zerbait txarto egin duzu... :(");
						      e.printStackTrace();
						    }
			    	
			    		/* VOLVEMOS PARA ATRÁS */ 	
			    		Scanner scs = new Scanner(System.in);
			    		System.out.println("Pultsatu 'A' tekla atzera joateko");
			    		String a = scs.nextLine();

		    		if (a.equalsIgnoreCase("A")) {
		    		menua();
		    	}   else {
		       	 		System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
		        	menua();
		   	 }
					break;					
		case 3:
						
			    		fitxMenua();
			    		
			    		/* VOLVEMOS PARA ATRÁS */ 	
					        
			    		Scanner atzera = new Scanner(System.in);
			    		System.out.println("Pultsatu 'A' tekla atzera joateko");
			    		String atz = atzera.nextLine();

			    		if (atz.equalsIgnoreCase("A")) {
			    			menua();
			    		}   else {
		       	 		System.out.println("Zerbait txarto egin duzu, zaiatu berriro!");
		       	 			menua();
			    		}
			    		
					break;
		case 4:
		
			        	System.out.print("Deseas cerrar sesión? (Bai/Ez): ");
			        	String itxi = sc.nextLine();

			       if (itxi.equalsIgnoreCase("Bai")) {
			            System.out.println("Agur!!.");
			            System.out.println("");
			            clearConsole();
			            panela();		

			       } else if (itxi.equalsIgnoreCase("Ez")) {
			            System.out.println("Zer egin nahi duzu?.");
			            System.out.println("");
			            
			            menua();
			            
			            
			        } else {
			            System.out.println("Erantzuna okerra dago :( .");
			            System.out.println("");
			            menua();
			        }
			        break;
		
				default:
					
				System.out.println("Zerbait txarto egin duzu....");
				break;
		}
	} 
	else {

		System.out.println("Zerbait txarto egin duzu....");
		sc.nextLine(); // 
				}
			}
	   }
}