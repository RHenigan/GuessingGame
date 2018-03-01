import java.util.Random;

public class Jar{
  
  private String item = "";
  private int max = 0;
  private int fill = 0;
 
  public Jar(String item, int max){
    this.item = item;
    this.max = max;
    fillJar();
  }
  
  private void fillJar() {
    Random random = new Random();
    fill = random.nextInt(max) + 1;
  }
  
  public String getItem() {
    return item;
  }
  
  public int getMax() {
    return max;
  }
  
  public int getFill() {
    return fill;
  }
}