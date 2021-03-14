package squareRoot_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import squareroot.SquareRoot;

class SquareRootTest {

	@Test
	void test() {
		//squareRoot(-1);
		assert SquareRoot.squareRoot(0) == 0;
		assert SquareRoot.squareRoot(9) == 3;
		assert SquareRoot.squareRoot(16) == 4;
		assert SquareRoot.squareRoot(17) == 4;
	}

}
