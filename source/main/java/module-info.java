module com.avereon.marea {

	// Compile-time only
	requires static lombok;

	// Both compile-time and run-time
	requires com.avereon.curve;
	requires com.avereon.zevra;

	requires java.logging;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires com.avereon.zerra;

	//requires org.assertj.core;
	//requires org.junit.jupiter.api;
	//requires org.testfx;
	//requires org.testfx.junit5;

	opens com.acromere.marea.fx to javafx.graphics;

	exports com.acromere.marea;
	opens com.acromere.marea to javafx.graphics;
	exports com.acromere.marea.geom;
	opens com.acromere.marea.geom to javafx.graphics;
	exports com.acromere.marea.fx;
}
