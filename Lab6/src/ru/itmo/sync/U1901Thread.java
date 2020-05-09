package ru.itmo.sync;

public class U1901Thread  extends Thread{
    U1901Bank bankWork;
    int intTrans;
    long lngSleep;

    public U1901Thread(U1901Bank bank, int transition, long delay){
        this.bankWork = bank;
        this.intTrans = transition;
        this.lngSleep = delay;
    }

    @Override
    public void run(){
        bankWork.calc(this.intTrans, this.lngSleep);
    }
}
