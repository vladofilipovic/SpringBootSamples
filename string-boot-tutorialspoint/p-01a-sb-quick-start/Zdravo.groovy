@Controller
class Example {
   @RequestMapping("/")
   @ResponseBody
   public String hello() {
      "Zdravo Spring Boot"
   }
}