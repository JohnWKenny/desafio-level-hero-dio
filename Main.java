public class Main
{
	public static void main(String[] args) {
	    String hero = "John";
	    String nivel;
	    int XP = 100000000;
	    
	    if(XP < 1000) nivel = "Ferro";
	    else if(XP < 2000) nivel = "Bronze";
	    else if(XP < 5000) nivel = "Prata";
	    else if(XP < 7000) nivel = "Ouro";
	    else if(XP < 8000) nivel = "Platina";
	    else if(XP < 9000) nivel = "Ascendente";
	    else if(XP < 10000) nivel = "Imortal";
	    else nivel = "Radiante";
	    
		System.out.println("O Herói de nome "+ hero +" está no nível de " + nivel);
	}
}
