public class drawXYZ {
    public static void main(String[] args) {
        drawXYZ(10);
        drawXYZ(5);
        drawXYZ(4);
    }

    public static void drawXYZ(int size) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (count % 3 == 0) {
                    System.out.print("X ");
                } else if (count % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
