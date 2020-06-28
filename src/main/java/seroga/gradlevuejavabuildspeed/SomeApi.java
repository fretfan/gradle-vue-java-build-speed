package seroga.gradlevuejavabuildspeed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeApi {

  @GetMapping("/1")
  public String one() {
    return "1";
  }

}
