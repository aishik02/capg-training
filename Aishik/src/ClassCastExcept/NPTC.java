package ClassCastExcept;

class A{};
class B extends A{};
class C extends A{};
class D extends C{};

public class NPTC {
	public static void main(String[] args) {
		A a=new D();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
	}
}
