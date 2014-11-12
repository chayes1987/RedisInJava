import redis.clients.jedis.Jedis;

public class Digester {
    public static void main(String[] args) {
        Jedis redis = new Jedis("localhost");
        System.out.println("Waiting for items...");

        while(true)
            System.out.println(redis.brpop(300, "list"));
    }
}
