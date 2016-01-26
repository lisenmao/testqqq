package com.sishuok.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class async{
    
    @Async
    public void async1(){
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println("async2");
    }
}
