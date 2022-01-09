package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entitie.User;

public class Program {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<User> list = new HashSet<User>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				list.add(new User(fields[0], Date.from(Instant.parse(fields[1]))));
				line = br.readLine();
			}
			
			System.out.println("Total users: "+list.size());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
		
	}

}
