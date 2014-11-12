import redis.clients.jedis.Jedis;
import java.util.Scanner;

public class Pusher {
    public static void main(String[] args) {
        Jedis redis = new Jedis("localhost");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an item...enter quit to finish");
        String item = input.nextLine();

        while(!item.equals("quit")){
            redis.lpush("list", item);
            System.out.println("Enter an item...enter quit to finish");
            item = input.nextLine();
        }

    }
}
