package exResolvido2Enums.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exResolvido2Enums.entities.Comments;
import exResolvido2Enums.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("Wow thats awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to New Zeland",
				"I'm going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

		Comments c3 = new Comments("Good night");
		Comments c4 = new Comments("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys",
				"See you tomorrow",5);
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p2);
	}

}
