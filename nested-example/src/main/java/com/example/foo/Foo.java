package com.example.foo;

import java.util.function.Supplier;

public class Foo {
	public String returnTest(Supplier<String> func){
		return func.get();
	}
}
