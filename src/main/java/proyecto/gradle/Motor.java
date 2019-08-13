package proyecto.gradle;

public abstract class Motor {
    Integer potencia;
    float temperatura;

    public Motor(Integer potencia, float temperatura){
        this.potencia = potencia;
        this.temperatura = temperatura;
    }

    public Integer getPotencia(){
        return this.potencia;
    }

    public float getTemperatura(){
        return this.temperatura;
    }

    public void subirPotencia(Integer potencia) {
        this.potencia += potencia;

        //Afecta temperatura
        this.temperatura += potencia;
    }

    public void bajarPotencia(Integer potencia) {
        this.potencia -= potencia;

        //Afecta temperatura
        this.temperatura -= potencia;
    }
}
