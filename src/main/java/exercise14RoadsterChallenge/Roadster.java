package exercise14RoadsterChallenge;

public class Roadster {

    float topSpeed, acceleration, crazyTopSpeed, crazyAcceleration;

    public Roadster(float topSpeed, float acceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed(){
        return topSpeed;
    }

    public float getAcceleration(){
        return acceleration;
    }

    public float getTopSpeed(boolean crazyMode){
        if(crazyMode){
            return crazyTopSpeed;
        }
        return topSpeed;
    }

    public float getAcceleration(boolean crazyMode){
        if(crazyMode){
            return crazyAcceleration;
        }
        return acceleration;
    }

}
