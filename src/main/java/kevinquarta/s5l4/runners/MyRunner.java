package kevinquarta.s5l4.runners;


import kevinquarta.s5l4.repositories.DivisioneMenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {

    private DivisioneMenuRepository divisioneMenuRepository;
    AnnotationConfigApplicationContext ctx = AnnotationConfigApplicationContext(s5l4.class);



}
