package com.bloc.generics;

import com.bloc.generics.things.*;

import java.lang.Object;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

        toyBox.addToy(new Toy<Object>("Generic Toy"));

/*
        toyBox.addToy(new ActionFigure<Toy>());
        toyBox.addToy(new ActionFigure<Toy>("Batman"));
        toyBox.addToy(new ActionFigure<Object>("Batman"));
        toyBox.addToy(new ActionFigure((Toy) <Object>("Batman")));
        toyBox.addToy(new ActionFigure((Object) <Toy>("Batman")));
*/

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
