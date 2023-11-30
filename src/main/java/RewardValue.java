public class RewardValue {

  private double cash;
  private double miles;


  public RewardValue(double cash) {
    this.cash = cash;
  }

  public RewardValue(int miles) {
    this.cash = miles;
  }

  public RewardValue(double cash, int miles) {
    this.cash = cash;
    this.miles = miles;
  }

  public double getCashValue() {
    return cash;
  }

  public double getMilesValue() {
    return miles;
  }
}
