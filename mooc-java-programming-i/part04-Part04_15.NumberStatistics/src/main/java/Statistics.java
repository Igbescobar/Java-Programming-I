
public class Statistics {
  private int count;
  private int sum;

  public Statistics() {
    this.count = 0;
    this.count = 0;
  }

  public void addNumber(int number) {
    this.sum += number;
    this.count += 1;
  }

  public int getCount() {
    return this.count;
  }

  public int sum() {
    return this.sum;
  }

  public double average() {
    if (count == 0) {
      return 0;
    }
    return (double) sum / count;
  }
}
