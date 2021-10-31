public class Logic {
    static boolean isGreenLight = false;
    public static String answer (int p) {
        String msg = "Игрок выбыл.";
        if (isGreenLight == false) {
            if (p > 0){
                System.out.println(msg);
            } else if (p < 0) {
                System.out.println(msg);
            } else if (p == 0) {
                msg = "Игрок не выбыл.";
                System.out.println(msg);
            }
        }
        return msg;
    }
}
