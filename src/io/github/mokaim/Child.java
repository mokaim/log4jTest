package io.github.mokaim;

public class Child {
		Parent field = new Parent() {
			int childField;
			void childMethod() {
				System.out.println("자식 출력");
			}
			
			@Override
			public
			void print() {
				System.out.println("자식에서 부모 출력");
			}
		};
		
	}


