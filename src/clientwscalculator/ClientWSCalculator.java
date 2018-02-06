package clientwscalculator;

public class ClientWSCalculator {

    public static void main(String[] args) {   
        int n1 = 500;
        int n2 = 500;
        int n3 = 1000;        
        System.out.println("Suma");
        System.out.println(sum(n1,n2));
        System.out.println("Resta");
        System.out.println(rest(n3,n2));
    }

    private static int rest(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }
    
}
