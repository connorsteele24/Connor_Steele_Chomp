import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;


    public MyPlayer() {
        columns = new int[10];
        makeBoards();
    }

    //add your code to return the row and the column of the chip you want to take.
    //you'll be returning a data type called Point which consists of two integers.

    public void makeBoards() {

        System.out.println("**************");
        for (int f = 3; f > -1; f--) {
            for (int s = 3; s > -1; s--) {
                for (int t = 3; t > -1; t--) {
                    if (s > f) {
                        s = f;
                    }
                    if (t > s) {
                        t = s;
                    }
                    if (f == 0) {
                        break;
                    }
                    System.out.println("**************");
                    System.out.print(f + "-" + s + "-" + t);
                    System.out.println("");
                    System.out.println("Possible Moves: ");
                    possibleMoves(f, s, t);
                }
            }
        }
    }

    public void possibleMoves(int f, int s, int t){
        for(int i = t-1; i > -1; i--) {
            t = i;
            System.out.println(f + "-" + s + "-" + t);
        }
        for(int k = s-1; k > -1; k--) {
            s = k;
            System.out.println(f + "-" + s + "-" + t);
        }

        for(int h = f-1; h > 0; h--){
            f = h;
            System.out.println(f + "-" + s + "-" + t);
        }
        if(f+s+t == 1){
            System.out.println("YOU LOST!");
        }
    }



    public Point move(Chip[][] pBoard) {


        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        Point myMove = new Point(row, column);

        return myMove;
    }


}
