import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ZdravoSvete {

    @RequestMapping("/")
    String home() {
        return "Zdravo svete!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZdravoSvete.class, args);
    }

}