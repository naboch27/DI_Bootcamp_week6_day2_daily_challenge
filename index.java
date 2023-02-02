import java.util.Random;

class CoinFlip {

    public static void main(String[] args) {
    // create a new random number generator object
    Random rand = new Random();

    // pick a random number between 0 and 1:
    int n = rand.nextInt(2);
    if(n==0){
      System.out.println("Heads " + n);
  }else 
  if(n==1)
  {
    System.out.println("Tails " + n);
  }
}
}