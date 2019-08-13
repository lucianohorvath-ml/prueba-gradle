package proyecto.gradle;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class MotoresTest {

    @Test
    public void crearMotorSolar(){
        MotorSolar motor_solar = new MotorSolar(100,60);
        Assertions.assertThat(motor_solar).isNotNull();
    }

    @Test
    public void crearMotorCombustible(){
        MotorCombustible motor_combustible = new MotorCombustible(100,60);
        Assertions.assertThat(motor_combustible).isNotNull();
    }

    @Test
    public void crearMotorNuclear(){
        MotorNuclear motor_nuclear = new MotorNuclear(100,60);
        Assertions.assertThat(motor_nuclear).isNotNull();
    }

    @Test
    public void subirPotenciaMotorNuclear(){
        MotorNuclear motor_nuclear = new MotorNuclear(100, 50);
        Assertions.assertThat(motor_nuclear).isNotNull();
        motor_nuclear.subirPotencia(50);
        Assertions.assertThat(motor_nuclear.getPotencia()).isEqualTo(150);
    }
    @Test
    public void subirPotenciaMotorSolar(){
        MotorSolar motor_solar = new MotorSolar(100, 50);
        Assertions.assertThat(motor_solar).isNotNull();
        motor_solar.subirPotencia(50);
        Assertions.assertThat(motor_solar.getPotencia()).isEqualTo(150);
    }
    @Test
    public void subirPotenciaMotorCombustible(){
        MotorCombustible motor = new MotorCombustible(100, 50);
        Assertions.assertThat(motor).isNotNull();
        motor.subirPotencia(50);
        Assertions.assertThat(motor.getPotencia()).isEqualTo(150);
    }

    @Test
    public void subirPotenciaModificaLaTemperaturaMotorCombustible(){
        MotorCombustible motor = new MotorCombustible(100, 50);
        motor.subirPotencia(50);
        Assertions.assertThat(motor.getTemperatura()).isNotEqualTo(50);
    }

    @Test
    public void subirPotenciaModificaLaTemperaturaMotorSolar(){
        MotorSolar motor_solar = new MotorSolar(100, 50);
        motor_solar.subirPotencia(50);
        Assertions.assertThat(motor_solar.getTemperatura()).isNotEqualTo(50);
    }

    @Test
    public void subirPotenciaModificaLaTemperaturaMotorNuclear(){
        MotorNuclear motor_nuclear = new MotorNuclear(100, 50);
        motor_nuclear.subirPotencia(50);
        Assertions.assertThat(motor_nuclear.getTemperatura()).isNotEqualTo(50);
    }

    @Test
    public void bajarPotenciaMotorNuclear(){
        MotorNuclear motor_nuclear = new MotorNuclear(100, 50);
        motor_nuclear.bajarPotencia(50);
        Assertions.assertThat(motor_nuclear.getPotencia()).isEqualTo(50);
    }

    @Test
    public void bajarPotenciaModificaLaTemperaturaMotorNuclear(){
        MotorNuclear motor = new MotorNuclear(100, 60);
        motor.bajarPotencia(50);
        Assertions.assertThat(motor.getTemperatura()).isEqualTo(10);
    }

    @Test
    public void recibirRefrigeranteNuclear(){
        MotorNuclear motor = new MotorNuclear(100, 100);
        motor.recibirRefrigerante();
        Assertions.assertThat(motor.getTemperatura()).isEqualTo(80);
    }

    @Test
    public void recibirRefrigeranteSolar(){
        MotorSolar motor = new MotorSolar(100, 100);
        motor.recibirRefrigerante();
        Assertions.assertThat(motor.getTemperatura()).isEqualTo(80);
    }
}
