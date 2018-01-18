import java.util.Scanner;

public class SongTest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);


		Singer frank =new Singer("Frank Sinatra");
		Song song1=new Song  ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
        Song song2=new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );



		Singer Wham =new Singer("Wham!");
		Song song3=new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );


		Singer mariah = new Singer ("Mariah Carey");
		Song song4 = new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );


		Singer chris = new Singer ("Chris Rea");
		Song song4 = new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");

        Singer sia = new Singer ("Sia");
        Song song5 = new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );

        while (true){
			System.out.println("Welcome to our DMST Christmas Music");
			System.out.println("Menu");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.println("Type here:");
		    int choice = scanner.nextInt();

     if (choice==1) {
		 System.out.println("Singer's List:");
	 for(Singer singer: Singer.sin)
          }


if(choice==2){
for(int i=0; i<songs.length; i++){
	if (songs[i].getSinger().equals(singer[j]))


  }
}
else
System.out.println("wrong input");



}

}
}


