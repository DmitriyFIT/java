import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    String regex = "[0-9]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    int sum = 0;
    while (matcher.find()) {
      sum += Integer.parseInt(matcher.group());
    }
    return sum;
  }
}