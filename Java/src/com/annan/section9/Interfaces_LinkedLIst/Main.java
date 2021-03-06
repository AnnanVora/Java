package com.annan.section9.Interfaces_LinkedLIst;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High Ball Shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playlist = new Vector<>();

        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed King", playlist); // Does not exist
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist); // Does not exists

        play(playlist, false);
    }

    private static void play(List<Song> playlist, boolean shuffle) {

        boolean quit = false;

        if (!shuffle) {

            boolean goingForward = true;

            ListIterator<Song> listIterator = playlist.listIterator();
            if (playlist.size() == 0) {
                System.out.println("No songs in playlist");
            } else {
                System.out.println("Now playing -> " + listIterator.next().toString());
            }
            printMenu(false);

            while (!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0: // To quit the playlist
                        System.out.println("Playlist complete");
                        quit = true;
                        break;
                    case 1: // To go forward

                        if (!goingForward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            goingForward = true;
                        }

                        if (listIterator.hasNext()) {
                            System.out.println("Now playing -> " + listIterator.next().toString());
                        } else {
                            System.out.println("You have reached the end of the list");
                            goingForward = false;
                        }
                        break;
                    case 2: // To go backward

                        if (goingForward) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            goingForward = false;
                        }

                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing -> " + listIterator.previous().toString());
                        } else {
                            System.out.println("You are at the beginning of the playlist");
                            goingForward = true;
                        }
                        break;
                    case 3:

                        if (goingForward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now replaying -> " + listIterator.previous().toString());
                                goingForward = false;
                            } else {
                                System.out.println("You are at the start of the list");
                            }
                        } else {
                            if (listIterator.hasNext()) {
                                System.out.println("Now replaying -> " + listIterator.next().toString());
                                goingForward = true;
                            } else {
                                System.out.println("You are at the end of the list");
                            }
                        }
                        break;
                    case 4: // To print the list of songs in the playlist
                        printList(playlist);
                        break;
                    case 5: // To print the options to choose from
                        printMenu(false);
                        break;
                    case 6: // To remove the current song from the playlist
                        if (playlist.size() > 0) {
                            listIterator.remove();
                            if (listIterator.hasNext()) {
                                System.out.println("Now playing -> " + listIterator.next().toString());
                            } else if (listIterator.hasPrevious()) {
                                System.out.println("Now playing -> " + listIterator.previous().toString());
                            }
                        }
                        break;
                }
            }
        } else {
            int randomSong = (int) (Math.random() * playlist.size());

            if (playlist.size() == 0) {
                System.out.println("No songs in playlist");
            } else {
                System.out.println("Now playing -> " + playlist.get(randomSong).toString());
            }
            printMenu(true);

            while (!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0: // To quit the playlist
                        System.out.println("Playlist complete");
                        quit = true;
                        break;
                    case 1: // To play the next song
                        randomSong = (int) (Math.random() * playlist.size());
                        System.out.println("Now playing -> " + playlist.get(randomSong).toString());
                        break;
                    case 2: // To print the options to choose from
                        printMenu(true);
                        break;
                    case 3: // To print the list of songs in the playlist
                        printList(playlist);
                        break;
                }
            }
        }
    }

    private static void printMenu(boolean isShuffle) {

        if (!isShuffle) {
            System.out.println("Available options: ");
            System.out.println("Press 0 - To quit the playlist");
            System.out.println("Press 1 - To play the next song");
            System.out.println("Press 2 - To play the previous song");
            System.out.println("Press 3 - To replay the song");
            System.out.println("Press 4 - To print the list of songs in the playlist");
            System.out.println("Press 5 - To print the options to choose from");
            System.out.println("Press 6 - To remove the current song from the playlist");
        } else {
            System.out.println("Available options: ");
            System.out.println("Press 0 - To quit the playlist");
            System.out.println("Press 1 - To play the next song");
            System.out.println("Press 2 - To print the options to choose from");
            System.out.println("Press 3 - To remove the current song from the playlist");

        }

    }

    public static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==================================");

    }
}
