public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    Car(){
        this("현대자동차","소나타","흰색",300);
    }
    Car(String company){
        this(company,"소나타","흰색",300);
    }
    Car(String company,String model){
        this(company,model,"흰색",300);
    }
    Car(String company, String model,String color){
        this(company,model,color,300);
    }
    Car(String company, String model, String color, int maxSpeed){
        this.company = company;
        this.model = model;
        this.color= color;
        this.maxSpeed = maxSpeed;
    }
    public void Info(){
        System.out.println("company : "+company);
        System.out.println("model : "+model);
        System.out.println("color : "+color);
        System.out.println("maxSpeed : "+maxSpeed + "\n");


    }
}
