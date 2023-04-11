# Assignment
Code assignment for test
package Pogram;

import java.util.ArrayList;

public class PlayList {

	public static void main(String[] args) {

		
		ArrayList<String> playlist = new ArrayList<>(3);
		playlist.add("S1");
		playlist.add("S2");
		playlist.add("S3");
		
		System.out.println("Recent playlist: "+playlist);
		
		playlist.remove(0);
		playlist.add("S4");
		
		System.out.println("Updated playlist after playing S4: "+playlist);
		
		playlist.remove("S2");
		playlist.add("S2");
		
		System.out.println("Updated playlist after playing S2: "+playlist);
		
		playlist.remove("S3");
		playlist.add("S1");
		
		System.out.println("Updated playlist after playing S1: "+playlist);

	}

}
