package Labirinto1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        Mapa m = new Mapa();
        Movimentos mov = new Movimentos();

        int xx=10, yy=20;
        int mapa[][] = new int[xx][yy];

        boolean cond;
        int xFim=8, yFim=18;
        int x=1, y=1;
        int opc;

        mapa=m.geradorMapa(mapa, xFim, yFim, xx, yy);
        //m.exibirMapa(mapa);

        System.out.println("Procure pela saída #\n");
        do
        {
            m.MiniMapa(mapa, x, y);
            do
            {
                System.out.print("> ");
                opc=tc.nextInt();
                if(opc==1 || opc==4)
                {
                    x=mov.Mov(opc,x, y, mapa);
                }
                if(opc==2 || opc==3)
                {
                    y=mov.Mov(opc,x, y, mapa);
                }
                cond= mov.VerifVitoria(x, y, xFim, yFim);
            }
            while (opc<0&&opc>4);
        }
        while(opc!=0 && !cond);

        System.out.println("FIM");
    }
}