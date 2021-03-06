package cd.lunarlander.impl.control;

import cd.lunarlander.exercise.Lander;

public class BasicLandingControl implements LanderController{

    @Override
    public void control(Lander lander) {



        if (lander.getAltitude() < 20){
            lander.descentThrusterOn(5);
        }
        else if (lander.getAltitude() < 100){
            lander.descentThrusterOn(3);
        }
        else if (lander.getAltitude() < 200){
            lander.descentThrusterOn(1);
        }
        else{
            lander.descentThrusterOff();
        }

    }
}
