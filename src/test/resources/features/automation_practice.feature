# language: es
# author: PiterRuiz

Característica: Envío de formulario de contacto
  Como usuario del sitio web
  Quiero poder enviar mensajes a través del formulario de contacto
  Para obtener soporte y resolver mis inquietudes

  @formulario_contacto
  Escenario: Envío exitoso de formulario de contacto con archivo adjunto
    Dado que el usuario se encuentra en la página "Contact us"
    Cuando complete los campos del formulario:
      | subjectHeading   | emailAddress               | orderReference | message         | attachFile |
      | Customer service | evensoftla21num3@gmail.com | 3090           | Prueba numero 2 | 3.png      |
    Entonces el sistema debe mostrar el mensaje "Your message has been successfully sent to our team."
    Y el usuario debe tener la opción de regresar al "Home"

  @formulario_contacto
  Escenario: Envío exitoso de formulario de contacto sin archivo adjunto
    Dado que el usuario se encuentra en la página "Contact us"
    Cuando complete los campos del formulario:
      | subjectHeading | emailAddress           | orderReference | message         | attachFile |
      | Customer service | evensoftla21num3@gmail.com | 3090           | Prueba numero 2 |            |
    Entonces el sistema debe mostrar el mensaje "Your message has been successfully sent to our team."
    Y el usuario debe tener la opción de regresar al "Home"

  @formulario_contacto
  Escenario: Error de envio de formulario de contacto sin correo
    Dado que el usuario se encuentra en la página "Contact us"
    Cuando complete los campos del formulario:
      | subjectHeading   | emailAddress | orderReference | message         | attachFile |
      | Customer service |              | 3090           | Prueba numero 2 |            |
    Entonces el sistema debe mostrar el mensaje "There is 1 error Invalid email address"
    Y el usuario debe tener la opción de regresar al "Home"