public class rainWater {
    public static void main(String[] args) {
        int walls[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(water(walls));
    }

    /*
     * calculate left max boundary - array
     * calculate right max boundary - array
     * 
     * loop
     * water level = min(left max bound,right max bound)
     * trapped water = water level - walls[i]  
     */
    public static int water(int walls[]) { // O(n)

        // calculate left max boundary - array
        int n = walls.length;
        int left[] = new int[n];
        left[0] = walls[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], walls[i]);
        }

        // calculate right max boundary - array
        int right[] = new int[n];
        right[n-1] = walls[n -1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], walls[i]);
        }

        int trapped = 0;
        // loop
        for (int i = 0; i < n; i++) {
            //  * water level = min(left max bound,right max bound)
            int waterLevel = Math.min(right[i], left[i]);

            //  * trapped water = water level - walls[i]  
            trapped += waterLevel - walls[i];
        }
        return trapped;
    }
}
