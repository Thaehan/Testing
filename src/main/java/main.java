import java.util.*;

public class main {
  public static void main(String args[]) {
    System.out.println(vendingMachine(null, null));
  }

  // Số tiền đã được chia cho 1000 để đơn giản hóa code VD: 10.000đ => 10
  public static String vendingMachine(String selection, Integer money) {
    switch (selection) {
      case "bimbim":
        if (money == 10) {
          return "Trả về bim bim";
        } else if (money > 10) {
          return "Trả về bim bim và trả về tiền thừa";
        }
        return "Trả về tiền";
      case "nuocngot":
        if (money == 15) {
          return "Trả về nước ngọt";
        } else if (money > 15) {
          return "Trả về nước ngọt và trả về tiền thừa";
        }
        return "Trả về tiền";
      case "myhop":
        if (money == 20) {
          return "Trả về mỳ hộp";
        } else if (money > 20) {
          return "Trả về mỳ hộp và trả về tiền thừa";
        }
        return "Trả về tiền thừa";
      default:
        return "Trả về tiền thừa";
    }
  }
}
