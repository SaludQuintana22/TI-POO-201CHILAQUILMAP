/*********************************************************************
 * ITESS-TICS
 * Enero-Junio
 * Unidad 1. Grafos
 * 1.3 Representacion de estados
 * Autor: SQV
 * Fecha: 15/febrero/2023
 * Descripcion: Grafo!! en representacion de estados, caso de estudio un mapa
 */
public class ChilaquilMap {
    private int N;            //N:renglones
    private int M;            //M:columnas
    private char [][] map;
    private int origenI;
    private int origenJ;
    private int destinyI;
    private int destinyJ;
    private int chilaquilI;
    private int chilaquilJ;
    private boolean withWall;
    private final int LEFT = 0;
    private final int RIGHT = 1;
    private final int UP = 2;
    private final int DOWM = 3;
    
    
    public ChilaquilMap (int N, int M, boolean withWall){
        this.N = N;
        this.M = M;
        this.withWall =withWall;
        map = new char [N][M];    
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                map [i][j]='.';
        }
    }
    }
    
    public void setOrigen (int I, int J) {
        origenI = I;
        origenJ = J;
        
        chilaquilI = I;
        chilaquilJ = J;
        map[I][J] = 'o';
                
    }
      
    public void setDestiny(int I, int J){
        destinyI = I;
        destinyJ = J;
        map[I][J] = 'd';
            
    }
    public void control(int command){
        map[chilaquilI][chilaquilJ] = '.';
        switch(command){
            case LEFT:
                //if (chilaquilJ == 0 && withWall); //no hacer nada
                if(chilaquilJ == 0 && withWall)
                    chilaquilJ = M-1;
                else
                    chilaquilJ--;
                break;
            case RIGHT:
                ////if (chilaquilJ == M-1 && withWall); //no hacer nada
                    
                if(chilaquilJ == M-1 && !withWall)
                    chilaquilJ = 0;
                else
                    chilaquilJ++;
                break;
                case DOWM:
                ////if (chilaquilJ == N-1 && withWall); //no hacer nada
                    
                if(chilaquilJ == N-1 && !withWall)
                    chilaquilJ = 0;
                else
                    chilaquilJ++;
                break;
                
    }
        map[origenI][origenJ] = '0';
        map[chilaquilI][chilaquilJ] ='c';
    }
    public void print(){
        System.out.println("ChilaquilMap----------------");
        System.out.println("renglones N:" + N);
        System.out.println("columnas M:" + M);
        System.out.println("origen I:" + origenI);
        System.out.println("origen J:" + origenJ);
        System.out.println("destiny I:" + destinyI);
        System.out.println("destiny J:" + destinyJ);
    }
    public void prinState(){
        System.out.println("chilaquil is at: (" +
                chilaquilI +
                "," +
                chilaquilJ +
                ")");
        
    }
    public void printMap(){
        System.out.println("chilaquil Map----------");
        for (int i = 0; i < N-1; i++){
            for (int j = 0; j < M-1; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
