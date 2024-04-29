
package exemplosfor;
/*
Program que gere uma serie de fibonacci
1 1 2 3 5 8 13...
*/

public class Exemplo3 {
    
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, a;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i < 20; i++) {
            a = n1 + n2;
            System.out.println(a);
            n1 = n2;
            n2 = a;
            
        }
        }
        
    }
