public class linearSearch {
    public static void main(String[] args) {
        String menu[] = {"dosa","bhaji","pav","bhaji pav","samosa", "chineese noodles","dal bhat", "kadhi", "chana"};
        String key = "pav";
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
            if(menu[i] == key){
                idx = i;
                loopFlag++;
            }
        }        
        return idx;
    }
}
