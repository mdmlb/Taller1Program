package insecto2;

import processing.core.PApplet;
import processing.core.PImage;

public class Taller1 extends PApplet {
 
	int pantalla=0;
	PImage fondoPantalla1, fondoPantalla2, fondoPantallaBarra, fondoPantalla3, imagInsectoPalo1, imagInsectoPalo2,imagInsectoMantis1, imagInsectoMantis2, imagInsectoMariposa1, imagInsectoMariposa2, lista, hojaIzq, hojaDer;
	boolean mostrar1, mostrar2, mostrar3, mostrarLista,mostrarHojaIzq,mostrarHojaDer,mostrar4,mostrar5,mostrar6;
	int posXHojaIzq,posYHojaIzq,posXHojaDer,posYHojaDer;
	int posXInsecto1,posYInsecto1, posXInsecto2, posYInsecto2,posXInsecto3,posYInsecto3;
	
	public static void main(String[] args) {
		PApplet.main("insecto2.Taller1");

	}
	public void settings() {
		  size(1000, 700);
	  
	}	
	public void setup() {
		
		  fondoPantalla1=loadImage("../imagenes/PRIMERA PAGINA.jpg");
		  fondoPantalla2=loadImage("../imagenes/SEGUNDA PAGINA.jpg");
		  fondoPantallaBarra=loadImage("../imagenes/BARRA.jpg");
		  fondoPantalla3=loadImage("../imagenes/TERCERA PAGINA.jpg");
		  imagInsectoPalo1=loadImage("../imagenes/ATRAPAR-INSECTO PALO.png");
		  imagInsectoMantis1=loadImage("../imagenes/ATRAPAR-MANTIS.png");
		  imagInsectoMariposa1=loadImage("../imagenes/atrapar-polilla.png");
		  imagInsectoPalo2=loadImage("../imagenes/ATRAPAR-INSECTO PALO2.png");
		  imagInsectoMantis2=loadImage("../imagenes/ATRAPAR-MANTIS2.png");
		  imagInsectoMariposa2=loadImage("../imagenes/atrapar-polilla2.png");
		  lista=loadImage("../imagenes/lista.png");
		  hojaIzq=loadImage("../imagenes/SEGUNDA PAGINA-HOJA LADO IZQUIERDA.png");
		  hojaDer=loadImage("../imagenes/SEGUNDA PAGINA-HOJA LADO DERECHA.png");
		  mostrar1=true;
		  mostrar2=true;
		  mostrar3=true;
		  mostrar4=true;
		  mostrar5=true;
		  mostrar6=true;
		  mostrarLista=false;
		  mostrarHojaIzq=false;
		  mostrarHojaDer=false;
		  
		  posXHojaIzq=78;
		  posYHojaIzq=513;
		  posXHojaDer=910;
		  posYHojaDer=513;
		  
		  //insecto ubicación
		  
		  posXInsecto1=875;
		  posYInsecto1=470;
		  
		  posXInsecto2=48;
		  posYInsecto2=470;
		  
		  posXInsecto3=764;
		  posYInsecto3=131;
		}
		public void draw() {
		  background(0);
		  switch(pantalla) {
		  
		    case 0:
		    image(fondoPantalla1, 0, 0, 1000, 700);
		    break;
		    
		  case 1:
		  
		      image(fondoPantalla2,0,0,1000,650);
		     
		      //insectos en el juego
		      
		      if(mostrar1==true){
		        imageMode(CENTER);
		        image(imagInsectoPalo1,posXInsecto1,posYInsecto1,62,157);
		        imageMode(CORNER);
		      }
		      
		      if(mostrar2==true){
		        imageMode(CENTER);
		        image(imagInsectoMantis1,posXInsecto2,posYInsecto2,68,96);
		        imageMode(CORNER);
		      }
		      
		      if(mostrar3==true){
		        imageMode(CENTER);
		        image(imagInsectoMariposa1,posXInsecto3,posYInsecto3,65,45);
		        imageMode(CORNER);
		    }
		      
		      //lista
		      
		      if(mostrarLista==true){
		        image(lista,225,0,172,119);
		      }

		      
		    //hojas
		      imageMode(CENTER);
		      image(hojaIzq,posXHojaIzq,posYHojaIzq,291,332);
		      imageMode(CORNER);
		      
		      imageMode(CENTER);
		      image(hojaDer,posXHojaDer,posYHojaDer,291,332);
		      imageMode(CORNER);
		      
		      
		      //barra de abajo
		      
		    image(fondoPantallaBarra,0,600,1000,100);
		    
		    //Insectos en la barra
		    
		    if(mostrar4==false){
		        image(imagInsectoPalo2,150,620,157/2+40,62/2+40);
		      }
		      
		      if(mostrar5==false){
		        image(imagInsectoMantis2,350,620,48+40,34+40);
		      }
		      
		      if(mostrar6==false){
		        image(imagInsectoMariposa2,600,620,65+20,45+20);
		      }
		    
		    break;

		  case 2:
		    image(fondoPantalla3, 0, 0,1000,700);
		    break;
		}
		fill(255);
		  text("X:" +mouseX+ "Y:" +mouseY, mouseX, mouseY);
		}

