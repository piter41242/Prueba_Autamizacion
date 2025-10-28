Proyecto de Automatización - Formulario de Contacto
Descripción del Proyecto
Este proyecto de automatización está diseñado para realizar pruebas integrales sobre el formulario de contacto del sitio web Automation Practice (http://www.automationpractice.pl/index.php?controller=contact). La solución implementa un framework de pruebas basado en Behavior-Driven Development (BDD) que valida el comportamiento del formulario bajo diferentes escenarios de prueba.

Propósito y Alcance
Objetivo Principal
Automatizar las pruebas del formulario de contacto para garantizar su correcto funcionamiento, validando mensajes de éxito y error según los diferentes casos de prueba definidos en las historias de usuario.

Alcance del Proyecto
Validación de envío exitoso de formulario con archivo adjunto

Validación de envío exitoso de formulario sin archivo adjunto

Manejo de errores en campos obligatorios (email)

Pruebas de regresión del formulario de contacto

Framework BDD con Gherkin para casos legibles

Generación de reportes de ejecución

Stack Tecnológico
Componente	Versión	Propósito
IntelliJ IDEA	3.4.1	IDE de desarrollo principal
SDK	24	Kit de desarrollo de software
Gradle	15	Sistema de construcción y gestión de dependencias
Selenium WebDriver	-	Automatización web y interacción con navegador
Cucumber	-	Framework BDD para pruebas de aceptación
Gherkin	-	Lenguaje para definir casos de prueba
Java	8+	Lenguaje de programación base
# Estructura del Proyecto


Configuración del Entorno
Prerrequisitos
IntelliJ IDEA 3.4.1 instalado y configurado

SDK 24 configurado en la estructura del proyecto

Gradle 15 como sistema de construcción

Java 8+ instalado en el sistema

Navegador Chrome/Firefox para ejecución de pruebas

Configuración del Proyecto
bash
# Clonar el repositorio del proyecto
git clone https://github.com/tu-usuario/Prueba_Autamizacion.git

# Navegar al directorio del proyecto
cd Prueba_Autamizacion

# Importar en IntelliJ como proyecto Gradle
# File > Open > Seleccionar build.gradle

# Configurar SDK 24
# File > Project Structure > Project SDK > Seleccionar SDK 24

# Sincronizar dependencias de Gradle
./gradlew build --refresh-dependencies
Ejecución de Pruebas
Comandos de Ejecución
bash
# Ejecutar todas las pruebas
./gradlew test

# Ejecutar escenarios específicos por tag
./gradlew test -Dcucumber.options="--tags @formulario_contacto"

# Ejecutar con reportes detallados
./gradlew test -Dcucumber.options="--plugin pretty"

# Limpiar y reconstruir
./gradlew clean test
Comandos Git para el Proyecto
bash
# Verificar estado del repositorio
git status

# Agregar cambios al staging
git add .

# Hacer commit de los cambios
git commit -m "feat: agregar pruebas de formulario de contacto"

# Subir cambios al repositorio remoto
git push origin dev/YonRuiz

# Crear nueva rama para features
git checkout -b feature/nueva-funcionalidad
Criterios de Validación
Validaciones de Éxito
Mensaje de confirmación: "Your message has been successfully sent to our team."

Opción de regresar al Home disponible

Formulario se envía correctamente

Archivos adjuntos se procesan (cuando aplica)

Validaciones de Error
Mensaje de error: "There is 1 error Invalid email address"

Campos obligatorios validados apropiadamente

Usuario mantiene capacidad de navegación

Arquitectura del Framework
Patrón BDD con Cucumber
Features: Archivos .feature con escenarios en Gherkin

Step Definitions: Implementación Java de los pasos

Page Objects: Patrón para manejo de elementos web

Test Runner: Configuración de ejecución de Cucumber

Manejo de Datos de Prueba
Tablas de datos en escenarios Gherkin

Datos drive para múltiples casos

Manejo de archivos adjuntos

Flujo de Ejecución
Inicialización: Configuración de WebDriver y navegador

Navegación: Acceso a la página "Contact us"

Ejecución: Compleción de formulario según escenario

Validación: Verificación de mensajes de sistema

Reporte: Generación de resultados y evidencias

Reportes y Evidencias
Reportes Automatizados
Reportes HTML de Cucumber

Screenshots en casos de fallo

Logs de ejecución detallados

Métricas de éxito/fallo

Cobertura de Pruebas

Ramas del Repositorio
Estructura de Ramas
text
main
└── dev/YonRuiz
└── feature/formulario-contacto
Comandos para Gestión de Ramas
bash
# Crear nueva rama desde main
git checkout main
git pull origin main
git checkout -b feature/nueva-feature

# Fusionar rama con main
git checkout main
git merge feature/nueva-feature
git push origin main

# Eliminar rama local y remota
git branch -d feature/nueva-feature
git push origin --delete feature/nueva-feature
Autor
Piter Ruiz - Desarrollador de Automatización

Licencia
Este proyecto es para fines educativos y de práctica de automatización.

Estado del Proyecto: :white_check_mark: COMPLETADO
Última Actualización: Octubre 2024
Branch Actual: dev/YonRuiz