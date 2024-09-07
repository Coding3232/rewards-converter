public class RewardValue {

  private double cash;

  private double CONVERSION = 0.0035;

  public RewardValue(double cash) {
    this.cash = cash;
  }

  public RewardValue(int miles) {
    this.cash = to_cash(miles);
  }

  public double getCashValue() {
    return this.cash;
  }

  public int getMilesValue() {
    return to_miles(this.cash);
  }

  private double to_cash(double cash) {
    return cash * CONVERSION;
  }

  private int to_miles(double miles) {
    return (int)(miles / CONVERSION);
  }


}
