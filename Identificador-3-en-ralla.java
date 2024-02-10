public class Main {
  public static void main(String[] args) {
  	int[][] board = {{2,1,1},{1,1,2},{2,2,1}};
    
    
    //Ver tablero
     for(int i = 0; i < board.length; i++){
    	for (int j = 0; j < 3 ; j++){
        	System.out.print(board[i][j]);
        }
        System.out.println("");
    }
    
    
    //Cambair el 2 por un 50
     for(int i = 0; i < board.length; i++){
    	for (int j = 0; j < 3 ; j++){
        	if(board[i][j] == 2){
            	board[i][j] = 50;
            }
        }
    }
    //Boleano True == SI han ganado alguno
    boolean win = false;
    //Mirar se hay tres X o 0 seguidas 
    
    int cont = 0;
    //Horizontal
     for(int i = 0; i < board.length; i++){
    	for (int j = 0; j < 3 ; j++){
        	cont = cont + board[i][j];
            if (cont == 3){
				System.out.println("Gana_1");
                win = true;
            }
            else if (cont == 150){
            	System.out.println("Gana_2");
                win = true;
            }
        }
        cont = 0;
    }
    
    //Vertical
    for(int i = 0; i < board.length; i++){
    	for (int j = 0; j < 3 ; j++){
        	cont = cont + board[j][i];
            if (cont == 3){
				System.out.println("Gana_1");
                win = true;
            }
            else if(cont == 150){
            	System.out.println("Gana_2");
                win = true;
            }
        }
        cont = 0;
    }
    //Cruzado derecha
    cont = board[0][0] + board[1][1] + board[2][2];
    if (cont == 3){
    	System.out.println("gana_1");
        win = true;
    }
    else if (cont == 150){
    	System.out.println("gana_2");
        win = true;
    }
    cont = 0;
    //Cruzado derecha
    
    
    cont = board[0][2] + board[1][1] + board[2][0];
    if (cont == 3){
    	System.out.println("gana_1");
        win = true;
    }
    else if (cont == 150){
    	System.out.println("gana_2");
        win = true;
    }
    //Primero  Identificar si hay algun 0 en el tablero
    boolean  zero = false;
    
    for(int i = 0; i < board.length; i++){
    	for (int j = 0; j < 3 ; j++){
        	if(board[i][j] == 0){
            	zero = true;
            }
        }
    }
    //Hay zeros?
    if (zero == true && win == false){
    	System.out.println("No ha acabado la partida");
    }
    else if (zero == false && win == false){
    	System.out.println("Empate");
    }
  }
}
