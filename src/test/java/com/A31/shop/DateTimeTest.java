package com.A31.shop;

import java.util.Random;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j2;

//@Log4j2
public class DateTimeTest {

	//@Test
	public void test()  {
		StringBuffer key = new StringBuffer();
        Random rnd = new Random();

        for (int i = 0; i < 6; i++) { // 인증코드 6자리
            key.append((rnd.nextInt(10)));
        }
       //log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+key.toString()); 
	}
	
}
