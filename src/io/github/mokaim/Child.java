package io.github.mokaim;

public class Child {
		Parent field = new Parent() {
			int childField;
			void childMethod() {
				System.out.println("�ڽ� ���");
			}
			
			@Override
			public
			void print() {
				System.out.println("�ڽĿ��� �θ� ���");
			}
		};
		
	}


