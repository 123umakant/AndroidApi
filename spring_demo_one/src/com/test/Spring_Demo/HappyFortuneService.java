package com.test.Spring_Demo;

public class HappyFortuneService  implements FortuneService{
	
	@Override
	public String getFortune()
	{
		return "Today Is My Lucky Day";
		
	}
	
}
