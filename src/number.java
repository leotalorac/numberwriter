/**
 * Created by lotalorafox on 2/8/2017.
 */
public class number
{
    public static void main(String[] args){
        //crea el objeto de lectura
        java.util.Scanner read = new java.util.Scanner(System.in);

        char[][] one = {
            {' ',' ',' '},
            {' ','|',' '},
            {' ','|',' '},
        };
        char[][] two = {
                {' ','_',' '},
                {' ','_','|'},
                {'|','_',' '},
        };
        char[][] three = {
                {' ','_',' '},
                {' ','_','|'},
                {' ','_','|'},
        };
        char[][] four = {
                {' ',' ',' '},
                {'|','_','|'},
                {' ',' ','|'},
        };
        char[][] five = {
                {' ','_',' '},
                {'|','_',' '},
                {' ','_','|'},
        };
        char[][] six = {
                {' ','_',' '},
                {'|','_',' '},
                {'|','_','|'},
        };
        char[][] seven = {
                {' ','_',' '},
                {'|',' ','|'},
                {' ',' ','|'},
        };
        char[][] eighth = {
                {' ','_',' '},
                {'|','_','|'},
                {'|','_','|'},
        };
        char[][] nine = {
                {' ','_',' '},
                {'|','_','|'},
                {' ',' ','|'},
        };
        char[][] zero = {
                {' ','_',' '},
                {'|',' ','|'},
                {'|','_','|'},
        };

        double num = read.nextDouble();

        int k = 0;
        while(num>1 ) {
            num = num/10;
            k++;
        }
        char[][] canvas = new char[3][k*3];
        int[] dig = new int[k];
        for(int l= 0;l<k;l++){
            num = (num*10)-(((int)num)*10);
            dig[l] = (int)num;
        }


        //asignar para imprimir
        int w = 0;
        int o =0;
            //filas
            for(int n = 0;n<3;n++){
                w=0;
                o=0;
                //columnas
                while(w<k){
                    //asignacion
                    for(int j = 0;j<3;j++){
                        if(dig[w] == 1) {
                            canvas[n][o+j] = one[n][j];
                        }
                        else if(dig[w] == 2) {
                            canvas[n][o+j] = two[n][j];
                        }
                        else if(dig[w] == 3) {
                            canvas[n][o+j] = three[n][j];
                        }
                        else if(dig[w] == 4) {
                            canvas[n][o+j] = four[n][j];
                        }
                        else if(dig[w] == 5) {
                            canvas[n][o+j] = five[n][j];
                        }
                        else if(dig[w] == 6) {
                            canvas[n][o+j] = six[n][j];
                        }
                        else if(dig[w] == 7) {
                            canvas[n][o+j] = seven[n][j];
                        }
                        else if(dig[w] == 8) {
                            canvas[n][o+j] = eighth[n][j];
                        }
                        else if(dig[w] == 9) {
                            canvas[n][o+j] = nine[n][j];
                        }
                        else if(dig[w] == 0) {
                            canvas[n][o+j] = zero[n][j];
                        }
                    }
                    o+=3;
                    w++;
                }
            }
        //print
        for(int u =0;u<3;u++)
        {
            for (int i = 0; i < k*3; i++) {
                System.out.print(canvas[u][i]);
            }
            System.out.println();
        }
    }
}
