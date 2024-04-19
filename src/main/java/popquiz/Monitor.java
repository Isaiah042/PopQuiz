package popquiz;

public class Monitor extends Resolution{

    private String model;

    private String manufacturer;

    public Monitor(double width, double height, String model, String manufacturer) {
        super(width, height);
        this.model = model;
        this.manufacturer = manufacturer;
    }

    static void drawPixel(int x, int y, String color){

        System.out.println("Drawing pixel at " + x + ", " + y + " " + "in color " + color);

    }


}
