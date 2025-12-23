package com.thread.join;

public class SampleThread extends Thread{
    
   public void run(){
       for(int i=0; i<10; i++){
           try{
               Thread.sleep(10);
           } catch(Exception ex){}
       }
       MyThreadJoin.names.add(getName());
   }
}