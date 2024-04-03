package bank;
import java.util.*;

public class Card {
    private static long CARD_NUMBER;

    private int pinCode;
    public Card(long CARD_NUMBER){
        this.CARD_NUMBER = CARD_NUMBER;
        for(int i = 0; i < 4; i++) {
            pinCode = rnd(0, 9);
            System.out.print(pinCode);
           /*Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            System.out.println("Изменить код - 1, оставить - 2");
            if (ch == 1)  {
                for (int c = 0; c < 4; c++) {
                    pinCode = rnd(0, 9);
                    System.out.println(pinCode);
                } if (ch == 2) {
                    System.out.print("");
                }

            }*/
        }
    }
    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public static void main(String[] ards) {
        Card firstCard = new Card(4545454545L);
        System.out.println(firstCard);
        System.out.println(Card.CARD_NUMBER);
        //System.out.println(new Card(pinCode));
    }

    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
        }

}

