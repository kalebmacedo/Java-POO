package Aula07;
// Aula 08 é a AGREGAÇÃO entre classes 
public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] =  new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Puts Script", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UEC01 = new Luta(); // criação de uma classe
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.Lutar();
		
		l[0].Status();
		l[1].Status();
		
		
		
		// l[3].setCategoria();
		/*
		 *  Não apresenta ou MUDA pois o set categoria ta 'privado' e não possui argumentos, já que a modificação dele foi direto nele
		 */
	}

}
