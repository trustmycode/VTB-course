class Main {
    public static void main (String[] args) {
        int count = 0;
        boolean isGreenLight = false;
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        if (isGreenLight) {
            System.out.println("Все игроки проходят!");
        } else {
            if (speedOfPlayer1 > 0) {
                count++;
            }
            if (speedOfPlayer2 > 0) {
                count++;
            }
            if (speedOfPlayer3 > 0) {
                count++;
            }
            if (count == 0) {
                System.out.println("Все игроки стоят. Молодцы");
            } else if (count == 1) {
                System.out.println("Выбыл " + count + " игрок.");
            } else {
                System.out.println("Выбыло " + count + "-е игроков.");
            }
        }
    }
}
/*import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите режим программы. 1 или 2");
        int mode = sc.nextInt();
        if (mode == 1) {
            easy(count);
        } else {
            advanced(count, sc);
        }
        sc.close();
    }
    public static void easy(int count) {
        boolean isGreenLight = false;
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        if (isGreenLight) {
            System.out.println("Все игроки проходят!");
        } else {
            if (speedOfPlayer1 > 0) {
                count++;
            }
            if (speedOfPlayer2 > 0) {
                count++;
            }
            if (speedOfPlayer3 > 0) {
                count++;
            }
            if (count == 0) {
                System.out.println("Все игроки стоят. Молодцы");
            } else if (count == 1) {
                System.out.println("Выбыл " + count + " игрок.");
            } else {
                System.out.println("Выбыло " + count + "-е игроков.");
            }
        }
    }
    public static void advanced(int count, Scanner sc) {
        int[] speedOfPlayer = new int[3];
        System.out.println("Введите скорость первого игрока");
        speedOfPlayer[0] = sc.nextInt();
        System.out.println("Введите скорость второго игрока");
        speedOfPlayer[1] = sc.nextInt();
        System.out.println("Введите скорость третьего игрока");
        speedOfPlayer[2] = sc.nextInt();
        System.out.println("Горит зелёный свет? Да/Нет:");
        String light = sc.next();
        if (light.equals("да") || light.equals("Да") || light.equals("lf") || light.equals("yes")) {
            System.out.println("Все игроки проходят!");
        } else if (light.equals("нет") || light.equals("Нет") || light.equals("ytn") || light.equals("no")) {
            for (int i = 0; i < 3; i++) {
                if (speedOfPlayer[i] > 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Все игроки стоят. Молодцы");
            } else if (count == 1) {
                System.out.println("Выбыл " + count + " игрок.");
            } else {
                System.out.println("Выбыло " + count + "-е игроков.");
            }
        }
    }
}
*/