		public void mouseDragged(){
		  switch(pantalla) {
		  case 1:
		    //Las hojas se tienen que ir a la izquierda o derecha, respectivamente, para que quede mas comodo mover a los insectos
		    if(pmouseX >= posXHojaIzq && pmouseX <= posXHojaIzq+291
		       && pmouseY >= posYHojaIzq && pmouseY <= posYHojaIzq+332){
		         posXHojaIzq = mouseX;
		         posYHojaIzq = mouseY;
		       }
		       
		    if(pmouseX >= posXHojaDer && pmouseX <= posXHojaDer+291
		       && pmouseY >= posYHojaDer && pmouseY <= posYHojaDer+332){
		         posXHojaDer = mouseX;
		         posYHojaDer = mouseY;
		     }
		  
		     //INSECTOS
		     
		     println(posXInsecto3);
		     println(mouseX);
		     println(posXInsecto3+65);
		     println(pmouseX >= posXInsecto3 && pmouseX <= posXInsecto3+65);
		     
		     if(pmouseX >= posXInsecto3 && pmouseX <= posXInsecto3+65
		     && pmouseY >= posYInsecto3 && pmouseY <= posYInsecto3+45){
		       posXInsecto3 = mouseX;
		       posYInsecto3 = mouseY;
		  
		       if(posYInsecto3 >= 600){
		         mostrar6 = false;
		       }else{
		         mostrar6=true;
		       }
		       
		     }
		     
		     if(pmouseX >= posXInsecto1 && pmouseX <= posXInsecto1+62
		     && pmouseY >= posYInsecto1 && pmouseY <= posYInsecto1+157){
		       posXInsecto1 = mouseX;
		       posYInsecto1 = mouseY;
		  
		          if(posYInsecto1 >= 600){
		            mostrar4 = false;
		          }else{
		            mostrar4=true;
		          }
		       
		     }
		     
		     if(pmouseX >= posXInsecto2 && pmouseX <= posXInsecto2+68
		     && pmouseY >= posYInsecto2 && pmouseY <= posYInsecto2+96){
		       posXInsecto2 = mouseX;
		       posYInsecto2 = mouseY;
		       
		         if(posYInsecto2 >= 600){
		           mostrar5 = false;
		         }else{
		           mostrar5=true;
		         }
		       
		     }
		     
		     break;
		  }
		}


		public void mouseClicked() {
		  switch(pantalla) {
		  case 0:

		    // se limita el click de forma rectangular porque el boton es ovalado

		    if (mouseX>=578 && mouseX<=578+340 && mouseY>=414 && mouseY<=414 + 190) {
		      pantalla=1;
		    }

		    break;
		    
		  case 1:
		 
		    /*solo se da click en finalizar y es después de que los insecto se 
		      muestren en la parte inferior de la pantalla*/
		    
		    if (mouseX>=784 && mouseX<=784+220 && mouseY>587 && mouseY<=587+713) {
		      pantalla=2;
		    }
		    
		   /* la lista se quedará en la pantalla con el fin del que el jugador sepa que 
		       insectos debe atrapar*/
		 
		    if(mouseX>=48 && mouseX<=48+158 && mouseY>26 && mouseY<=26+89){
		      mostrarLista=true;
		    }
		    break;
		    
		  case 2:
		    break;
		  }
		}

}




