package pl.seahawks.vacationes.providers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ItakaProvider {


  private final String BASE_ULR_ITAKA = "https://www.itaka.pl/";


  /*@Bean
     public Document getDocument(){
      return new Document(BASE_ULR_ITAKA);
  }*/
    public void getHomePage() throws IOException {
       Document document = Jsoup.connect(BASE_ULR_ITAKA).get();
       document.select("p").forEach(System.out::println);
    }
}
