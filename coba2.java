public class LovePattern {
    public static void main(String[] args) {
        // Mencetak tulisan "I LOVE YOU"
        System.out.println("  I LOVE YOU  ");

        // Mencetak garis horizontal atas
        System.out.println("-------------------------");

        // Mencetak garis diagonal
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        // Mencetak garis diagonal terbalik
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("/");
        }

        // Mencetak garis horizontal bawah
        System.out.println("-------------------------");
    }
}
