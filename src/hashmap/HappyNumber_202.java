package hashmap;

public class HappyNumber_202 {


    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n!=0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while(slow != fast);
        if (slow == 1) return true;
        else return false;
    }

    public boolean isHappy1(int n) {
        int sum = 0;
        int numOfIteration = 0;
        int maxIteration = 50;
        while (n != 1) {
            if (sum >= Integer.MAX_VALUE || numOfIteration >= maxIteration)
                break;
            while (sum != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (sum == 1)
                return true;
            n = sum;
            sum = 0;
            numOfIteration++;
        }
        return false;
    }


    public boolean isHappy2(int n) {
        int powSum = 0;
        int maxIteration = 100;
        int numOfIteration = 0;
        while (powSum != 1) {
            if(powSum >= Integer.MAX_VALUE || numOfIteration >= maxIteration)
                break;
            while (n != 0) {
                int reminder = n % 10;
                powSum += Math.pow(reminder, 2);
                n /= 10;
            }
            if (powSum == 1)
                return true;
            n=powSum;
            powSum=0;
            numOfIteration++;
        }
        return false;
    }

}
