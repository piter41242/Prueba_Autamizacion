# Proyecto de Automatización - Formulario de Contacto

## Objetivo
Automatizar pruebas del formulario de contacto de Automation Practice mediante framework BDD con Cucumber y Selenium.

## Alcance
- Validación de envíos exitosos (con/sin archivos)
- Manejo de errores en campos obligatorios
- Pruebas de regresión automatizadas
- Generación de reportes de ejecución

## Tecnologías
- IntelliJ IDEA 3.4.1
- SDK 24
- Gradle 15
- Selenium WebDriver
- Cucumber
- Java 8+

## Estructura
![Estructura.png](src/test/resources/files/Estructura.png)
## Escenarios
![Escenarios.png](src/test/resources/files/Escenarios.png)
### Envío exitoso con archivo
- Dado: Usuario en página "Contact us"
- Cuando: Completa formulario con datos válidos y archivo
- Entonces: Muestra mensaje de éxito

### Error por email faltante
- Dado: Usuario en página "Contact us"
- Cuando: Completa formulario sin email
- Entonces: Muestra error "Invalid email address"
## Repositorio
### https://github.com/piter41242/Prueba_Autamizacion.git
## Comandos
- ./gradlew test
- git add .
- git commit -m "pruebas formulario contacto"
- git push origin dev/YonRuiz

## Validaciones
- Mensajes de éxito/error correctos
- Campos obligatorios validados
- Archivos adjuntos procesados
- Navegación posterior funcional
![Captura1.png](src/test/resources/files/Captura1.png)
![Captura2.png](src/test/resources/files/Captura2.png)
![Captura3.png](src/test/resources/files/Captura3.png)
![Captura4.png](src/test/resources/files/Captura4.png)
**Autor**: Piter Ruiz  
**Estado**: COMPLETADO  
**Branch**: dev/YonRuiz