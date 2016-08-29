public class Main {

    public static void main(String[] args) {
        Music music = new Music();
        music.albumTitle = "Ignition";
        music.artistName = "The Offspring";
        music.genre = "Punk Rock";
        music.trackNum = 10;
        music.rating = 9.9;

        Authors author = new Authors();
        author.authorName = "Larry Correia";
        author.publishedWorks[1] = "Monster Hunter Vendetta" ;
        //author.publishedWorks[1] = ;
        author.isLiving = true;

        Books book = new Books();
        book.title = "Monster Hunter International;";
        book.lengthPgs = 347;
        book.pubDate = "07/25/2009";

        Films film = new Films();
        film.director = "Mel Brooks";
        film.lengthMins = 127;
        film.rating = 10.0;
        film.title = "SpaceBalls";
        film.releaseDate = "06/24/1987";

        Projects project = new Projects();
        project.dueDate = "11/12/16";
        project.projName = "Final Project";
        project.isFinished = false;

        System.out.println(author.publishedWorks[0]);


    }
}
