package ru.stqa.rft.sandbox;

public class MyFirstProg{
		public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Nick");
	}
		public static void hello(String somebody) {

		System.out.println("Hello, " +somebody +"!");
			Square s = new Square(6);
			//s.d = 5; (строчка закометирована, потому что добавлен конструктор в класс квадрат
			Rectungle y = new Rectungle(5,7);
			Rectungle z = new Rectungle(65, 87);
			System.out.println("square area " +s.d + " equal "+ s.squareArea());
			System.out.println("sqquare of rectungle with sizes " + y.a + " and" + y.b+ " equal "+y.rectangle());
			System.out.println("sqquare of rectungle with sizes  " + z.a + " and " + z.b+ " eqqual "+z.rectangle());
	}
}
