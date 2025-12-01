package sprint01Level02Only;

public abstract class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public void call(String number) {
        System.out.println("Call de number" + number);

    }

}

        interface Camera{
          void photograph();

}

        interface Clocck{
            void alarm();

}

