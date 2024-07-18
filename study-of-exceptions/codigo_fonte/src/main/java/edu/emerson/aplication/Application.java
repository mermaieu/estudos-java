public class Application {
    public static void main(String[ ] args) {

        int[] myNumbers = {1, 2, 3};

        try {
            System.out.println(myNumbers[10]); // error!
            System.out.println(3/0);
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Você tentou acessar uma posicão inexistente no array");
        
        } catch (ArithmeticException e) {
            System.err.println("Não existe divisão por zero");
        }
        System.out.println("O programa continua.");
        

      }
    
}
