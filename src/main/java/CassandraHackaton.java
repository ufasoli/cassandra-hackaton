import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author ulf
 */
@EnableAutoConfiguration
public class CassandraHackaton {

    public static void main(String[] args) {
        SpringApplication.run(CassandraHackaton.class, args);
    }
}
