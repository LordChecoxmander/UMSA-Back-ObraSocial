package config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "API de Almedin",
                version = "1.0.1",
                contact = @Contact(
                        name = "Santiago Cecconato",
                        email = "santycheco1@gmail.com"
                ),
                description =  "##### Contactos Adicionales\n" +
                        "  - Nombre: Madelaine Di Lauro\n" +
                        "  - Email: madilauro@alumno.unlam.edu.ar\n"
        )
)
@ApplicationPath("/api")
public class SwaggerConfig extends Application {
}
