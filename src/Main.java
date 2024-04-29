import entities.Cliente;
import entities.Conta;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rn = new Random();
        Random ag = new Random();


        System.out.println("Olá! seja bem vindo ao DIO FINANCES");
        System.out.println("para dar-mos inicio digite seu nome logo a baixo 👇");
        System.out.print("Digite seu nome :");
        String nome = sc.nextLine();
        System.out.print("Digite seu sobrenome :");
        String sobrenome = sc.nextLine();
        System.out.print("Digite sua data de nascimento (ex:00-00-00) :");
        String dataNascimento = sc.next();
        if(dataNascimento.contains("-") && dataNascimento.length() == 8){
            Integer numero  = rn.nextInt(9999);
            Integer agencia  = rn.nextInt(999);
            Cliente cliente = new Cliente(nome,sobrenome,dataNascimento);
            Conta conta = new Conta(numero,agencia.toString(),cliente);
            System.out.println(conta);
        }else{
            System.out.println("errado");
        }



    }
}