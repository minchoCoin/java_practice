public class Car {
    private String company = "현대자동차";
    private String model = "그랜저";
    private String color = "검정";
    private int maxSpeed = 350;
    private int speed = 30;

    public String Company() {return company;}
    public String Model() {return model;}
    public String Color() {return color;}
    public int MaxSpeed() {return maxSpeed;}
    public int Speed() {return speed;}
    public void SetSpeed(int speed) {this.speed = speed;}
    public void Info(){
        System.out.println("company : "+company);
        System.out.println("model : "+model);
        System.out.println("color : "+color);
        System.out.println("maxSpeed : "+maxSpeed);
        System.out.println("speed : "+speed);
    }
}
