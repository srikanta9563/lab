//MOVIE THEATER MANAGEMENT SYSTEM
import java.util.Scanner;
public class movie {
    String movieName;
    double moviestarttime;
    double movieendtime;
    double movieticketprice;
    public void getmovie(){
        System.out.println("Movie name is - " + movieName);
        System.out.println("Movie start time is- " + moviestarttime);
        System.out.println("Movie end time is - " + movieendtime);
        System.out.println("Movie ticket price -" + movieticketprice);
    }public void setMovie(String movieName,double moviestarttime,double movieendtime,double movieticketprice){
        this.movieName=movieName;
        this.moviestarttime=moviestarttime;
        this.movieendtime=movieendtime;
        this.movieticketprice=movieticketprice;
    }}class MovieTheater{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        movie m=new movie();
        m.setMovie("BRAHMASTRA",11.15,2.15,310);
        m.getmovie();
    }}




