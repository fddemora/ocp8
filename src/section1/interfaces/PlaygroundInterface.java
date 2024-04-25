package section1.interfaces;

/**
 * public interface - access modifier is not implicit
 * implicit public abstract test1 method
 * methods are required to be implemented as public
 */

public interface PlaygroundInterface {
	void test1();
	static void test2() {
		int x = 0;
		System.out.print(x);
	}
}

