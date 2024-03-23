package com.example.effectivekotlin.item01;

public class CheckedExceptionRunner {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        try {
            // @Throws 없으면 컴파일 시점에 예외 확인 X
            account.withdraw(50.0);
        } catch (InsufficientFunds e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account.getBalance());
    }
}
