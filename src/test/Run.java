package test;

import java.io.IOException;

import facebookdesign.BaseTest;
import pom.PomFrame;


	public class Run extends BaseTest
	{
		@org.testng.annotations.Test
		public void enter() throws IOException
		{
			PomFrame input=new PomFrame(driver);
			input.submit();
		}
		
		
		
	}


