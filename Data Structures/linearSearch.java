import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        String menu[] = {"dosa","bhaji","pav","bhaji pav","samosa", "chineese noodles","dal bhat", "kadhi", "chana"};
        System.out.print("ENTER NAME: ");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        sc.close();

        int index = linear(menu,key);
        if(index != -1){
            System.out.println("Found " + key + " at " + index + " Index.(TOTAL: "+ menu.length+")");
        }else{
            System.out.println("NO ITEM FOUND");
        }
    }

    private static int linear(String[] menu, String key) {
        int idx = -1, loopFlag = 1;
        for (int i = 0; i < menu.length && loopFlag == 1; i++) {
            if(menu[i].equals(key)){
                idx = i;
                loopFlag++;
            }
        }        
        return idx;
    }
}
