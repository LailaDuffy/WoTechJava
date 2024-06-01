public class Fork {
  public int spikeCount;
  public String material;
  public double sharpness = 10; // 10 is max, 0 is dull

  public Fork(int spikeCount, String material) {
    this.spikeCount = spikeCount;
    this.material = material;
  }

  public void stab() {
    this.sharpness = sharpness - 0.1D;    
  }
}
