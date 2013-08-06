package book.chapter11;

import java.util.Map;

import org.openqa.grid.internal.listeners.Prioritizer;

public class CustomPrioritizer implements Prioritizer {

  public int compareTo(Map<String, Object> a, Map<String, Object> b) {
    boolean aImportant = a.get("_important") == null ? false
        : Boolean.parseBoolean(a.get("_important").toString());
    boolean bImportant = b.get("_important") == null ? false
        : Boolean.parseBoolean(b.get("_important").toString());
    if (aImportant == bImportant) {
      return 0;
    }
    if (aImportant && !bImportant) {
      return -1;
    } else {
      return 1;
    }
  }

}