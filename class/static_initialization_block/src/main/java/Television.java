public class Television {
    private static String company = "Samsung";
    private static String model = "LEDTV12345";
    private static String info;

    static{
        info = company + " - " + model;
    }
    public String Info(){
        return info;
    }
}
