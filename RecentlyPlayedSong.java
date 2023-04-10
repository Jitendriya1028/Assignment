package Pogram;

public class RecentlyPlayedSong {

	public static void main(String[] args) {
		
		RecentSongs recentSongs = new RecentSongs(3);
		
		recentSongs.addSong("S 1");
		recentSongs.addSong("S 2");
		recentSongs.addSong("S 3");
		recentSongs.addSong("S 4");
		recentSongs.printRecentSongs();
		

	}

}
