public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primeArr = new boolean[n+1];
        for (int i=2; i<primeArr.length; i++)
            primeArr[i] = true;
        for (int p=0; p<Math.sqrt(n)+1; p++) {
            if (primeArr[p]){
                for (int k=p+1; k<primeArr.length; k++)
                    if (k%p==0)
                        primeArr[k] = false;
            }     
        }
        int sum = 0;
        for (int l=0; l<primeArr.length; l++){
            if (primeArr[l]){
                sum++;
                System.out.println("" + l);
            }
        }
            System.out.println("There are "+sum+" primes between 2 and "+n+" ("+(sum*100)/n+"% are primes)");
    }
}