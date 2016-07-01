
package moviemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collection;



public class MovieManager {

    public static void main(String[] args) {
        try {
            File f = new File("collection.txt");
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while((line = br.readLine()) != null) {
                list.add(line);
            }
            ArrayList<Album> albums = new ArrayList<Album>();
            ArrayList<Movie> movies = new ArrayList<Movie>();
            for(int i = 0; i < list.size(); i += 4) {
                String temp = list.get(i);
                if(temp.equals("Album")) {
                    albums.add(new Album(list.get(i + 1), list.get(i + 2), list.get(i + 3)));
                }
                else {
                    movies.add(new Movie(list.get(i + 1), list.get(i + 2), list.get(i + 3)));
                }
            }
            Collections.sort(albums);
            Collections.sort(movies);
            
            int choice = -1;
            Scanner s = new Scanner(System.in);
            while(choice != 4) {
                System.out.println();System.out.println();
                System.out.println("1. Search");
                System.out.println("2. Add Media Item");
                System.out.println("3. Delete Media Item");
                System.out.println("4. Exit");
                System.out.println();
                System.out.println("What would you like to do? (type the number and hit enter)");
                choice = Integer.parseInt(s.nextLine());
                if(choice == 1) {
                    System.out.println();
                    System.out.println("1. Movie");
                    System.out.println("2. Album");
                    System.out.println();
                    System.out.println("Which would you like to search for?");
                    int temp = Integer.parseInt(s.nextLine());
                    if(temp == 1) {
                        System.out.println();
                        System.out.println("1. Title");
                        System.out.println("2. Year");
                        System.out.println("3. Media Format");
                        System.out.println();
                        System.out.println("Which would you like to search by?");
                        int temp2 = Integer.parseInt(s.nextLine());
                        if(temp2 == 1) {
                            System.out.println();
                            System.out.println("Enter the title");
                            String t = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(movies.get(i).getTitle().equals(t)) {
                        
                                    Movie tempMo = movies.get(i);
                                    String title = tempMo.getTitle();
                                    String year = tempMo.getYear();
                                    String media = tempMo.getMediaType();
                                    System.out.println(title + " " + year + " " + media);
                                    
                                    
                                    System.out.println();                                   
                                }
                            }
                        }
                        else if(temp2 == 2) {
                            System.out.println();
                            System.out.println("Enter the year");
                            String y = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(movies.get(i).getYear().equals(y)) {
                                    Movie tempMo = movies.get(i);
                                    String title = tempMo.getTitle();
                                    String year = tempMo.getYear();
                                    String media = tempMo.getMediaType();
                                    System.out.println(title + " " + year + " " + media);
                                    System.out.println();
                                }
                            }
                        }
                        else if(temp2 == 3) {
                            System.out.println();
                            System.out.println("Enter the media format");
                            String m = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(movies.get(i).getMediaType().equals(m)) {
                                    Movie tempMo = movies.get(i);
                                    String title = tempMo.getTitle();
                                    String year = tempMo.getYear();
                                    String media = tempMo.getMediaType();
                                    System.out.println(title + " " + year + " " + media);
                                    System.out.println();
                                }
                            }
                        }
                        else {
                            System.out.println("Incorrect option");
                        }
                    }
                    else if(temp == 2) {
                        System.out.println();
                        System.out.println("1. Artist");
                        System.out.println("2. Year");
                        System.out.println("3. Album");
                        System.out.println();
                        System.out.println("Which would you like to search by?");
                        int temp3 = Integer.parseInt(s.nextLine());
                        if(temp3 == 1) {
                            System.out.println();
                            System.out.println("Enter the artist");
                            String a = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(albums.get(i).getArtist().equals(a)) {
                                    Album tempAl = albums.get(i);
                                    String artist = tempAl.getArtist();
                                    String year = tempAl.getYear();
                                    String title = tempAl.getTitle();
                                    System.out.println(artist + " " + year + " " + title);
                                    System.out.println();
                                }
                            }
                        }
                        else if(temp3 == 2) {
                            System.out.println();
                            System.out.println("Enter the year");
                            String y = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(albums.get(i).getYear().equals(y)) {
                                    Album tempAl = albums.get(i);
                                    String artist = tempAl.getArtist();
                                    String year = tempAl.getYear();
                                    String title = tempAl.getTitle();
                                    System.out.println(artist + " " + year + " " + title);
                                    System.out.println();
                                }
                            }
                        }
                        else if(temp3 == 3) {
                            System.out.println();
                            System.out.println("Enter album name");
                            String n = s.nextLine();
                            for(int i = 0; i < albums.size(); i++) {
                                if(albums.get(i).getTitle().equals(n)) {
                                    Album tempAl = albums.get(i);
                                    String artist = tempAl.getArtist();
                                    String year = tempAl.getYear();
                                    String title = tempAl.getTitle();
                                    System.out.println(artist + " " + year + " " + title);
                                    System.out.println();
                                }
                            }
                        }
                        else {
                            System.out.println("Incorrect option");
                        }
                    }
                    else {
                        System.out.println("Incorrect option");
                    }
                }
                else if(choice == 2) {
                    System.out.println();
                    System.out.println("1. Movie");
                    System.out.println("2. Album");
                    System.out.println();
                    System.out.println("Which would you like to add?");
                    int temp = Integer.parseInt(s.nextLine());
                    if(temp == 1) {
                        System.out.println();
                        System.out.println("Enter movie title");
                        String t = s.nextLine();
                        System.out.println();
                        System.out.println("Enter release year");
                        String y = s.nextLine();
                        System.out.println();
                        System.out.println("Enter media type (DVD, VHS, Blue-ray, Laserdisc)");
                        String m =s.nextLine();
                        Movie mov = new Movie(t, y, m);
                        movies.add(mov);
                        Collections.sort(movies);
                    }
                    else if(temp == 2) {
                        System.out.println();
                        System.out.println("Enter album artist");
                        String a = s.nextLine();
                        System.out.println();
                        System.out.println("Enter album title");
                        String t = s.nextLine();
                        System.out.println();
                        System.out.println("Enter release year");
                        String y =s.nextLine();
                        Album alb = new Album(a, t, y);
                        albums.add(alb);
                        Collections.sort(albums);
                    }
                    else {
                        System.out.println("incorrect Number");
                    }
                }
                else if(choice == 3) {
                    System.out.println();
                    for(int i = 0; i < albums.size(); i++) {
                        Album tempAl = albums.get(i);
                        String artist = tempAl.getArtist();
                        String year = tempAl.getYear();
                        String title = tempAl.getTitle();
                        System.out.println(i + ". " + artist + " " + year + " " + title);
                    }
                    for(int j = 0; j < movies.size(); j++) {
                        Movie tempMo = movies.get(j);
                        String title = tempMo.getTitle();
                        String year = tempMo.getYear();
                        String media = tempMo.getMediaType();
                        System.out.println((j + albums.size()) + ". " + title + " " + year + " " + media);
                    }
                    System.out.println();
                    System.out.println("Which would you like to delete? (enter the number)");
                    int temp = Integer.parseInt(s.nextLine());
                    if(temp < albums.size() && temp >= 0) {
                        albums.remove(temp);
                    }
                    else if(temp < (albums.size() + movies.size()) && temp >= 0) {
                        movies.remove(temp - albums.size());
                    }
                    Collections.sort(albums);
                    Collections.sort(movies);
                    System.out.println();
                    for(int i = 0; i < albums.size(); i++) {
                        Album tempAl = albums.get(i);
                        String artist = tempAl.getArtist();
                        String year = tempAl.getYear();
                        String title = tempAl.getTitle();
                        System.out.println(i + ". " + artist + " " + year + " " + title);
                    }
                    for(int j = 0; j < movies.size(); j++) {
                        Movie tempMo = movies.get(j);
                        String title = tempMo.getTitle();
                        String year = tempMo.getYear();
                        String media = tempMo.getMediaType();
                        System.out.println((j + albums.size()) + ". " + title + " " + year + " " + media);
                    }
                }
                else {
                    choice = 4;
                }
            }
            System.exit(0);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
