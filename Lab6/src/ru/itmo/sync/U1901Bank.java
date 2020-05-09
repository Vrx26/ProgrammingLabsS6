package ru.itmo.sync;

public class U1901Bank {
    int intTo;
    int intFrom = 220;

    synchronized public void calc(int intTransaction, long lngTimeout){
        System.out.println("Current balance(to, from): " + intTo + " " + intFrom + " " + Thread.currentThread().getName());
        intFrom -= intTransaction;

        try{
        Thread.sleep(lngTimeout);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        intTo += intTransaction;
        System.out.println("CurrentBalance(to, from): " + intTo + " " + intFrom + " " + Thread.currentThread().getName());
    }
}
