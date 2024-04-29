
package estruturarepeticao;
/*
Algoritimo que gere a sequencia númerica finita:
80 78 76... 0
*/

public class estruturarepeticaoex2 {
    
    public static void main(String[] args) {
        int i = 80;
        while(i >=0){
            System.out.println(i);
            i-=2;
            
        }//fim while
        System.out.println("Fim da série.");
    }
}
