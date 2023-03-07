public class InterfaceBlogExample{
    public static void main(String[] args){
        // Creating hard coded wheels
        DefaultWheels hardCodedWheels = new DefaultWheels();
        // Injecting hard coded wheels
        Car nonMantainableCar = new Car(hardCodedWheels);
        nonMantainableCar.roll();
        //Rolling

        //Using interface
        Wheels defaultWheels = new DefaultWheelsImpl();
        Wheels AwesomeWheelsImpl = new  AwesomeWheelsImpl();
        // New car with default wheels
        MaintainableCar maintainableCar = new MaintainableCar(defaultWheels);
        maintainableCar.roll();
        // Went to the dealer, and decided to change wheels
        maintainableCar.changeWheels(AwesomeWheelsImpl);

        maintainableCar.roll();
        //Car still rolling

    }
}

class DefaultWheels{
    public void roll(){
        System.out.println("Let's roll with hard coded wheels!!");
    }

}


// This is a non maintainable car
class Car{
    // This are the default wheels
    private DefaultWheels carWheel;

    Car(DefaultWheels wheels){
        carWheel = wheels;
    }

    void roll(){
        carWheel.roll();
    }

    // at this point, your car is hard coded to use just the default wheels.
    // putting other wheels on it will not work (obviously).
}


class MaintainableCar{

    Wheels wheels;

    MaintainableCar(){}

    MaintainableCar(Wheels wheels){
        this.wheels = wheels;
    }

    void roll(){
        wheels.roll();
    }

    void changeWheels(Wheels newWheels){
        this.wheels = newWheels;
    }

}

interface Wheels{

    void roll();

}

// The same default wheels but now, implementing the Wheels interface
class DefaultWheelsImpl implements Wheels{


    @Override
    public void roll(){
        System.out.println("Let's roll :/ with defult wheels!!");
    }

}

class AwesomeWheelsImpl implements Wheels{

    @Override
    public void roll(){
        System.out.println("Let's ROOOLLL with Awesome Wheels!!");
    }

}