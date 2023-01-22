package models;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        this.number = number;
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessage(String[] numbers) {
        System.out.println("С номера " + number + " отправлено сообщение следующим номерам:");
        for (String number : numbers) {
            if(number.equals(this.number)) continue;
            System.out.println(number);
        }
    }


    @Override
    public String toString() {
        return "Телефон" +
                "\nНомер: " + number +
                "\nМодель: " + model +
                "\nВес: " + weight + " грамм";
    }

}
