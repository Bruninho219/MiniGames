package Labirinto1;

public class Movimentos
{
    public int Mov(int opc, int x, int y, int[][] mat)
    {
        switch (opc)
        {
            case 1:
                return this.Up(mat, x, y);
            case 4:
                return this.Down(mat, x, y);
            case 3:
                return this.Right(mat, x, y);
            case 2:
                return this.Left(mat, x, y);
            default:
                return 0;
        }
    }

    private int Up(int[][] mat, int x, int y)
    {
        if(mat[x-1][y]==0)
        {
            System.out.println("Ops! Acho que não :)");
            return x;
        }
        else
        {
            return x-1;
        }
    }
    private int Down(int[][] mat, int x, int y)
    {
        if(mat[x+1][y]==0)
        {
            System.out.println(mat[x][y-1]);
            System.out.println("Ops! Acho que não :)");
            return x;
        }
        else
        {
            return x+1;
        }
    }
    private int Right(int[][] mat, int x, int y)
    {
        if(mat[x][y+1]==0)
        {
            System.out.println("Ops! Acho que não :)");
            return y;
        }
        else
        {
            return y+1;
        }

    }
    private int Left(int[][] mat, int x, int y)
    {
        if(mat[x][y-1]==0)
        {
            System.out.println("Ops! Acho que não :)");
            return y;
        }
        else
        {
            return y-1;
        }
    }
}
