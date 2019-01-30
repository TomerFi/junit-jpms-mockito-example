package bar;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BarTest {

	@Mock
	private Supplier<String> testSupplier;

	@Test
	void empty() {
		var foo = new Foo();
		when(testSupplier.get()).thenReturn("test");

		foo.returnTest(testSupplier);

		verify(testSupplier).get();
	}

}
