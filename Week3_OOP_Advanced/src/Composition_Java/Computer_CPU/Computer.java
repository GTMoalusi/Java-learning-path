package Composition_Java.Computer_CPU;

public class Computer {

    private CPU cpu; //Composition

    public Computer(CPU cpu){ //Constructor
        this.cpu = cpu;
    }

    //Getter & Setter
    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void startComputer(){
        System.out.println("The computer is starting up");
        cpu.processing();
        System.out.println("The computer is running.");
    }
}
