package Labirinto1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        Mapa m = new Mapa();
        Movimentos mov = new Movimentos();

        int mapa[][] = new int[10][20];

        int x=1, y=1;
        int opc;

        mapa=m.geradorMapa(mapa);
        //m.exibirMapa(mapa);

        do
        {
            //Limpar tela
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
            }
            while (opc<0&&opc>4);
        }
        while(opc!=0);
        System.out.println("FIM");
    }
}
