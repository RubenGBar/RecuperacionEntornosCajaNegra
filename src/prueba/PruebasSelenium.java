package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class PruebasSelenium {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new FirefoxDriver();
		
	}

	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Correcto
        WebElement loginCorrecto = driver1.findElement(By.id("login"));
        String textoLogin = loginCorrecto.getText();
        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}

	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ru");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
        boolean textoError = errorUsuario.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test3() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123&");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
        boolean textoError = errorUsuario.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test4() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Rub");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorUsuario = driver1.findElement(By.id("errorUsuario"));
        boolean textoError = errorUsuario.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test5() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Rube");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Correcto
        WebElement loginCorrecto = driver1.findElement(By.id("login"));
        String textoLogin = loginCorrecto.getText();
        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}
	
	@Test
	void test6() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben");
        passwordBox.sendKeys("Contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Correcto
        WebElement loginCorrecto = driver1.findElement(By.id("login"));
        String textoLogin = loginCorrecto.getText();
        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}
	
	@Test
	void test7() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Con");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test8() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("contra123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test9() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("CONTRA123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Contrasenia!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Contra123");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Con123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Incorrecto
        WebElement errorPassword = driver1.findElement(By.id("errorPassword"));
        boolean textoError = errorPassword.isDisplayed();
        assertTrue(textoError);
        
	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Cont123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Correcto
        WebElement loginCorrecto = driver1.findElement(By.id("login"));
        String textoLogin = loginCorrecto.getText();
        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}
	
	@Test
	void test14() {
		driver1.get("https://elenarivero.github.io/examen/index.html");
		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
        WebElement passwordBox = driver1.findElement(By.id("password"));
        
        usuarioBox.sendKeys("Ruben123");
        passwordBox.sendKeys("Contr123!");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        // Resultado esperado: Login Correcto
        WebElement loginCorrecto = driver1.findElement(By.id("login"));
        String textoLogin = loginCorrecto.getText();
        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
