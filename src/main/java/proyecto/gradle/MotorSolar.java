package proyecto.gradle;

public class MotorSolar extends Motor {

    public MotorSolar(Integer potencia, float temperatura){
        super(potencia, temperatura);
    }

    public void recibirRefrigerante(){
        this.temperatura *= 0.8;
    }
}
