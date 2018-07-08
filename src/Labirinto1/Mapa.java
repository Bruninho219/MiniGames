package Labirinto1;

class Mapa
{
    int[][] geradorMapa(int[][] mat)
    {
        mat=this.baseMapa(mat);
        mat=this.parede(mat);
        mat=this.interior(mat);
        mat=this.metas(mat);
        return mat;
    }

    private int[][] parede(int[][] mat)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                if(i==0 || i==9 || j==0 || j==19)
                {
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }

    private int[][] interior(int[][] mat)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                switch(i)
                {
                    case 1:
                        if (j == 1 || j == 7 || j == 9 || j == 14 || j == 16 || j == 18)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                    case 2:
                        if (j == 1 || j == 2 || j == 4 || j == 5 || j == 7 || j == 9 || j == 11 || j == 12 || j == 13 || j == 14)
                        {
                            mat[i][j] = 0;
                        }
                    case 3:
                        if (j == 5 || j == 6 || j == 7 || j == 9 || j == 11 || j == 16 || j == 18)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                    case 4:
                        if (j == 1 || j == 3 || j == 4 || j == 11 || j == 13 || j == 14 || j == 15 || j == 16)
                        {
                            mat[i][j]=0;
                        }
                        break;
                    case 5:
                        if(j==3 || j==6 || j==7 || j==9 || j==11 || j==13 || j==15 || j==17 || j==18)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                    case 6:
                        if(j==2 || j==3 || j==5 || j==9 || j==11)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                    case 7:
                        if(j==2 || j==5 || j==6 || j==8 || j==9 || j==13 || j==14 || j==15 || j==17 || j==18)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                    case 8:
                        if(j==4 || j==9 || j==10 || j==11 || j==12)
                        {
                            mat[i][j] = 0;
                        }
                        break;
                }
            }
        }
        return mat;
    }

    private int[][] metas(int[][] mat)
    {
        mat[1][1] = 3;
        mat[8][18] = 4;
        return mat;
    }

    private int[][] baseMapa(int[][] mat)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                mat[i][j] = 1;
            }
        }
        return mat;
    }

    public void exibirMapa(int[][] mat)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                if(mat[i][j]==0)
                {
                    System.out.print("XX");
                }
                if(mat[i][j]==1)
                {
                    System.out.print("  ");
                }
                if(mat[i][j]!=0 && mat[i][j]!=1)
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public void MiniMapa(int[][] mat, int x, int y)
    {
        int cont=0;
        System.out.println("________   CONTROLE");
        for (int i = x-1; i < x+2; i++)
        {
            System.out.print("|");
            for (int j = y-1; j < y+2; j++)
            {
                if(i==x && j==y)
                {
                    System.out.print("J ");
                }
                else
                {
                    if(mat[i][j]==0)
                    {
                        System.out.print("XX");
                    }
                    if(mat[i][j]==1)
                    {
                        System.out.print("  ");
                    }
                    if(mat[i][j]==3)
                    {
                        System.out.print("? ");
                    }
                }
            }
            switch (cont)
            {
                case 0:
                    if(mat[x-1][y]!=0)
                    {
                        System.out.print("|   |  1  |");
                    }
                    else
                    {
                        System.out.print("|   |     |");
                    }

                    break;
                case 1:
                    System.out.print("|   |");
                    if(mat[x][y-1]!=0)
                    {
                        System.out.print("2   ");
                    }
                    else
                    {
                        System.out.print("    ");
                    }
                    if(mat[x][y+1]!=0)
                    {
                        System.out.print("3|");
                    }
                    else
                    {
                        System.out.print(" |");
                    }
                    break;
                case 2:
                    if(mat[x+1][y]!=0)
                    {
                        System.out.print("|   |  4  |");
                    }
                    else
                    {
                        System.out.print("|   |     |");
                    }
                    break;
            }
            System.out.println();
            cont++;
        }
        System.out.println("|------|   0 -Desistir xD");
    }
}