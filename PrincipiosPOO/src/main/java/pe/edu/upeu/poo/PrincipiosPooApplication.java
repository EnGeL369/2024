package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Personas;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
                Personas person=new Personas();
                person.setNombre("David");
                person.edad=37;
                person.setEdad(36);
                person.saludo();
                
                
                System.out.println("yo soy "+person.getNombre()+" y tengo "+person.getEdad()+" años");
	}

}
