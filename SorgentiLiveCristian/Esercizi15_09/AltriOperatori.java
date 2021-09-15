public class AltriOperatori {
    public static void main(String[] args) {
        int x=1;
        x+=2; //x = x + 2;
        /* -=
        *=
        /=
        %=  */
        int y = 3;
        y-=1;  //y = y - 1; 
        System.out.printf("x= %d",x);

        int a=4;
        ++a; //a = a + 1;  Incrementa la variabile a di 1
        a+=1; //a = a + 1   Questo è equivalente a quello sopra
        
        int b = 7;
        --b; //b = b - 1;
        b-=1;
        b=b-1;

        //Operatori di postincremento e postdecremento
        int c = 15;
        //c++; //equivale a c=c+1
        int z;
        z=3 + ++c ;
        System.out.printf("\nDopo il preincremento z = %d",z);

        c=15;

        z= 3 + c++;  
        System.out.printf("\nc=%d\n",c);  
        System.out.printf("\nDopo il postincremento z = %d",z);

        //Il post incremento stampa il valore non incrementato
        int d=3;
        System.out.printf("\nd=%d\n",d++);
        
    
    }
}
