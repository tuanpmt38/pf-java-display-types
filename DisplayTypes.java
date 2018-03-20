public class DisplayTypes {
    public static void main(String[] args) {
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square top left");
            System.out.println("3. Draw the square bottom left");
            System.out.println("4. Draw the square bottom right");
            System.out.println("5. Draw the square top right");
            System.out.println("6. Draw the rectangle isosceles:");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the triangle top left:");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Draw the rectangle bottom-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the rectangle bottom-right");
//                    for (int i = 7; i >= 1; i--) {
//                        for (int j = 0; j < i; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                    }
                    break;
                case 5:
                    System.out.println("Draw the rectangle top-right");
//                    for ( int i = 7; i >= 1; i --){
//                        for ( int j = 7; j >= i; j --) System.out.print("* ");
//                        System.out.println();
//                    }
                    break;
                case 6:
                    System.out.println("Draw the rectangle isosceles: ");
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= 7 - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= 2 * i - 1; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
