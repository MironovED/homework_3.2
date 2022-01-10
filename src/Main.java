public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(80.5, 1.87);
        System.out.println("ИМТ = " + bodyMassIndex + " кг/м2");
    }
}
