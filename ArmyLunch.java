import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArmyLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] soldiers = scanner.nextLine().split(" ");
        List<String> optimizedOrder = optimizeSoldierOrder(soldiers);
        for (String soldier : optimizedOrder) {
            System.out.print(soldier + " ");
        }
    }

    public static List<String> optimizeSoldierOrder(String[] soldiers) {
        List<String> sergeants = new ArrayList<>();
        List<String> corporals = new ArrayList<>();
        List<String> privates = new ArrayList<>();

        for (String soldier : soldiers) {
            char rank = soldier.charAt(0);
            int number = Integer.parseInt(soldier.substring(1));
            switch (rank) {
                case 'S':
                    sergeants.add(soldier);
                    break;
                case 'C':
                    corporals.add(soldier);
                    break;
                case 'P':
                    privates.add(soldier);
                    break;
            }
        }
        List<String> optimizedOrder = new ArrayList<>();
        optimizedOrder.addAll(sergeants);
        optimizedOrder.addAll(corporals);
        optimizedOrder.addAll(privates);
        return optimizedOrder;
    }
}