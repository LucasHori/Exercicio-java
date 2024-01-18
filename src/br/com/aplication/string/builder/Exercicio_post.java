package br.com.aplication.string.builder;

import br.com.aplication.string.builder.entites.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.text.AbstractDocument.Content;

public class Exercicio_post {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"),
				"Traveling to new Zealand",
				"I'm going to visit this worderful country!", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
