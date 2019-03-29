package test.java.com.kata;

import static org.junit.Assert.*;
import main.java.com.kata.FooBar;
import static main.java.com.kata.enumerations.FooBarEnum.*;

import org.junit.Test;

public class FooBarTest {

	private FooBar fooBar = new FooBar();
	
	@Test
	public void should_return_1_when_n_equals_1() {
         assertEquals(fooBar.computeFooBar(1), "1");           
	}
	
	@Test
	public void should_return_2_when_n_equals_2() {
         assertEquals(fooBar.computeFooBar(2), "2");           
	}
	
	@Test
	public void should_return_foo_when_n_equals_3() {
         assertEquals(fooBar.computeFooBar(3), FOO.getLabel());           
	}
	
	@Test
	public void should_return_4_when_n_equals_4() {
         assertEquals(fooBar.computeFooBar(4), "4");           
	}
	
	@Test
	public void should_return_bar_when_n_equals_5() {
         assertEquals(fooBar.computeFooBar(5), BAR.getLabel());           
	}
	
	@Test
	public void should_return_foo_when_n_equals_6() {
         assertEquals(fooBar.computeFooBar(6), FOO.getLabel());           
	}

	@Test
	public void should_return_bar_when_n_equals_10() {
         assertEquals(fooBar.computeFooBar(10), BAR.getLabel());           
	}
	
	@Test
	public void should_return_foobar_when_n_equals_15() {
         assertEquals(fooBar.computeFooBar(15), FOO_BAR.getLabel());           
	}
	
	@Test
	public void should_return_foo_when_n_equals_21() {
         assertEquals(fooBar.computeFooBar(6), FOO.getLabel());           
	}
	
	@Test
	public void should_return_bar_when_n_equals_25() {
         assertEquals(fooBar.computeFooBar(25), BAR.getLabel());           
	}
	
	@Test
	public void should_return_foobar_when_n_equals_30() {
         assertEquals(fooBar.computeFooBar(30), FOO_BAR.getLabel());           
	}
}
