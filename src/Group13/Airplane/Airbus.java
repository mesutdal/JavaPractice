package Group13.Airplane;

public class Airbus extends Airplane {

    private String modern;

    public Airbus(int year, String engine, String modern) {
        super("Airbus", year, engine);
        this.modern = modern;
    }

    @Override
    public void start() {
        System.out.println(sayMyName()+" taking off");
    }

    @Override
    public void stop() {
        System.out.println(sayMyName()+" has landed");
    }

    @Override
    public String toString() {
        return super.toString()+" "+getModel();
    }

}
