import java.util.Scanner;
public class test{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in,"MS932");
        System.out.println("VScode テスト");
        System.out.println("入力してください");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        scanner.close();
    }
}