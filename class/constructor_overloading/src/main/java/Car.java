public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    public Car(){
        company = "현대자동차";
        model = "소나타";
        color = "흰색";
        maxSpeed = 300;
    }
    public Car(String company, String model, String color,int maxSpeed){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void Info(){
        System.out.println("company "+company );
        System.out.println("model "+model );
        System.out.println("color "+color );
        System.out.println("maxSpeed "+maxSpeed );
    }
}
