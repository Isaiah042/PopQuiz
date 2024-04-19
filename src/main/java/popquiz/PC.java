package popquiz;

public class PC {

    private String aCase;

    private String motherboard;

    private String monitor;

    public PC(String aCase, String motherboard, String monitor) {
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(){

        Monitor.drawPixel(5, 10, "blue");

    }

    public void description(){

        System.out.println("Welcome to worst buy below is the description of the pc on sale today: " +
        "\n"+ aCase + " " + monitor + " " + motherboard);


    }



    public void powerUp(){
    Case.pressPowerButton();
    drawLogo();
    MotherBoard.loadProgram("intel");
    }

    @Override
    public String toString() {
        return aCase + motherboard + monitor;
    }
}
