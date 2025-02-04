package nomeandoitems;

public class NomesSignificativos {
    public static void main(String[] args) {

        System.out.println(sum(20, 30));
        System.out.println(calculatedAdjustedItem(3, 3));
        System.out.println(calculatedAdjustedItem(1,2));

    }

    /**
     * Exercicio de fixação 1 Renomeando Variáveis
     *
     * O código abaixo usa nomes de variáveis ruins. Reescreva-o usando nomes mais descritivos.
     *
     * public static void main(String[] args) {
     *         int a = 10;
     *         int b = 20;
     *         int c = a + b;
     *         System.out.println(c);
     *     }
     */
    private static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    /**
     * Exercicio de fixação 2: Melhorando Nomes de Métodos
     * O método abaixo tem um nome genérico. Melhore o nome para torná-lo mais significativo.
     * private static int doSomething(int x, int y) {
     *        return x * y + 10;
     *    }
     */

    private static int calculatedAdjustedItem(int number1, int number2){
        return number1 * number2 + 10;
    }

    /**
     * Exercicio de fixação 3: Refatorando Constantes
     * O código abaixo contém valores mágicos. Substitua-os por constantes com nomes significativos.
     * public double calculateTotal(double price) {
     *         return price + (price * 0.15);
     *     }
     */
    private static final double SERVICE_FEE_RATE = 0.15;
    public double calculateTotal(double price) {
//        final double fees = 0.15;

        return price + (price * SERVICE_FEE_RATE);
    }

    /**
     * Exercicio de fixação 4: Evitando Abreviações
     * Os nomes de variáveis abaixo são abreviados e difíceis de entender. Substitua-os por nomes claros e descritivos.
     *  private String ordId;
     *     private double amt;
     *
     *     public Order(String ordId, double amt) {
     *         this.ordId = ordId;
     *         this.amt = amt;
     *     }
     *
     *     public void prntOrd() {
     *         System.out.println("Order ID: " + ordId + ", Amount: " + amt);
     *     }
     */

    private String orderId;
    private double totalAmount;

    public void Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId + ", Amount: " + totalAmount);
    }

    /**
     * Exercicio de fixação 5: Melhorando Nomes de Classes
     *A classe abaixo tem um nome vago. Renomeie-a para algo mais significativo e melhore os nomes dos métodos.
     * public void go() {
     *         System.out.println("Processing data...");
     *     }
     */

    public void processData() {
        System.out.println("Processing data...");
    }






}
