open module bar {
	requires org.junit.jupiter.api;
	requires org.mockito;
	requires mockito.junit.jupiter; // automatic module name derived from jar file name
	requires net.bytebuddy;
}
