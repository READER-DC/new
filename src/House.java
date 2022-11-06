public class House {
    private Window window;

    public House(Window window){
        this.window = window;
    }

    public void view(){
        window.open();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Window window = new PlasticWindow();
        new House(window).view();
        window = new WoodWindow();
        new House(window).view();

    }
}