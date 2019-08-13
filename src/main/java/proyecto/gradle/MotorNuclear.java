package proyecto.gradle;

public class MotorNuclear extends Motor {

    public MotorNuclear(Integer potencia, float temperatura){
        super(potencia, temperatura);
    }

    public void recibirRefrigerante(){
        this.temperatura *= 0.8;
    }
}
