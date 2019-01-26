package com.example.foo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.Supplier;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FooTest {
	@Mock
	private Supplier<String> testSupplier;

	@Test
	void someTest(){
		var foo = new Foo();
		when(testSupplier.get()).thenReturn("test");

		foo.returnTest(testSupplier);

		verify(testSupplier).get();
	}
}
