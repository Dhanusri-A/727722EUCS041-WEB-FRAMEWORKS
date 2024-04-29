package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest{
    public static void main(String[] args) throws Exception{
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String path1 = "http://dbankdemo.com/bank/login";
        driver.get(path1);
        driver.findElement(By.name("username")).sendKeys("S@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("P@ssword12");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        String str = driver.getCurrentUrl();
        if(str.contains("home"))
        System.out.println("Successfully login to home page");
        else
        System.out.println("Login failed");
        
        driver.findElement(By.xpath("//*[@id=\"deposit-menu-item\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"selectedAccount\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"selectedAccount\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("5000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        String check = driver.findElement(By.xpath("//*[@id=\"transactionTable\"]/tbody/tr[1]/td[4]")).getText();
        if(check.contains("5000"))
        System.out.println("Amount added successfully");
        else
        System.out.println("Amount not added");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"withdraw-menu-item\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"selectedAccount\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectedAccount\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("3000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")).click();

        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");
        
        String chwi = driver.findElement(By.xpath("//*[@id=\"transactionTable\"]/tbody/tr[1]/td[4]")).getText();
        if(chwi.contains("3000"))
        System.out.println("Amount withdrawed successfully");
        else
        System.out.println("Amount not withdrawed");
    }
}