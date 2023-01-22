import models.Phone;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        samsung.setModel("Samsung Galaxy s22");
        samsung.setNumber("0770694205");
        samsung.setWeight(168);

        Phone iphone = new Phone("0755981698", "Iphone 14");
        iphone.setWeight(172);

        Phone mi = new Phone("0705668077", "Mi 11 Ultra", 234);
        Phone[] phones = new Phone[]{samsung, iphone, mi};
        String[] names = new String[]{"Gulzina", "Lily", "Chris", "John", "Tom", "Emma"};
        String[] numbers = new String[]{samsung.getNumber(), iphone.getNumber(), mi.getNumber(), "0999789670", "0755897865"};


        for (int i = 0, j = 0; i < phones.length; i++, j += 2) {
            System.out.println("____________________________");
            System.out.println(phones[i]);
            System.out.println();
            phones[i].receiveCall(names[j]);
            phones[i].receiveCall(names[j + 1], phones[i].getNumber());
            phones[i].sendMessage(numbers);
            System.out.println("____________________________");
        }

    }
}