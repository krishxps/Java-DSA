public class func {
    public static void main(String[] args) {
        int first = 10;
        int second = 12;
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            sum = sum(first,second);
            first++;
            second++;
            System.out.println("Int I: "+i+", Sum :"+ sum);
        }
        
    }

    public static int sum(int a, int b) {
        return (a + b);
    }
    
}
